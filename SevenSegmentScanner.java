import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SevenSegmentScanner {

    public static final String PATTERN_EMPTY = "   ";
    public static final String PATTERN_UNDERLINE = " _ ";
    public static final String PATTERN_DOUBLE_PIPE = "| |";
    public static final String PATTERN_DOUBLE_PIPE_U = "|_|";
    public static final String PATTERN_LEFT_PIPE = "|  ";
    public static final String PATTERN_LEFT_PIPE_U = "|_ ";
    public static final String PATTERN_RIGHT_PIPE = "  |";
    public static final String PATTERN_RIGHT_PIPE_U = " _|";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String line3 = in.nextLine();


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        String[] splitedLine1 = line1.split("");
        String[] splitedLine2 = line2.split("");
        String[] splitedLine3 = line3.split("");

        String result = "";

        for(int i=0; i<splitedLine1.length;i+=3){
            String patternStr1 = splitedLine1[i] + splitedLine1[i+1] + splitedLine1[i+2];
            String patternStr2 = splitedLine2[i] + splitedLine2[i+1] + splitedLine2[i+2];
            String patternStr3 = splitedLine3[i] + splitedLine3[i+1] + splitedLine3[i+2];
            if(patternStr1.equals(PATTERN_UNDERLINE)){
                if(patternStr2.equals(PATTERN_DOUBLE_PIPE)){
                    if(patternStr3.equals(PATTERN_DOUBLE_PIPE_U)){
                        result+="0";
                    }
                }
                if(patternStr2.equals(PATTERN_RIGHT_PIPE_U)){
                    if(patternStr3.equals(PATTERN_LEFT_PIPE_U)){
                        result+="2";
                    }
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE_U)){
                        result+="3";
                    }
                }
                if(patternStr2.equals(PATTERN_LEFT_PIPE_U)){
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE_U)){
                        result+="5";
                    }
                    if(patternStr3.equals(PATTERN_DOUBLE_PIPE_U)){
                        result+="6";
                    }
                }
                if(patternStr2.equals(PATTERN_RIGHT_PIPE)){
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE)){
                        result+="7";
                    }
                }
                if(patternStr2.equals(PATTERN_DOUBLE_PIPE_U)){
                    if(patternStr3.equals(PATTERN_DOUBLE_PIPE_U)){
                        result+="8";
                    }
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE_U)){
                        result+="9";
                    }
                }
            }else if(patternStr1.equals(PATTERN_EMPTY)){
                if(patternStr2.equals(PATTERN_RIGHT_PIPE)){
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE)){
                        result+="1";
                    }
                }
                if(patternStr2.equals(PATTERN_DOUBLE_PIPE_U)){
                    if(patternStr3.equals(PATTERN_RIGHT_PIPE)){
                        result+="4";
                    }
                }
            }

        }
        System.out.println(result);
    }
}
