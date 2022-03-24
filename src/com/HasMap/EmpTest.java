package com.HasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpTest {
    public static void main(String[] args) {

        Em e1 = new Em(1,"john", "M");
        Em e2 = new Em(2,"carry", "M");
        Em e3 = new Em(3,"amy", "F");
        Em e4 = new Em(4,"Rajni", "F");

        List<Em> emList = new ArrayList<>();
        emList.add(e1);
        emList.add(e2);
        emList.add(e3);
        emList.add(e4);

        List<String> names = new ArrayList<>();

        for (Em e:emList) {
            names.add(e.getName());
        }

        List<Em> maleList = new ArrayList<>();
        List<Em> femaleList = new ArrayList<>();
        for (Em e:emList) {
            if("M".equals(e.getGender())){
                maleList.add(e);
            }else if("F".equals(e.getGender())){
                femaleList.add(e);
            }
        }

        System.out.println(maleList);
        System.out.println(femaleList);

        Map<String,List<Em>> empMap = new HashMap<>();
        empMap.put("M",maleList);
        empMap.put("F",femaleList);

        System.out.println(empMap);}}