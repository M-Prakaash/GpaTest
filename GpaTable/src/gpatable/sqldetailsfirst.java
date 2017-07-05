/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpatable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class sqldetailsfirst {

    private final StringProperty register;
    private final StringProperty subjectone;
    private final StringProperty subjecttwo;
    private final StringProperty subjectthree;
    private final StringProperty subjectfour;

    public sqldetailsfirst(String register,String subjectone, String subjecttwo, String subjectthree, String subjectfour)
    {
        this.register = new SimpleStringProperty(register);
        this.subjectone = new SimpleStringProperty(subjectone);
        this.subjecttwo = new SimpleStringProperty(subjecttwo);
        this.subjectthree = new SimpleStringProperty(subjectthree);
        this.subjectfour = new SimpleStringProperty(subjectfour);
    }

    public String getReg()
    {
        return register.get();
    }
    public String getOne()
    {
        return subjectone.get();
    }
    public String getTwo()
    {
        return subjecttwo.get();
    }
    public String getThree()
    {
        return subjectthree.get();
    }
    public String getFour()
    {
        return subjectfour.get();
    }
    public  void setRegister(String value){
        register.set(value);
    }
    public  void setSubjectone(String value){
        subjectone.set(value);
    }
    public  void setSubjecttwo(String value){
        subjecttwo.set(value);
    }
    public  void setSubjectthree(String value){
        subjectthree.set(value);
    }
    public  void setSubjectfour(String value)
    {
        subjectfour.set(value);
    }
    public StringProperty regProperty(){
        return register;
    }
    public StringProperty oneProperty(){
        return subjectone;
    }
    public StringProperty twoProperty(){
        return subjecttwo;
    }
    public StringProperty threeProperty(){
        return subjectthree;
    }
    public StringProperty fourProperty(){
        return subjectfour;
    }

}
