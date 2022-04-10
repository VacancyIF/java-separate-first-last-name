package com.bytelegend.noencapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> filterPeopleWithNameLongerThan1(List<Person> people, int length) {
        return people.stream().filter(p -> p.name.length() > length).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithNameLongerThan2(List<Person> people, int length) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            if (p.name.length() > length) {
                list.add(p);
            }
        }
        return list;
    }

    public static List<Person> filterPeopleWithNameStartingWith1(
            List<Person> people, String prefix) {
        return people.stream().filter(p -> p.name.startsWith(prefix)).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithNameStartingWith2(
            List<Person> people, String prefix) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            if (p.name.startsWith(prefix)) {
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Person> getNameToPersonMap1(List<Person> people) {
        return people.stream().collect(Collectors.toMap(p -> p.name, p -> p));
    }

    public static Map<String, Person> getNameToPersonMap2(List<Person> people) {
        Map<String, Person> map = new HashMap<>();
        for (Person p : people) {
            map.put(p.name, p);
        }
        return map;
    }
}
