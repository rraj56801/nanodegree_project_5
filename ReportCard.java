public class ReportCard {
    /**
     * ArrayList for storing score values
     */
    private ArrayList<Float> mScore = new ArrayList<Float>();
    /**
     * ArrayList for storing enrolled subjects
     */
    private ArrayList<String> mSubjects = new ArrayList<String>();
    /**
     * Final score
     */
    private float mFinalScore;
    /**
     * String with all scores
     */
    private String totalScores;

    /**
     * Create a new ReportCard object.
     *
     * @param mathsScore
     * @param chemistryScore
     * @param physicsScore
     * @param computerScore
     * @param literatureScore
     */
    public ReportCard(float mathsScore, float chemistryScore, float physicsScore, float computerScore, float literatureScore) {
        mSubjects.add(0, "Maths");
        mSubjects.add(1, "Chemistry");
        mSubjects.add(2, "Physics");
        mSubjects.add(3, "Computer");
        mSubjects.add(4, "Literature");
        mScore.add(0, mathsScore);
        mScore.add(1, chemistryScore);
        mScore.add(2, physicsScore);
        mScore.add(3, computerScore);
        mScore.add(4, literatureScore);
    }

    /**
     * Set the score for Maths
     */
    public void setmMathsScore(float score) {
        mScore.set(0, score);
    }

    /**
     * Set the score for Chemistry
     */
    public void setmChemistryScore(float score) {
        mScore.set(1, score);
    }

    /**
     * Set the score for Physics
     */
    public void setmPhysicsScore(float score) {
        mScore.set(2, score);
    }

    /**
     * Set the score for Computer
     */
    public void setmComputerScore(float score) {
        mScore.set(3, score);
    }

    /**
     * Set the score for Literature
     */
    public void setmLiteratureScore(float score) {
        mScore.set(4, score);
    }

    /**
     * Get the Score for Maths
     */
    public float getmMathsScore() {
        float score = mScore.get(0);
        return score;
    }

    /**
     * Get the score for Chemistry
     */
    public float getmChemistryScore() {
        float score = mScore.get(1);
        return score;
    }

    /**
     * Get the score for Physics
     */
    public float getmPhysicsScore() {
        float score = mScore.get(2);
        return score;
    }

    /**
     * Get the score for Computer
     */
    public float getmComputerScore() {
        float score = mScore.get(3);
        return score;
    }

    /**
     * Get the score for Literature
     */
    public float getmLiteratureScore() {
        float score = mScore.get(4);
        return score;
    }

    /**
     * Get the final score by calculating it
     */
    public float getmFinalScore() {
        mFinalScore = 0;
        for (int i = 0; i < mScore.size(); i++) {
            float score = mScore.get(i);
            mFinalScore = mFinalScore + score;
        }
        return mFinalScore;
    }

    @Override
    public String toString() {
        totalScores = "";
        for (int i = 0; i < mScore.size(); i++) {
            float score = mScore.get(i);
            String subject = mSubjects.get(i);
            totalScores = totalScores + subject + ": " + score + "\n";
        }
        totalScores = totalScores + "Final Score: " + mFinalScore;
        return totalScores;
    }
}