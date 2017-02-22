package csc445.lye.edu.missouriwestern.mathquiz;

/**
 * Created by Lisa on 2/15/2017.
 */

public class Question {
    private int mTextResId;
    private int mAnswerTrue;

    public Question (int textResId, int answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(int answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
