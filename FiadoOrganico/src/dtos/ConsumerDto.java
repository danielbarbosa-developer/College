package dtos;

import models.Consumer;

public class ConsumerDto extends Consumer {

    public ConsumerDto(int products){
        this.OnCredit = new int[products];
    }

    public String GetName(){
        return this.name;
    }
    public void SetName(String name){
        this.name = name;
    }
    public String GetPhone(){
        return this.phone;
    }
    public void SetPhone(String phone){
        this.phone = phone;
    }
    public int[] GetOnCredits(){
        return this.OnCredit;
    }
    public void SetOnCredits(int[] values){
        this.OnCredit = values;
    }

}
