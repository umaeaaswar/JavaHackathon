//Finds the longest tower of people where each person must be shorter and lighter than the one below.
//Merges two sorted arrays A and B into a single sorted array A (A has enough space).

package hackathonassignments;
import java.util.*;
public class CircusTower {
    
    static class Person {//Person class holds height and weight of each person.

        int height;
        int weight;

        Person(int h, int w) {//Constructor initializes them.
            this.height = h;
            this.weight = w;
        }

        public String toString() {//toString() allows easy printing like (65, 100)
            return "(" + height + ", " + weight + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//A Scanner is used to read user input.
        List<Person> people = new ArrayList<>();//people is a list to store all the persons.

        System.out.println("Enter number of people:");
        int n = scanner.nextInt();

        System.out.println("Enter height and weight for each person (ht wt):");
        for (int i = 0; i < n; i++) {//User enters height and weight for each person
            int height = scanner.nextInt();//These are added to the people list.
            int weight = scanner.nextInt();
            people.add(new Person(height, weight));
        }

        List<Person> tower = buildTower(people);
        System.out.println("The longest tower is length " + tower.size() + " and includes from top to bottom:");
        for (Person p : tower) {
            System.out.println(p);
        }

        scanner.close();
    }

    public static List<Person> buildTower(List<Person> people) {
        // Step 1: Sort by height, then by weight
        people.sort((a, b) -> {
            if (a.height != b.height)
                return a.height - b.height;
            else
                return a.weight - b.weight;
        });

        // Step 2: Apply LIS on weight
        int n = people.size();
        int[] dp = new int[n];// stores length of longest tower ending at i
        int[] prev = new int[n];// used to reconstruct the path
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 1;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {//Compares each person i with every person j before it.
            for (int j = 0; j < i; j++) {
                if (people.get(i).weight > people.get(j).weight &&//If person i is heavier than person j (and taller due to sorting), it can go on top.
                    dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;//If a longer sequence is found, update dp[i] and record prev[i].

                    prev[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }

        // Reconstruct the tower
        List<Person> tower = new ArrayList<>();
        int index = maxIndex;
        while (index != -1) {
            tower.add(people.get(index));
            index = prev[index];
        }

        Collections.reverse(tower); // from top to bottom
        return tower;
    }
}

