package com.example.soap;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SoapApplicationTests {
    private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

    @LocalServerPort
    private int port = 0;

    @BeforeEach
    public void init() throws Exception {
        marshaller.setPackagesToScan(ClassUtils.getPackageName(GetCountryRequest.class));
        marshaller.afterPropertiesSet();
    }

    @Test
    public void testSendAndReceive1() {
        WebServiceTemplate ws = new WebServiceTemplate(marshaller);
        GetCountryRequest request = new GetCountryRequest();
        request.setName("Spain");

        assertThat(ws.marshalSendAndReceive("http://localhost:"
                + port + "/ws", request) != null);
    }

    @Test
    public void testSendAndReceive2() {
        WebServiceTemplate ws = new WebServiceTemplate(marshaller);
        GetCountryRequest request = new GetCountryRequest();
        request.setName("United Kingdom");

        assertThat(ws.marshalSendAndReceive("http://localhost:"
                + port + "/ws", request) != null);
    }

    @Test
    public void testSendAndReceive3() {
        WebServiceTemplate ws = new WebServiceTemplate(marshaller);
        GetCountryRequest request = new GetCountryRequest();
        request.setName("Poland");

        assertThat(ws.marshalSendAndReceive("http://localhost:"
                + port + "/ws", request) != null);
    }

    @Test
    public void testSendAndReceive4() {
        WebServiceTemplate ws = new WebServiceTemplate(marshaller);
        GetCountryRequest request = new GetCountryRequest();
        request.setName("Kazakhstan");

        assertThat(ws.marshalSendAndReceive("http://localhost:"
                + port + "/ws", request) == null);
    }

}
