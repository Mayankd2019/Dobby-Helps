package com.collegesucks.dobbyhelps;

import java.util.ArrayList;

public class TimeTableData {

    Subject asn = new Subject("ASN","https://meet.google.com/hyk-nffw-xtz");
     Subject de = new Subject("DE","https://meet.google.com/trp-phuk-yxb");
     Subject ss = new Subject("SS","https://meet.google.com/hed-grwn-pxs");
     Subject edc = new Subject("EDC","https://meet.google.com/qww-igtd-wzk");
     Subject nm = new Subject("NM","https://meet.google.com/ebb-ymno-gpt");
     Subject pe = new Subject("PE","https://meet.google.com/moe-eyrz-gxx");
     Subject asnTute = new Subject("ASN Tute", "https://meet.google.com/hyk-nffw-xtz");
     Subject deTute = new Subject("DE Tute","https://meet.google.com/szu-ssrv-tnw");
     Subject ssTute = new Subject("SS Tute","https://meet.google.com/wkw-tcbs-teu");
     Subject edcTute = new Subject("EDC Tute","https://meet.google.com/zaa-qnyy-uca");
     Subject deLab = new Subject("DE Lab","https://meet.google.com/qzo-smes-idg");
     Subject edcLab = new Subject("EDC Lab","https://meet.google.com/qav-tccm-gkv");
     Subject none = new Subject("NONE","Bajrang Dal ne bola free period to free period");
     Subject none2 = new Subject("NONE","Bajrang Dal ne bola free period to free period");
    Subject none3 = new Subject("NONE","Bajrang Dal ne bola free period to free period");
    Subject none4 = new Subject("Have fun ;) ","This button is just for good looks");


    public  ArrayList<Subject> getData(int group, int dayOfTheWeek){
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        switch(group ){
            case 0 :
                none4.setStartTime("Kabhi bhi");
                none4.setEndTime("Kahi bhi");
                subjects.add(none4);
                break;
            case 1 : {
                switch (dayOfTheWeek) {
                    case 0 :
                        none4.setStartTime("Kabhi bhi");
                        none4.setEndTime("Kahi bhi");
                        subjects.add(none4);
                        break;
                    case 1 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        asn.setStartTime("08:30");
                        asn.setEndTime("09:20");
                        subjects.add(asn);
                        de.setStartTime("09:30");
                        de.setEndTime("10:20");
                        subjects.add(de);
                        edc.setStartTime("10:30");
                        edc.setEndTime("11:20");
                        subjects.add(edc);
                        ss.setStartTime("11:30");
                        ss.setEndTime("12:20");
                        subjects.add(ss);
                        deLab.setStartTime("01:30");
                        deLab.setEndTime("03:20");
                        subjects.add(deLab);
                        none.setStartTime("03:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    case 2 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        none2.setStartTime("08:30");               //error occurred
                        none2.setEndTime("09:20");
                        subjects.add(none2);
                        asn.setStartTime("09:30");
                        asn.setEndTime("10:20" );
                        subjects.add(asn);
                        de.setStartTime("10:30");
                        de.setEndTime("11:20");
                        subjects.add(de);
                        edc.setStartTime("11:30");
                        edc.setEndTime("12:20");
                        subjects.add(edc);
                        asnTute.setStartTime("01:30");
                        asnTute.setEndTime("02:20");
                        subjects.add(asnTute);
                        deTute.setStartTime("02:30");
                        deTute.setEndTime("03:20");
                        subjects.add(deTute);
                        none.setStartTime("03:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    case 3 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        nm.setStartTime("08:30");
                        nm.setEndTime("09:20");
                        subjects.add(nm);
                        none2.setStartTime("09:30");
                        none2.setEndTime("10:20");
                        subjects.add(none2);
                        asn.setStartTime("10:30");
                        asn.setEndTime("11:20");
                        subjects.add(asn);
                        de.setStartTime("11:30");
                        de.setEndTime("12:20");
                        subjects.add(de);
                        edcLab.setStartTime("01:30");
                        edcLab.setEndTime("03:20");
                        subjects.add(edcLab);
                        none.setStartTime("03:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    case 4 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        ss.setStartTime("08:30");
                        ss.setEndTime("9:20");
                        subjects.add(ss);
                        nm.setStartTime("09:30");
                        nm.setEndTime("10:20");
                        subjects.add(nm);
                        none2.setStartTime("10:30");
                        none2.setEndTime("11:20");
                        subjects.add(none2);
                        pe.setStartTime("11:30");
                        pe.setEndTime("12:20");
                        subjects.add(pe);
                        none.setStartTime("01:30");
                        none.setEndTime("02:20");
                        subjects.add(none);
                        edcTute.setStartTime("02:30");
                        edcTute.setEndTime("03:20");
                        subjects.add(edcTute);
                        none3.setStartTime("03:30");
                        none3.setEndTime("05:20");
                        subjects.add(none3);
                        break;
                    case 5 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        edc.setStartTime("08:30");
                        edc.setEndTime("09:20");
                        subjects.add(edc);
                        ss.setStartTime("09:30");
                        ss.setEndTime("10:20");
                        subjects.add(ss);
                        nm.setStartTime("10:30");
                        nm.setEndTime("11:20");
                        subjects.add(nm);
                        ssTute.setStartTime("11:30");
                        ssTute.setEndTime("12:20");
                        subjects.add(ssTute);
                        none.setStartTime("01:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    default :
                        if(subjects !=  null) {
                            subjects.clear();
                        }
                        break;
                }
            }
                break;
            case 2 : {
                switch (dayOfTheWeek) {
                    case 1 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        asn.setStartTime("08:30");
                        asn.setEndTime("09:20");
                        subjects.add(asn);
                        de.setStartTime("09:30");
                        de.setEndTime("10:20");
                        subjects.add(de);
                        edc.setStartTime("10:30");
                        edc.setEndTime("11:20");
                        subjects.add(edc);
                        ss.setStartTime("11:30");
                        ss.setEndTime("12:20");
                        subjects.add(ss);
                        deLab.setStartTime("01:30");
                        deLab.setEndTime("03:20");
                        subjects.add(deLab);
                        none2.setStartTime(";03:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 2 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        none.setStartTime("08:30");
                        none.setEndTime("09:20");
                        subjects.add(none);
                        asn.setStartTime("09:30");
                        asn.setEndTime("10:20" );
                        subjects.add(asn);
                        de.setStartTime("10:30");
                        de.setEndTime("11:20");
                        subjects.add(de);
                        edc.setStartTime("11:30");
                        edc.setEndTime("12:20");
                        subjects.add(edc);
                        asnTute.setStartTime("01:30");
                        asnTute.setEndTime("02:20");
                        subjects.add(asnTute);
                        deTute.setStartTime("02:30");
                        deTute.setEndTime("03:30");
                        subjects.add(deTute);
                        none2.setStartTime("03:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 3 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        nm.setStartTime("08:30");
                        nm.setEndTime("09:20");
                        subjects.add(nm);
                        none.setStartTime("09:30");
                        none.setEndTime("10:20");
                        subjects.add(none);
                        asn.setStartTime("10:30");
                        asn.setEndTime("11:20");
                        subjects.add(asn);
                        de.setStartTime("11:30");
                        de.setEndTime("12:20");
                        subjects.add(de);
                        edcLab.setMeetLink("https://meet.google.com/ojs-xcwf-byo");
                        edcLab.setStartTime("01:30");
                        edcLab.setEndTime("03:20");
                        subjects.add(edcLab);
                        edcTute.setStartTime("03:30");
                        edcTute.setEndTime("04:30");
                        subjects.add(edcTute);
                        none3.setStartTime("04:30");
                        none3.setEndTime("05:20");
                        subjects.add(none3);
                        break;
                    case 4 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        ss.setStartTime("08:30");
                        ss.setEndTime("9:20");
                        subjects.add(ss);
                        nm.setStartTime("09:30");
                        nm.setEndTime("10:20");
                        subjects.add(nm);
                        none.setStartTime("10:30");
                        none.setEndTime("11:20");
                        subjects.add(none);
                        pe.setStartTime("11:30");
                        pe.setEndTime("12:20");
                        subjects.add(pe);
                        none2.setStartTime("01:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 5 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        edc.setStartTime("08:30");
                        edc.setEndTime("09:20");
                        subjects.add(edc);
                        ss.setStartTime("09:30");
                        ss.setEndTime("10:20");
                        subjects.add(ss);
                        nm.setStartTime("10:30");
                        nm.setEndTime("11:20");
                        subjects.add(nm);
                        ssTute.setStartTime("11:30");
                        ssTute.setEndTime("12:20");
                        subjects.add(ssTute);
                        none.setStartTime("01:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    default :
                        if(subjects !=  null) {
                            subjects.clear();
                        }
                        break;
                }
            }
                break;
            case 3 : {
                switch (dayOfTheWeek) {
                    case 1 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        asn.setStartTime("08:30");
                        asn.setEndTime("09:20");
                        subjects.add(asn);
                        de.setStartTime("09:30");
                        de.setEndTime("10:20");
                        subjects.add(de);
                        edc.setStartTime("10:30");
                        edc.setEndTime("11:20");
                        subjects.add(edc);
                        ss.setStartTime("11:30");
                        ss.setEndTime("12:20");
                        subjects.add(ss);
                        none2.setStartTime("01:30");
                        none2.setEndTime("03:20");
                        subjects.add(none2);
                        deLab.setStartTime("03:30");       //we don't know its right link so  you wait for that
                        deLab.setEndTime("05:20");
                        subjects.add(deLab);
                        break;
                    case 2 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        none.setStartTime("08:30");
                        none.setEndTime("09:20");
                        subjects.add(none);
                        asn.setStartTime("09:30");
                        asn.setEndTime("10:20" );
                        subjects.add(asn);
                        de.setStartTime("10:30");
                        de.setEndTime("11:20");
                        subjects.add(de);
                        edc.setStartTime("11:30");
                        edc.setEndTime("12:20");
                        subjects.add(edc);
                        asnTute.setStartTime("01:30");
                        asnTute.setEndTime("02:20");
                        subjects.add(asnTute);
                        deTute.setStartTime("02:30");
                        deTute.setEndTime("03:30");
                        subjects.add(deTute);
                        none2.setStartTime("03:30");
                        none2.setEndTime("04;20");
                        subjects.add(none2);
                        edcTute.setStartTime("04:30");
                        edcTute.setEndTime("05:20");
                        subjects.add(edcTute);
                        break;
                    case 3 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        nm.setStartTime("08:30");
                        nm.setEndTime("09:20");
                        subjects.add(nm);
                        none3.setStartTime("09:30");
                        none3.setEndTime("10:20");
                        subjects.add(none3);
                        asn.setStartTime("10:30");
                        asn.setEndTime("11:20");
                        subjects.add(asn);
                        de.setStartTime("11:30");
                        de.setEndTime("12:20");
                        subjects.add(de);
                        edcLab.setStartTime("01:30" );
                        edcLab.setEndTime("03:20");
                        subjects.add(edcLab);
                        none2.setStartTime("03:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 4 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        ss.setStartTime("08:30");
                        ss.setEndTime("9:20");
                        subjects.add(ss);
                        nm.setStartTime("09:30");
                        nm.setEndTime("10:20");
                        subjects.add(nm);
                        none.setStartTime("10:30");
                        none.setEndTime("11:20");
                        subjects.add(none);
                        pe.setStartTime("11:30");
                        pe.setEndTime("12:20");
                        subjects.add(pe);
                        none2.setStartTime("01:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 5 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        edc.setStartTime("08:30");
                        edc.setEndTime("09:20");
                        subjects.add(edc);
                        ss.setStartTime("09:30");
                        ss.setEndTime("10:20");
                        subjects.add(ss);
                        nm.setStartTime("10:30");
                        nm.setEndTime("11:20");
                        subjects.add(nm);
                        ssTute.setStartTime("11:30");
                        ssTute.setEndTime("12:20");
                        subjects.add(ssTute);
                        none3.setStartTime("01:30");
                        none3.setEndTime("05:20");
                        subjects.add(none3);
                        break;
                    default :
                        if(subjects !=  null) {
                            subjects.clear();
                        }
                        break;
                }
            }
                break;
            case 4 : {
                switch (dayOfTheWeek) {
                    case 1 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        asn.setStartTime("08:30");
                        asn.setEndTime("09:20");
                        subjects.add(asn);
                        de.setStartTime("09:30");
                        de.setEndTime("10:20");
                        subjects.add(de);
                        edc.setStartTime("10:30");
                        edc.setEndTime("11:20");
                        subjects.add(edc);
                        ss.setStartTime("11:30");
                        ss.setEndTime("12:20");
                        subjects.add(ss);
                        deLab.setMeetLink("https://meet.google.com/bsf-fhew-nsw");
                        deLab.setStartTime("01:30");
                        deLab.setEndTime("03:20");
                        subjects.add(deLab);
                        none.setStartTime("03:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    case 2 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        none2.setStartTime("08:30");
                        none2.setEndTime("09:20");
                        subjects.add(none2);
                        asn.setStartTime("09:30");
                        asn.setEndTime("10:20" );
                        subjects.add(asn);
                        de.setStartTime("10:30");
                        de.setEndTime("11:20");
                        subjects.add(de);
                        edc.setStartTime("11:30");
                        edc.setEndTime("12:20");
                        subjects.add(edc);
                        asnTute.setStartTime("01:30");
                        asnTute.setEndTime("02:20");
                        subjects.add(asnTute);
                        deTute.setStartTime("02:30");
                        deTute.setEndTime("03:30");
                        subjects.add(deTute);
                        none.setStartTime("03:30");
                        none.setEndTime("04:20");
                        subjects.add(none);
                        edcTute.setStartTime("04:30");
                        edcTute.setEndTime("05:20");
                        subjects.add(edcTute);
                        break;
                    case 3 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        nm.setStartTime("08:30");
                        nm.setEndTime("09:20");
                        subjects.add(nm);
                        none3.setStartTime("09:30");
                        none3.setEndTime("10:20");
                        subjects.add(none3);
                        asn.setStartTime("10:30");
                        asn.setEndTime("11:20");
                        subjects.add(asn);
                        de.setStartTime("11:30");
                        de.setEndTime("12:20");
                        subjects.add(de);
                        edcLab.setStartTime("01:30");
                        edcLab.setEndTime("03:20");
                        subjects.add(edcLab);
                        none2.setStartTime("03:30");
                        none2.setEndTime("05:20");
                        subjects.add(none2);
                        break;
                    case 4 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        ss.setStartTime("08:30");
                        ss.setEndTime("9:20");
                        subjects.add(ss);
                        nm.setStartTime("09:30");
                        nm.setEndTime("10:20");
                        subjects.add(nm);
                        none.setStartTime("10:30");
                        none.setEndTime("11:20");
                        subjects.add(none);
                        pe.setStartTime("11:30");
                        pe.setEndTime("12:20");
                        subjects.add(pe);
                        none3.setStartTime("01:30");
                        none3.setEndTime("05:20");
                        subjects.add(none3);
                        break;
                    case 5 :
                        if(subjects != null){
                            subjects.clear();
                        }
                        edc.setStartTime("08:30");
                        edc.setEndTime("09:20");
                        subjects.add(edc);
                        ss.setStartTime("09:30");
                        ss.setEndTime("10:20");
                        subjects.add(ss);
                        nm.setStartTime("10:30");
                        nm.setEndTime("11:20");
                        subjects.add(nm);
                        ssTute.setStartTime("11:30");
                        ssTute.setEndTime("12:20");
                        subjects.add(ssTute);
                        none2.setStartTime("01:30");
                        none2.setEndTime("03:20");
                        subjects.add(none2);
                        edcTute.setStartTime("03:30");
                        edcTute.setEndTime("04:20");
                        subjects.add(edcTute);
                        none.setStartTime("04:30");
                        none.setEndTime("05:20");
                        subjects.add(none);
                        break;
                    default :
                        if(subjects !=  null) {
                            subjects.clear();
                        }
                        break;
                }
            }
                break;
            default:
                if(subjects != null){
                    subjects.clear();
                }
        }

        return subjects;
    }

}
