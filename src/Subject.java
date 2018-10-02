

public enum Subject {
    HISTORY,
    LITERATURE,
    ENGLISH,
    CHEMISTRY,
    ALGEBRA,
    PHYSICS;

    public static Subject seeSubject(String subject) {
        Subject[] values = values();
        for (Subject value : values) {
            String subjectName = value.name();
            if (subjectName.equalsIgnoreCase(subject)) {
                return value;
            }
        }
        return null;
    }


}