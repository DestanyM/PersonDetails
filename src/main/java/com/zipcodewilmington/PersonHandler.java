package com.zipcodewilmington;
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
      //  String result = "";
        // create a `counter`
        int counter = 0;
        StringBuilder result = new StringBuilder();
        // while `counter` is less than length of array
            // begin loop
         // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        while (counter < personArray.length){
            Object currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result.append(stringRepresentation);
            counter++;
        }
        return result.toString();
    }



    public String forLoop() {
       // String result = "";
        // identify initial value
        StringBuilder result = new StringBuilder();
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        for (int counter = 0; counter < personArray.length; counter++){
            Object currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result.append(stringRepresentation);
        }

      //  }
        return result.toString();
    }



    public String forEachLoop() {
        // identify array's type;
        // identify array's variable-name
        StringBuilder result = new StringBuilder();
        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for (Object currentPerson : personArray){
            // get `string Representation` of `currentPerson`
            String stringRepresentation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(stringRepresentation);
            // end loop
        }
        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
