package RansomProblem;

public class Main {
    
    public static void main(String[] args) {
        boolean result1 = Problem.canConstruct("aabc", "abanca");
        System.out.println("Create a ransom note 'aabc' from the magazine 'abanca' : " + result1);
        boolean result2 = Problem.canConstruct("cc", "abanca");
        System.out.println("Create a ransom note 'cc' from the magazine 'abanca' : " + result2);
        boolean result3 = Problem.canConstruct("dena", "danea");
        System.out.println("Create a ransom note 'dena' from the magazine 'danea' : " + result3);
        boolean result4 = Problem.canConstruct("never eat shredded weat", "you cannot ever defeat me with a dead will like that");
        System.out.println("Create a ransom note 'never eat shredded weat' from the magazine 'you cannot ever defeat me with a dead will like that' : " + result4);
        boolean result5 = Problem.canConstruct("I like pizza", "I don't like pizza");
        System.out.println("Create a ransom note 'I like pizza' from the magazine 'I don't like pizza' : " + result5);
        boolean result6 = Problem.canConstruct("make it", "take it");
        System.out.println("Create a ransom note 'make it' from the magazine 'take them' : " + result6);
    }
}
