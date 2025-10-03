package task1;

import java.util.List;

public class Trial extends Test{

    public Trial(String title, List<Question> questions) {
        super(title, Integer.MAX_VALUE, questions);
    }
}
