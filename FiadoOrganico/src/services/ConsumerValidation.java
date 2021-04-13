package services;

public class ConsumerValidation extends Validation{

    public static boolean ValidateName(String name)
    {
        if(IsNullOrBlank(name)){
            return false;
        }
        return true;
    }
    public static boolean ValidatePhone(String phone){
        if(IsNullOrBlank(phone)){
            return false;
        }
        return true;
    }
}
