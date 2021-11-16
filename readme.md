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
***elements are accesed by its index***
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

   ```month_days= new int[12]``` => ***refers to an array of 12 integers, and all elemnts in array are intitilazed to zero ;***

   ``` 
   int month_days[]= new int[12] /*** Initialization */
   int month_days[]={31,28,30,31,30,31,30,31,30,31} /** Initalization  */
   ```

   **Accessing Array**
   ```month_days[1]=28;```
   `System.out.println(month_days[3])` ***Prints element at index 3, indexing starts at 0 so, 4th element***


### Multidemnsional Arrays 
 ***Arrays of arrays***
  ``` int twoD[][]= new int[4][5]``` => allocates a 4 by 5 array and assignds to twoD, this matrix is implemented as an array of arrays of int 
***Conceptually it looks like***
  ```
   [0][0]|[0][1]|[0][2]|[0][3]|[0][4]
   [1][0]|[1][1]|[1][2]|[1][3]|[1][4]
   [2][0]|[2][1]|[2][2]|[2][3]|[2][4]
   [3][0]|[3][1]|[3][2]|[3][3]|[3][4]
```
**Creating MultiDimensional array of variable size**
``` int twoD[][]= new int[4][];
    twoD[0]= new int[3]:
    towD[1]= new int[2];
    towD[2]= new int[5];
    towD[3]= new int[6];
```
```double m[][] = { { 0 * 0, 0 * 1, 0 * 2, 0 * 3 }, { 1 * 0, 1 * 1, 1 * 2, 1 * 3 }, { 2 * 0, 2 * 1, 2 * 2, 2 * 3 },
                { 3 * 0, 3 * 1, 3 * 2, 3 * 3 } };
```

***Alternative Array Declaration Syntax***
``` 
type [] var_name;
int[] a2= new int[3];
char [][] twod2= new char[3][4]
int [] nums, num2, nums3 // create three arrays;
int nums[], nums2[], nums3[] // create three arrays; 

```
#Declaring Objects
- creating class means => creating a new data type.
- 1. declare a variable of the class type 
- 2. variable simply refer to an Object. 
- accquire and actual physical copy of the object and assign it to that variable 
-  the #new operator dynamically allocates (allocates at run time) and returns a reference to it. Reference is essentailly the  address in memory of the object allocated by new. This reference is then stored in the variable

``` Box mybox= new Box() ```
***Above statment combines the two steps described above***
```
Box mybox; // declare reference to object
mybox= new box() // allocate a Box object 

```
class var = new className();

***Class creates a new data type that can be used to create objects => That is a class creates a logical framework that defines the relationship between its members, you are creating and instance of that class. Class is a logical construct***
```
Box b1= new Box();
Box b2= b1;
b1=null;

Here, b1 has been set to null, but b2 still points to the original object. 

```

# Introducing methods
type name(parameter-list){
  // body of method
  return value
}
 Here ***type*** => specifies the type of data returned by the method. 
 type can be any valid type including Class types that we create
  if ***no return*** then its return type must be ***void***.
  ***parameter-list*** is a sequence of type and identifer paris separated by commas 
  ***value*** is the value returned  

- class consist of two things : instance variables and methods. 

# Adding a Method to the Box Class 
- use methods to access the instance variable  defined by the class. 
- method deine the interface to most classes. 
- allows  the class implementor to hide the specific layout of internal data structures behind cleaner method abstractions. 
- you can also define methods that are used internally by the class itself. 
 