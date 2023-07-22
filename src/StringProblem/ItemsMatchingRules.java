package StringProblem;

import java.util.List;

public class ItemsMatchingRules {
    public static void main(String[] args) {

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count  = 0;
        if (ruleKey.equals("type")) {
            count = checkForMatches(items, ruleKey, ruleValue, 0);
        }
        else if (ruleKey.equals("color")) {
            count = checkForMatches(items, ruleKey, ruleValue, 1);
        }
        else {
            count = checkForMatches(items, ruleKey, ruleValue, 2);
        }
        return count;
    }

    //to check for matching value
    static int checkForMatches(List<List<String>> items, String ruleKey, String ruleValue, int col) {
        int count = 0;
        for (int r = 0; r < items.size(); r++) {
            if (items.get(r).get(col).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
