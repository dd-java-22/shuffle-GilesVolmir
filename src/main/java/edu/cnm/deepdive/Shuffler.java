package edu.cnm.deepdive;

import java.util.random.RandomGenerator;

public class Shuffler {

  private final RandomGenerator rng;

  public Shuffler(RandomGenerator rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    for (int source = data.length - 1; source > 0; source--) {
      int target = rng.nextInt(source + 1);
      if (source != target) {
//        int swapBox = data[target];
//        data[target] = data[source];
//        data[source] = swapBox;
        data[target] ^= data[source]; //target is vt^vs
        data[source] ^= data[target]; //source is vt^vs^vs == vt
        data[target] ^= data[source]; //target is vt^vs^vt == vs
      }
    }
  }
}
