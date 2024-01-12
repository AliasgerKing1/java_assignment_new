package assignment1;
import java.util.Scanner;

class assignment1 {
    public static void main(String args[]) {
        String resultent_String = "";
        Scanner sc = new Scanner(System.in);
        String userInp = sc.nextLine();
        int length = userInp.length();
        for(int i = 0; i < length; i++) {
            int eachNum = Character.getNumericValue(userInp.charAt(i));
            if(eachNum >= 0 && eachNum <= 9) {
                if(length - i == 2) {
                    if(eachNum == 1) {
                        switch(Character.getNumericValue(userInp.charAt(i+1))) {
                            case 0:
                                resultent_String += "Ten ";
                                break;
                            case 1:
                                resultent_String += "Eleven ";
                                break;
                            case 2:
                                resultent_String += "Twelve ";
                                break;
                            case 3:
                                resultent_String += "Thirteen ";
                                break;
                            case 4:
                                resultent_String += "Fourteen ";
                                break;
                            case 5:
                                resultent_String += "Fifteen ";
                                break;
                            case 6:
                                resultent_String += "Sixteen ";
                                break;
                            case 7:
                                resultent_String += "Seventeen ";
                                break;
                            case 8:
                                resultent_String += "Eighteen ";
                                break;
                            case 9:
                                resultent_String += "Nineteen ";
                                break;
                        }
                        i++;
                        continue;
                    } else if(eachNum == 2) {
                        resultent_String += "Twenty ";
                        continue;
                    } else if(eachNum == 3) {
                        resultent_String += "Thirty ";
                        continue;
                    } else if(eachNum == 4) {
                        resultent_String += "Forty ";
                        continue;
                    } else if(eachNum == 5) {
                        resultent_String += "Fifty ";
                        continue;
                    } else if(eachNum == 6) {
                        resultent_String += "Sixty ";
                        continue;
                    } else if(eachNum == 7) {
                        resultent_String += "Seventy ";
                        continue;
                    } else if(eachNum == 8) {
                        resultent_String += "Eighty ";
                        continue;
                    } else if(eachNum == 9) {
                        resultent_String += "Ninety ";
                        continue;
                    }
                }
                switch (eachNum) {
                    case 0:
                        if(i == 0) {
                            System.out.println("never start with Zero");
                            return;
                        } else {
                            resultent_String += "Zero ";
                        }
                        break;
                    case 1:
                        resultent_String += "One ";
                        break;
                    case 2:
                        resultent_String += "Two ";
                        break;
                    case 3:
                        resultent_String += "Three ";
                        break;
                    case 4:
                        resultent_String += "Four ";
                        break;
                    case 5:
                        resultent_String += "Five ";
                        break;
                    case 6:
                        resultent_String += "Six ";
                        break;
                    case 7:
                        resultent_String += "Seven ";
                        break;
                    case 8:
                        resultent_String += "Eight ";
                        break;
                    case 9:
                        resultent_String += "Nine ";
                        break;
                }
                if(length - i == 4) {
                    resultent_String += "Thousand ";
                } else if(length - i == 3) {
                    resultent_String += "Hundred ";
                }
            } else {
                System.out.println(eachNum + " = not a valid num");
            }
        }
        System.out.println(resultent_String.trim());
    }
}
