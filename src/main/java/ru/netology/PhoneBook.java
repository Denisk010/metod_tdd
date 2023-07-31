package ru.netology;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static Map<String,String> phoneBook = new TreeMap<>();
    public int add(String name, String numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();
    }

}
