
package com.naicom.naicomdatatransfer.service;



import com.google.gson.annotations.SerializedName;
import com.naicom.naicomdatatransfer.model.FamilyPlan;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class NaicomConnector {

    @SerializedName("DataGroup")
    private List<DataGroup> dataGroups;
    @SerializedName("SID")
    private String sID;
    @SerializedName("Token")
    private String token;
    @SerializedName("Type")
    private String type;

    public NaicomConnector(FamilyPlan familyPlan) {
        sID = "c18c8eea-2235-4f2c-b6f2-7ce26c096988";
        token= "qyGlt3mc2EjqjozBNSIsT7byfOJsCWmI";
        type= "Auto";


        List<AttArray> basicAttArray = new ArrayList<>();
        DataGroup dataGroup =new  DataGroup();
        dataGroup.setGroupName("Basic Info");
        dataGroup.setGroupTag(0);
        dataGroup.setGroupCount(0);
        basicAttArray.add(new AttArray("Type", "304"));
        basicAttArray.add(new AttArray("CoverageStartDate", "7/4/2020 12:00:00 AM"));
        basicAttArray.add(new AttArray("CoverageEndDate", "7/4/2021 12:00:00 AM"));
        basicAttArray.add(new AttArray("PolicyInternalID", "aiico1201"));
        basicAttArray.add(new AttArray("PolicyDescription", "n/a"));
        dataGroup.setAttArray(basicAttArray);

        List<AttArray> detailInfoAttArray= new ArrayList<>();
        DataGroup dataGroupDetailIfo =new  DataGroup();
        dataGroupDetailIfo.setGroupName("Detail Info");
        dataGroupDetailIfo.setGroupTag(1);
        dataGroupDetailIfo.setGroupCount(0);
        detailInfoAttArray.add(new AttArray("CoverageType", "THIRD_PARTY"));
        detailInfoAttArray.add(new AttArray("OwnerType", "PERSON"));
        detailInfoAttArray.add(new AttArray("OwnerLicense", "teeee"));
        detailInfoAttArray.add(new AttArray("PersonNameLast", "Nico"));
        detailInfoAttArray.add(new AttArray("PersonNameFirst", "Tope"));
        detailInfoAttArray.add(new AttArray("OrgType", "COMMERCIAL"));
        detailInfoAttArray.add(new AttArray("OrgName", "n/a"));
        detailInfoAttArray.add(new AttArray("OrgID", "n/a"));
        detailInfoAttArray.add(new AttArray("AddressLine", "120 New Moriches Rd"));
        detailInfoAttArray.add(new AttArray("CityLGA", "Lake Grov"));
        detailInfoAttArray.add(new AttArray("State", "Abia"));
        detailInfoAttArray.add(new AttArray("PostCode", "12333"));
        detailInfoAttArray.add(new AttArray("Phone", "08077777733"));
        detailInfoAttArray.add(new AttArray("Email", "test@test.com"));
        detailInfoAttArray.add(new AttArray("InsuredValue", "50000"));
        detailInfoAttArray.add(new AttArray("Premium", "2000"));
        detailInfoAttArray.add(new AttArray("CommissionFee", "700"));
        detailInfoAttArray.add(new AttArray("ExtraFee", "0"));
        detailInfoAttArray.add(new AttArray("PremiumNote", "n/a"));
        detailInfoAttArray.add(new AttArray("Preamble", "n/a"));
        detailInfoAttArray.add(new AttArray("Endorsements", "n/a"));
        detailInfoAttArray.add(new AttArray("Exclusions", "n/a"));
        detailInfoAttArray.add(new AttArray("Exceptions", "n/a"));
        detailInfoAttArray.add(new AttArray("Conditions", "n/a"));
        dataGroupDetailIfo.setAttArray(detailInfoAttArray);

        //second stage

        List<AttArray> insuredInfoAttArray= new ArrayList<>();
        DataGroup dataGroupInsuredInfo =new  DataGroup();
        dataGroupInsuredInfo.setGroupName("Insured Info");
        dataGroupInsuredInfo.setGroupTag(2);
        dataGroupInsuredInfo.setGroupCount(0);

        insuredInfoAttArray.add(new AttArray("InsuredNo", "1"));
        insuredInfoAttArray.add(new AttArray("VehicleID", "VIN12345678"));
        insuredInfoAttArray.add(new AttArray("PlateNo", "NEW-YORK-001"));
        insuredInfoAttArray.add(new AttArray("RegNo", "REG00000001"));
        insuredInfoAttArray.add(new AttArray("RegDate", "July 04, 2020"));
        insuredInfoAttArray.add(new AttArray("RegExpDate", "July 04, 2022"));
        insuredInfoAttArray.add(new AttArray("RegMileage", "10000"));
        insuredInfoAttArray.add(new AttArray("AutoType", "CAR"));
        insuredInfoAttArray.add(new AttArray("AutoMake", "Ford"));
        insuredInfoAttArray.add(new AttArray("AutoModel", "Escort"));
        insuredInfoAttArray.add(new AttArray("AutoColor", "Custom"));

        insuredInfoAttArray.add(new AttArray("AutoYear", "2018"));
        insuredInfoAttArray.add(new AttArray("EngineCap", "2.5"));
        insuredInfoAttArray.add(new AttArray("SeatCap", "7"));
        insuredInfoAttArray.add(new AttArray("AutoNote", "n/a"));
        dataGroupInsuredInfo.setAttArray(insuredInfoAttArray);
//        third Post

        List<AttArray> insuredInfoAttArrayTwo = new ArrayList<>();
        DataGroup dataGroupInsuredInfoTwo =new  DataGroup();
        dataGroupInsuredInfoTwo.setGroupName("Insured Info");
        dataGroupInsuredInfoTwo.setGroupTag(2);
        dataGroupInsuredInfoTwo.setGroupCount(1);

        insuredInfoAttArrayTwo.add(new AttArray("InsuredNo", "2"));
        insuredInfoAttArrayTwo.add(new AttArray("VehicleID", "VIN12345678"));
        insuredInfoAttArrayTwo.add(new AttArray("PlateNo", "NEW-YORK-001"));
        insuredInfoAttArrayTwo.add(new AttArray("RegNo", "REG00000001"));
        insuredInfoAttArrayTwo.add(new AttArray("RegDate", "July 04, 2020"));
        insuredInfoAttArrayTwo.add(new AttArray("RegExpDate", "July 04, 2022"));
        insuredInfoAttArrayTwo.add(new AttArray("RegMileage", "10000"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoType", "CAR"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoMake", "Ford"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoModel", "Escort"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoColor", "Custom"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoYear", "2018"));
        insuredInfoAttArrayTwo.add(new AttArray("EngineCap", "2.5"));
        insuredInfoAttArrayTwo.add(new AttArray("SeatCap", "7"));
        insuredInfoAttArrayTwo.add(new AttArray("AutoNote", "n/a"));
       dataGroupInsuredInfoTwo.setAttArray(insuredInfoAttArrayTwo);

//       Last Stage
        List<DataGroup> dataGroupList = new ArrayList<>();
        dataGroupList.add(dataGroup);
        dataGroupList.add(dataGroupDetailIfo);
        dataGroupList.add(dataGroupInsuredInfo);
        dataGroupList.add(dataGroupInsuredInfoTwo);

        dataGroups = dataGroupList;


    }

    public List<DataGroup> getDataGroup() {
        return dataGroups;
    }

    public void setDataGroup(List<DataGroup> dataGroup) {
        dataGroups = dataGroup;
    }

    public String getSID() {
        return sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

        @Override
        public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("{").append("\n").append("\"").append("SID").append("\"").append(":").append("\"").append(sID).append("\"").append(",")
                .append("\n").append("\"").append("Token").append("\"").append(":").append("\"").append(token).append("\"").append(",").append("\n")
                        .append("\"").append("Type").append("\"").append(":").append("\"").append(type).append("\"").append(",")
                        .append("\n").append(dataGroups).append("\n").append("}");


        return str.toString();
    }

}
