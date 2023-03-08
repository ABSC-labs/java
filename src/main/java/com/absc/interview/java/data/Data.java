package com.absc.interview.java.data;

import java.util.HashMap;
import java.util.Map;

import com.absc.interview.java.model.Person;

public class Data {

    public Map<Integer, Person> data;

    public Data() {
        data = new HashMap<>();
    }

    public Person get(int id) {
        // get a Person object from the map
    }

    public boolean set(int id, Person p) {
        // add a Person object to the map
    }

    public boolean update(int id, Person p) {
        // update a Person object in the map
    }

    public Person delete(int id) {
        // delete a Person object from the map
    }

    public Person find(String s) {
        // find a Person object in the map by first or last name
    }

}
