package services;

public class Validation {
    protected static boolean IsNullOrBlank(String value){
        return (value == null || value.trim().equals(""));
    }
}
