
package com.naicom.naicomdatatransfer.service;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AttArray {

    @SerializedName("Name")
    private String name;
    @SerializedName("Value")
    private String value;

    public AttArray(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

       str.append("\"" ).append("AttArray").append("\"").append(":").append("[").append("\n").append("{").append("\n ")
                .append("\"").append("Name").append("\"").append(":").append("\"").append(name).append("\"").append(",")
                .append("\n").append("\"").append("Value").append("\"").append(":").append("\"").append(value).append("\"")
               .append("\n").append("},");

       return str.toString();
    }
}
