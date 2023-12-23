package day21;

import global.InputProcessor;

public class Solver {

    public static void main(String[] args) {
        // Set up any initial state

        // Process the input line-by-line
        InputProcessor processor = new InputProcessor("src/day21/testinput.txt");
        AccumulatorForStar1 resultOld = processor.processLines(ParsedLine::new, (parsedLine, accumulator) -> {
            // Update accumulator using parsed line object
            return accumulator.update(parsedLine);
        }, new AccumulatorForStar1());
        AccumulatorForStar2 result = processor.processLines(ParsedLine::new, (parsedLine, accumulator) -> {
            // Update accumulator using parsed line object
            return accumulator.update(parsedLine);
        }, new AccumulatorForStar2());
        for (int stepCount = 16; stepCount < 17; stepCount++) {
            String oldMethod = resultOld.star1(stepCount);
            System.out.println("Star 2 solution (old method): " + oldMethod);
            String newMethod = result.star2(stepCount);
            System.out.println("Star 2 solution (new method): " + newMethod);
            if (!oldMethod.equals(newMethod)) {
                System.out.println("Mismatch for step count " + stepCount);
            }
        }
    }
}
