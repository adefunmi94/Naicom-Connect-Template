package com.naicom.naicomdatatransfer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FamilyPlan {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String coverageStarDate;

    private String coverageEndDate;

    private String policyInternalId;

    private String policyDescrption;
    private String nameLast;

    private String nameFirst;

    private String addressLine;

    private String cityLGA;

    private String state;

    private String postCode;
    private String  birthDate;
    private String gender;
    private String naationality;
    private String idDoc;
    private String idNo;

    private String occupation;

    private String marital;
    private String education;
    private String phonework;
    private String phoneHome;
    private String phoneMobile;
    private String  email;
    private String productName;
    private String productType;
    private String pensiomEntryAge;

    private String pensionPlanDeetail;

    private String annualEmolment;
    private String annuityType;
    private String annuityAmount;
    private String medicalonditions;
    private String medicalHistory;

    private String mortgagePortfolio;

    private String mortgageValue;


    private String insuredValue;

    private String premium;

    private String commissionFee;
    private String extraaFee;

    private String premiumNote;
    private String terms;

    private String preamble;

    private String endorsement;
    private String exclusion;
    private String exceptions;
    private String conditions;

    @Column
    private String beneficiaryName;
    @Column
    private String beneficiaryAddress;
    @Column
    private String beneficiaryBirthDate;
    @Column
    private String beneficiaryGender;
    @Column
    private String beneficiaryPhone;
    private String beneficiaryEmail;
    private String beneficiaryIdDoc;
    private String beneficiaryIdNo;
    private String beneficiaryRelationship;
    @Column
    private String beneficiarPortions;
    @Column
    private String beneficiaryNote;
    @Column
    private String beneficiaryName2;
    @Lob
    private String beneficiaryAddress2;
    @Lob
    private String beneficiaryBirthDate2;

    private String beneficiaryGender2;
    @Lob
    private String beneficiaryPhone2;
    @Lob
    private String beneficiaryEmail2;
    @Lob
    private String beneficiaryIdDoc2;
    private String beneficiaryIdNo2;
    private String beneficiaryRelationship2;
    private String beneficiaryPortions2;
    private String beneficiaryNote2;









}
