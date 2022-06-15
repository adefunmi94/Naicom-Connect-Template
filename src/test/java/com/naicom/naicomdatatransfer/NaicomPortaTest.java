package com.naicom.naicomdatatransfer;

import com.naicom.naicomdatatransfer.model.FamilyPlan;
import com.naicom.naicomdatatransfer.service.AttArray;
import com.naicom.naicomdatatransfer.service.DataGroup;
import com.naicom.naicomdatatransfer.service.NaicomConnector;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class NaicomPortaTest {

    @Test
    public void testTocofirmConnectivity(){
//        log.info("I love To see It works {}", );
//
//        AttArray attArray = new AttArray("Test", "34");
//        new AttArray("Best", "23");
//
//        List<AttArray> attArrayList = new ArrayList<>();
//        attArrayList.add(attArray);
//
//        attArrayList.add(new AttArray("Best", "23"));


        FamilyPlan familyPlan = new FamilyPlan();



        NaicomConnector naicomConnector = new NaicomConnector(familyPlan);





//        DataGroup dataGroup = new DataGroup();
//        dataGroup.setGroupName("Basic info");
//        dataGroup.setGroupTag(2);
//        dataGroup.setGroupCount(0);
//        dataGroup.setAttArray(attArrayList);


//        System.out.println("I love To see It works======");
//        String name = "Tope";
//        String value = "58";
//
//        StringBuilder str = new StringBuilder();
//       str.append("\"" ).append("AttArray").append("\"").append(":").append("[").append("{").append("\n ")
//               .append("\"").append("NAME").append("\"").append(":").append("\"").append(name).append("\"").append(",")
//               .append("\n").append("\"").append("VALUE").append("\"").append(":").append("\"").append(value).append("\"").append("},");

        System.out.println("Here We go===="+ naicomConnector);
//        System.out.println("Here We go===="+ dataGroup);
    }

}
