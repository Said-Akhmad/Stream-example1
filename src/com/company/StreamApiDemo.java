package com.company;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamApiDemo {
    public static void main(String[] args) {

        List<Specialist> specialists = StreamAPIUtil.getSpecialists();
        List<Specialist> nameOfSpecialists = StreamAPIUtil.sortSpecialistsByNameAsc(specialists);
        //nameOfSpecialists.forEach(System.out::println);

        List<Specialist> listOfDevOps = StreamAPIUtil.filterBySpecialty(specialists, Specialty.DEVOPS);
        // listOfDevOps.forEach(System.out::println);

        List<Specialist> nameOfSpecailistsDesc = StreamAPIUtil.sortSpecialistsByNameDesc(specialists);
        //nameOfSpecailistsDesc.forEach(System.out::println);

        //System.out.println(StreamAPIUtil.matchAllEngineers(specialists));
        // System.out.println(StreamAPIUtil.matchAnyEngineer(specialists));

        //System.out.println(StreamAPIUtil.matchAllSalaryMoreThen(specialists,new BigDecimal(500)));
        //System.out.println(StreamAPIUtil.matchNoneSalaryMoreThen(specialists,new BigDecimal(1000)));
        //StreamAPIUtil.printSpecialists(specialists);

        Specialist withMaxSalary = StreamAPIUtil.findWithMaxSalary(specialists);
        //  System.out.println(withMaxSalary);

        Specialist withMinSalary = StreamAPIUtil.findWithMinSalary(specialists);
        // System.out.println(withMinSalary);

        Map<Specialty, List<Specialist>> groupOfSpecialist = StreamAPIUtil.groupBySpecialty(specialists);
        System.out.println(groupOfSpecialist);


    }
}
