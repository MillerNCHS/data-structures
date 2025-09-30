import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Checks whether HTML tags are properly nested.
 */
public class HTMLChecker {
    public static void main(String[] args) {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample1.html";
        Stack<String> tagStack = new Stack<>();
        boolean check = true;

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNext()) {
                String tag = in.next();

                if (tag.startsWith("</")) {
                    String close = tag.substring(2, tag.length() - 1);
                    if (tagStack.size() == 0) {
                        System.out.println("Error: Closing tag </" + close + "> with no opening tag.");
                        check = false;
                        break;
                    }

                    String open = tagStack.pop();
                    if (!open.equals(close)) {
                        System.out.println("Error: Tag mismatch. Expected </" + open + ">, found </" + close + ">.");
                        check = false;
                        break;
                    }
                } else if (tag.startsWith("<")) {
                    // Opening tag
                    String open = tag.substring(1, tag.length() - 1);
                    tagStack.push(open);
                }
            }

            if (check) {
                if (tagStack.isEmpty()) {
                    System.out.println("Tags are properly nested.");
                } else {
                    System.out.println("Error: Unclosed tags remaining:");
                    while (!tagStack.isEmpty()) {
                        System.out.println("Unclosed: <" + tagStack.pop() + ">");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Cannot open: " + filename);
        }
    }
}
