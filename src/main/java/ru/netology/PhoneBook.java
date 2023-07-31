package ru.netology;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static Map<String,String> phoneBook = new TreeMap<>();
    public int add(String name, String numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();
    }
    public String findByNumber(String numberPhone){
        for (Map.Entry entry : phoneBook.entrySet()) {
            if(entry.getValue().equals(numberPhone)){
                return entry.getKey().toString();
            }
        }
        throw new RuntimeException("Контакта с этим номером нету.");
    }
    public String findByName(String name){
        for (Map.Entry entry : phoneBook.entrySet()) {
            if(entry.getKey().equals(name)){
                return entry.getValue().toString();
            }
        }
        throw new RuntimeException("Контакта с этим именем нету.");
    }


}
