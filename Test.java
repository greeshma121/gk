Import java.util.*;
public class person  {
private String name;
private String addr;
person(String name,String addr)
public String getName() {
return “name:”+name;
}
public void setName(String name) {
this.name = name;
}

public string getAddr() {
return “addr:”+addr;
}
public void setAddr(String addr) {
this.addr = addr;
}
}

public String toString(){ 
return name+" "+address;
}

class Student extends Person{ 
private String program; 
private int year; 
private double fee; 
Student(String name,String address,String program,int year,double fee) 
{ 
this.program=program; 
this.year=year; 
this.fee=fee; 
} 
public String getProgram()
{ 
return "program: "+program;
} 
public void setProgram(String program)
{ 
this.Program=program;
} 
public int getYear()
{ 
return "Year: "+year;}

public void setYear()
{ 
this.Year=year;
} 
public int getFee(){

return "Fee: "+fee;
} 
public void setFee(double fee)
{ 
this.Fee=fee; 
} 
public String toString()
{ 
return name+" "+address+" "+program+" "+year+" "+fee; 
} 
} 
class Staff extends Person
{ 
private String school; 
private double pay; 
Staff(String name,String address,String school,double pay) 
{ 
this.school=school; 
this.pay=pay; 
} 
public String getSchool()
{ 
return "School: "+school;
} 
public void setSchool(String school)
{ 
this.School=school;
} 
public double getPay() 
{ 
return "Pay: "+pay;
} 
public void setPay(double pay)
{ 
this.Pay=pay; 
} 
public String toString()
{ 
return name+" "+address+" "+school+" "+pay; 
} 
} 
public class Test{
public static void main(string args[]) 
{ 
Person p1=new Person("abc","xyz"); 
system.out.print(p1); 
system.out.print(p1.getName()); 
system.out.print(p1.getAddress()); 
system.out.print(p1.toString()); 
Student s1=new Student("c","2008","1200"); 
system.out.print(s1); 
system.out.print(s1.getProgram()); 
system.out.print(p1.getYear()); 
system.out.print(p1.getFee()); 
system.out.print(p1.toString()); 
Staff s2=new Staff("mno","17000"); 
system.out.print(p1.getSchool()); 
system.out.print(p1.getPay()); 
system.out.print(p1.toString()); 
} 
}
