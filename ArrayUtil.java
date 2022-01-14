import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class ArrayUtil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayUtil  
{
    /**
     * Set up the array so that every element has a value that is an integer
     * from 1 to the length of the array (1 - N).
     * @param arr An array of integers
     */
    public static void setup(int[] arr)
    {
        for (int i = 1; i <= arr.length; i++)
        {
            arr[i-1] = i;
        }
    }
    
    public static void setupTwo(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int N = arr.length;
            for(int h = 1; h < N; h++)
            {
                for(int j = h; j > 0; j--)
                {
                    if(arr[j] < arr[j-1])
                    {
                        swap(arr, j, j-1);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }

    /**
     * TODO: Implement this method
     * Swap elements at index positions i and j in the given array.  
     * @param arr An integer array
     * @param a The index of one of the elements to swap
     * @param b The index of the other element to swap with
     */
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Shuffle an array using the Fisher-Yates method.
     * The Fisher-Yates method iterates the array once, swapping each
     * element with a random element chosen in the range between
     * the current position to the length of the array.
     * @param arr An array of integers
     */
    public static void shuffle(int[] arr)
    {
        int N = arr.length;
        for (int i = 0; i < arr.length; i++)
        {
            int r = Greenfoot.getRandomNumber(N - i) + i;
            swap(arr, i, r);
        }
    }
}
