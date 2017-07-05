/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpatable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
public class scndsqldetails {
    private final StringProperty register;
    private final StringProperty subjectone;
    private final StringProperty subjecttwo;
    private final StringProperty subjectthree;
    private final StringProperty subjectfour;
    private final StringProperty subfive;
    private final StringProperty subsix;
    private final StringProperty subsvn;
 
    
    public scndsqldetails(String register,String subjectone, String subjecttwo, String subjectthree, String subjectfour,String subfive,String subsix,String subsvn)
    {
        this.register = new SimpleStringProperty(register);
        this.subjectone = new SimpleStringProperty(subjectone);
        this.subjecttwo = new SimpleStringProperty(subjecttwo);
        this.subjectthree = new SimpleStringProperty(subjectthree);
        this.subjectfour = new SimpleStringProperty(subjectfour);
        this.subfive = new SimpleStringProperty(subfive);
        this.subsix = new SimpleStringProperty(subsix);
        this.subsvn = new SimpleStringProperty(subsvn);
        
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
     public String getfive()
    {
        return subfive.get();
    }
    public String getsix()
    {
        return subsix.get();
    }
    public String getseven()
    {
        return subsvn.get();
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
    public  void setSubjectfive(String value)
    {
        subfive.set(value);
    }
    public  void setSubjectsix(String value)
    {
        subsix.set(value);
    }
    public  void setSubjectseven(String value)
    {
        subsvn.set(value);
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
    public StringProperty fiveProperty(){
        return subfive;
    }
    public StringProperty sixProperty(){
        return subsix;
    }
    public StringProperty sevenProperty(){
        return subsvn;
    }
    

    
}
