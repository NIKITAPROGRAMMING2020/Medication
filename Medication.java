/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NBSPC
 */

interface Hospital{
    public abstract String getMedication();
}
class Person{
    String name;
    int age;
    void prtPerson(){
        System.out.println("Name:" + name );
        System.out.println("Age:" + age );
             }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
        
    }
}
class Patient extends Person{
    int ID;
    String Date, Time;
    void prtPatient(){
        super.prtPerson();
        System.out.println("ID:"+ ID);
        System.out.println("Date:"+ Date);
        System.out.println("Time:"+ Time);
        
    }
}
class SurgeryP implements Hospital{
    String surgeryType;
    @Override 
    public String getMedication(){
        return surgeryType;
    }
}
class TreatmentP extends Patient implements Hospital{
    String treatmentType;
    @Override
    public String getMedication(){
        return treatmentType;
    }
} 
class Doctor extends Person implements Hospital{
    int ID;
    String spec;
    public String getMedication(){
        return spec;
    }
}
class Nurse extends Person{
    int ID;
    String Department ;
}
class NightShift extends Nurse implements Hospital{
    String shift;
    String Time;
    
    @Override
    public String getMedication(){
        return shift;
    }
    
}
class DayShift extends Nurse implements Hospital {
    String Date, Time;
    @Override
    public String getMedication(){
        return Date + " " + Time;
    }
}
public class Medication {
    public static void main(String[] args){
    Person p[]= new Person[10] ;
    for (int i=0; i<10; i++){
        p[i]= new Person(('A'+i)+"",i+50);
    }
    for (int i=0; i<10; i++){
        p[i].prtPerson();
}
    p[4].setName("Change Name4");
    p[2].setName("Change Name2");
    p[1].setName("Change Name1");
    p[6].setName("Change Name6");
        for (int i=0; i<10; i++){
        p[i].prtPerson();
        }
    }
}