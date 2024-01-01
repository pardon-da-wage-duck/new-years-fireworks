/**
 *This program creates a short fireworks animation in the terminal in celebration of the 2024 New Years
 * @author pardon-da-wage-duck
 * @version 1.0
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> animation = new ArrayList<ArrayList<String>>();
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\happy new year 2024.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame1.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame2.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame3.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame4.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame5.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame6.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame7.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame8.txt"));
        animation.add(txtToArray("C:\\Users\\owner\\IdeaProjects\\new-years-fireworks\\src\\images\\firework txt frames\\frame9.txt"));

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            sleep(1000);
        }
        clearScreen();

        for(int loops = 0; loops < 10; loops++){
            for(ArrayList<String> i: animation){
                for(String j: i){
                    System.out.println(j);
                }
                sleep(300);
                clearScreen();
            }
        }

    }

    /**
     * A static function that converts a text file into an ArrayList.
     * @param filename
     * @return ArrayList<String>
     */
    public static ArrayList<String> txtToArray(String filename){
        ArrayList<String> array = new ArrayList<String>();
        try (Scanner myFileReader = new Scanner(new File(filename))) {
            while (myFileReader.hasNextLine()) {
                String line = myFileReader.nextLine();
                array.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
