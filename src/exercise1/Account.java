package exercise1;

//Account class that contains a name instance variable and methods to set and get its value.

public class Account {

    private String name; //instance variable

    //method to set nae in the object

    public  void  setName(String name ) {
        this.name =name;

    }

    //method to get/ retrieve  name from the object
    public  String getName(){

        return name; //return value of the caller
    }


}



