package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Main {

  static void main() {
    int[] deck = IntStream.rangeClosed(1,52).toArray();
//    HashSet<int> deckSet = new HashSet<Integer>();
    Shuffler shuffler = new Shuffler(RandomGenerator.getDefault());
    System.out.println(Arrays.toString(deck));
    shuffler.shuffle(deck);
    System.out.println(Arrays.toString(deck));

  }
}
