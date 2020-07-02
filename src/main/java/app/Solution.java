package app;

import models.Bird;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        /**bird.fly(); not all birds can fly now **/
        bird.sing();
    }
}
