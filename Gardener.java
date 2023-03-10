package com.mycompany.mavenproject1;

public class Gardener {
    
    public void filter(Plant conferous) {
        String fTitle = conferous.getTitle();
        fTitle = fTitle.replaceAll("a", "");
        fTitle = fTitle.replaceAll("e", "");
        fTitle = fTitle.replaceAll("y", "");
        fTitle = fTitle.replaceAll("u", "");
        fTitle = fTitle.replaceAll("i", "");
        fTitle = fTitle.replaceAll("o", "");
        fTitle = fTitle.replaceAll("A", "");
        fTitle = fTitle.replaceAll("E", "");
        fTitle = fTitle.replaceAll("Y", "");
        fTitle = fTitle.replaceAll("U", "");
        fTitle = fTitle.replaceAll("I", "");
        fTitle = fTitle.replaceAll("O", "");
        fTitle = fTitle + "VGTBL";
        conferous.setTitle(fTitle);
    }
}
