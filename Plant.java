package com.mycompany.mavenproject1;

public class Plant {
    private String title;
    private String field1;
    private String field2;
    
    public Plant(String title, String field1, String field2){
        this.title = title;
        this.field1 = field1;
        this.field2 = field2;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle (String title) {
        this.title = title;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }
    
    
    
    public void doGrowing() {
        System.out.println("I am docilely doing my own growing. Beware of errors, writer.");
        System.out.println("As well as such employees.");
    }
    
}
