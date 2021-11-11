# Type Conversion Casting 
 changing type of a primitive data 
 eg. changing int to byte =>  
 int a=234;
 byte b;
 b= byte(a);
 ## automatic type promotion in expressions
conversion can occur in expression =>
byte a=40;
byte b=50;
byte c=100;
int d= a*b/c; (a*b exceeds the range of either of its byte operands)
Java automatically promotes byte, short or chat opernad to int when evaluating an expression. 
### Rules of automatic conversion  
byte, short and char => int
if one operand is long=> all to long
if one operand is float= > all to float
if one oprand is double => all to double
```
 byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 6.57f;
        double d = .123;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("(f * b) " + "(i / c)" + "-" + " (d * s);");
        System.out.println("resuts= " + result);
```
In above example =>
 in f*b => b is promoted to float, type of subexpression is float 
 in i/c => c is promoted to int,  type of subexpression is int 
 in d*s => s is pormoted to double, type of subexpression is double 

 outcome of float + int is float
 outcome of float - double is double, which is the type of final result 

 # Arrays
 => elements are accesed by its index
 ### One Dimensional Arrays
  General form => ``` type var-name[]; ```
  an array of int => ``` int mont_days[]; ```
   ```new``` is special operator that allocates memory 
   general form of one dimernsional array 
   ``` array-var = new type [size]```
   type=> data type, (int, string, double etc)
   size= lenght of array,
   array-var => variable name

   automatic initialization by new 
   for numeric type = 0;
   for boolean type= false;
   for reference type= null; 

   ```month_days= new int[12]`` => ***refers to an array of 12 integers, and all elemnts in array are intitilazed to zero ;***

   ``` int month_days[]= new int[12] /*** Initialization */
   int month_days[]={31,28,30,31,30,31,30,31,30,31} /** Initalization  */
   ```

   **Accessing Array**
   ```month_days[1]=28;```
   `System.out.println(month_days[3])` ***Prints element at index 3, indexing starts at 0 so, 4th element***



