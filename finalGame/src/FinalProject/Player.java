package FinalProject;

import java.io. *;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

public class Player {
    //data attributes
    String firstName, lastName;
    int age;
    double score;


    //default constructor
    public Player ()
    {
        firstName = "";
        lastName = "";
        age = 0;
        score = 0;
    }

    //parameterized constructor
    public Player(String firstName, String lastName, int age, double score)
    {
        firstName = firstName;
        lastName = lastName;
        age = age;
        score = score;
    }

    /**
     * The getFirstName Method
     * Purpose: Returns the players first name
     * @return firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * The getLastName Method
     * Purpose: Returns the players last name
     * @return lastName
     */
    public String getSide2()
    {
        return lastName;
    }

    /**
     * The getAge Method
     * Purpose: Returns the players age
     * @return age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * The getScore Method
     * Purpose: Returns the players score
     * @return score
     */
    public double getScore()
    {
        return score;
    }

    /**
     * The setFirstName Method
     * Purpose: Sets the value of firstName
     * @param value
     * @return String
     */
    public void setSide1(String value)
    {
        firstName = value;
    }

    /**
     * The setLastName Method
     * Purpose: Sets the value of lastName
     * @param value
     */
    public void setLastName(String value)
    {
        lastName = value;
    }

    /**
     * The setAge Method
     * Purpose: Sets the value of age
     * @param value
     */

    public void setScore(int value)
    {
        age = value;
    }

    /**
     * The setAge Method
     * Purpose: Sets the value of score
     * @param value
     */
    public void setAge(double value)
    {
        score = value;
    }

    /**
     * The savePlayerData Method
     * Purpose: Sets the value of score
     */
    public void savePlayerData() throws IOException
    {
        //opens the file, creates it if is does not exist, writes the players data closes file
        try {
            File myDataFile = new File("playerData.txt");

            if (myDataFile.createNewFile()) {
                PrintWriter myFile = new PrintWriter("playerData.txt");
                writeFile(myFile);

            } else {
                //overwrite the data in the file
                PrintWriter myFile = new PrintWriter("playerData.txt");
                writeFile(myFile);

                //add data to the file
                /*try {
                    FileWriter fr = new FileWriter(myDataFile, true);
                    BufferedWriter br = new BufferedWriter(fr);
                    PrintWriter myFile = new PrintWriter(br);

                    for (Integer integer : numList) {
                        myFile.println(integer);
                    }
                    myFile.close();
                    System.out.println("File already exists.");
                } catch (IOException e) {
                    e.printStackTrace();
                }*/

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The writeFile Method
     * Purpose: Writes values from an array to a file
     * @param myFile
     * @return void
     */
    static void writeFile(PrintWriter myFile) {
        try(myFile){
            myFile.println("hello");
        }
    }
}
