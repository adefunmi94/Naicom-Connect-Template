
package com.naicom.naicomdatatransfer.service;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DataGroup {

    @SerializedName("AttArray")
    private List<AttArray> arrays;
    @SerializedName("GroupCount")
    private int groupCount;
    @SerializedName("GroupName")
    private String groupName;
    @SerializedName("GroupTag")
    private int groupTag;

//    public DataGroup(List<AttArray> arrays, int groupCount, String groupName, int groupTag) {
//        this.arrays = arrays;
//        this.groupCount = groupCount;
//        this.groupName = groupName;
//        this.groupTag = groupTag;
//    }



    public List<AttArray> getAttArray() {
        return arrays;
    }

    public void setAttArray(List<AttArray> attArray) {
        arrays = attArray;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupTag() {
        return groupTag;
    }

    public void setGroupTag(int groupTag) {
        this.groupTag = groupTag;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();


        str.append("\"" ).append("DataGroup").append("\"").append(":").append("[").append("{").append("\n ")
                .append("\"").append("GroupName").append("\"").append(":").append("\"").append(groupName).append("\"").append(",")
                .append("\n").append("\"").append("GroupTag").append(":").append(groupTag).append(",").append("\n").append("\"")
                .append("GroupCount").append("\"").append(":").append(groupCount).append(",").append("\n");

        for (AttArray array: arrays){
            str.append(array).append("\n");
        }
        str.append("]").append("},");

        return str.toString();
    }


//    @Override
//    public String toString() {
//        return "DataGroup{" +
//                "arrays=" + arrays +
//                ", groupCount=" + groupCount +
//                ", groupName='" + groupName + '\'' +
//                ", groupTag=" + groupTag +
//                '}';
//    }
}
