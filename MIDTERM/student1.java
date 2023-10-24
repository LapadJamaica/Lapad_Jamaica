package Student1;

class Student{
 String first_name = " ";
 String middle_name = " ";
 String last_name = " ";
 String suffix =" ";
 
 public student () {
 }
 
 public String getFirstName () {
   return first_name;
   }
   
   public String getMiddleName () {
   return middle_name;
   }
   
   public String getLastName () {
   return last_name;
   }
   
   public String getSuffix () {
   return suffix;
   }
   
   
   
   public String getFullName(){
     return first_name+" "+middle_name+" "+last_name+" "+suffix;
     }