package com.naicom.naicomdatatransfer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jayway.jsonpath.internal.filter.ValueNodes;
import com.naicom.naicomdatatransfer.model.FamilyPlan;
import com.naicom.naicomdatatransfer.service.AttArray;
import com.naicom.naicomdatatransfer.service.DataGroup;
import com.naicom.naicomdatatransfer.service.NaicomConnector;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class NaicomPortaTest {

    private final static String  naicomURLTEST= "https://testportal.naicom.gov.ng:8443/api/v1/cp/policy/new";
    private final static String  naicomURLPROD= "https://portal.naicom.gov.ng/api/v1/cp/policy/new";

    private static final HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();


    @Test
    public void testTocofirmConnectivity() throws IOException, InterruptedException {

        FamilyPlan familyPlan = new FamilyPlan();


        NaicomConnector naicomConnector = new NaicomConnector(familyPlan);
        Gson gson = new Gson();
        String payload = gson.toJson(naicomConnector);

        HttpRequest request = HttpRequest.newBuilder(URI.create(naicomURLTEST))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(payload)).build();
        java.net.http.HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println("Here We go===="+ response.body());

        ObjectMapper mapper = new ObjectMapper();

       JsonNode res = mapper.readTree(response.body());

        System.out.println("Here We go===="+ res);
    }

}
