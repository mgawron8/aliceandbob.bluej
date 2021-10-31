/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:05 PM
 */
public class AliceAndBobEngine {
    /**
     * return `true` if the input value is "Alice"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice"
     */
    public Boolean isAlice(String input) {
        Boolean comparison = false;
        
        if ( input.equalsIgnoreCase("Alice")) {
            comparison = true;
        }
        
        
        return comparison;
    }

    /**
     * return `true` if the input value is "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Bob"
     */
    public Boolean isBob(String input) {
        Boolean comparison = false;
        
        if ( input.equalsIgnoreCase("bob")) {
            comparison = true;
        }
        
        
        return comparison;
    }

    /**
     * return `true` if the input value is "Alice" or "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice" or "Bob"
     */
    public Boolean isAliceOrBob(String input) {
        Boolean comparison = false;
        
        if ( input.equalsIgnoreCase("Alice") || input.equalsIgnoreCase("bob")) {
            comparison = true;
        }
        
        
        return comparison;
    }

    /**
     * if the input value is "Alice" or "Bob", then
     *      return "Hello PERSONSNAME!",
     * otherwise
     *      return "Begone, PERSONNAME! You're a stranger!",
     * where `PERSONNAME` is replaced with the person's name respectively.
     *
     * @param input - this value is variable: it has the potential to be many things
     * @return respective String value
     */
    public String getGreeting(String input) {
        
        
        if ( input.equalsIgnoreCase("Alice") || input.equalsIgnoreCase("bob")) {
            return ("Hello, " + input + "!");
        } else {
            return ("Begone, " + input + "! You're a stranger!");
        }
        
        
        
    }
}
