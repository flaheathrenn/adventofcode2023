package day14;

public class ParsedLine {

    // State
    String[] splitLine;

    // Parsing
    public ParsedLine(String line) {
        splitLine = line.split("");
    }

}