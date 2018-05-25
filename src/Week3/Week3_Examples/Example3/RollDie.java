package Week3.Week3_Examples.Example3;

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {

        // Generate secure Random object
        SecureRandom randomNumbers = new SecureRandom();

        int freq1 = 0, freq2 = 0, freq3 = 0, freq4 = 0, freq5 = 0, freq6 = 0;

        //loop through a for loop 6,000,000
        for(int counter = 1 ; counter <= 6000000 ; counter++)
        {
            int face = 1 + randomNumbers.nextInt(6);

            switch (face)
            {
                case 1:
                    freq1++; // increment freq1 value
                    break;
                case 2 :
                    freq2++;
                    break;
                case 3:
                    freq3++;
                    break;
                case 4:
                    freq4++;
                    break;
                case 5:
                    freq5++;
                    break;
                case 6:
                    freq6++;
                    break;
                    default:
                        //Run if all other cases are not true
                        System.out.println("How did you get here?");

            }
        }

        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t5%d%n6\t\t%d%n",freq1,freq2,freq3,freq4,freq5,freq6);
    }

}
