public class Bone {

    private static final String[][] ALL_BONES_TEXTS = {
            /* L  R->     0                1             2               3                  4           5               6  */
            /* 0 */{"\uD83C\uDC31", "\uD83C\uDC32", "\uD83C\uDC33", "\uD83C\uDC34", "\uD83C\uDC35", "\uD83C\uDC36", "\uD83C\uDC37"},
            /* 1 */{"\uD83C\uDC38", "\uD83C\uDC39", "\uD83C\uDC3A", "\uD83C\uDC3B", "\uD83C\uDC3C", "\uD83C\uDC3D", "\uD83C\uDC3E"},
            /* 2 */{"\uD83C\uDC3F", "\uD83C\uDC40", "\uD83C\uDC41", "\uD83C\uDC42", "\uD83C\uDC43", "\uD83C\uDC44", "\uD83C\uDC45"},
            /* 3 */{"\uD83C\uDC46", "\uD83C\uDC47", "\uD83C\uDC48", "\uD83C\uDC49", "\uD83C\uDC4A", "\uD83C\uDC4B", "\uD83C\uDC4C"},
            /* 4 */{"\uD83C\uDC4D", "\uD83C\uDC4E", "\uD83C\uDC4F", "\uD83C\uDC50", "\uD83C\uDC51", "\uD83C\uDC52", "\uD83C\uDC53"},
            /* 5 */{"\uD83C\uDC54", "\uD83C\uDC55", "\uD83C\uDC56", "\uD83C\uDC57", "\uD83C\uDC58", "\uD83C\uDC59", "\uD83C\uDC5A"},
            /* 6 */{"\uD83C\uDC5B", "\uD83C\uDC5C", "\uD83C\uDC5D", "\uD83C\uDC5E", "\uD83C\uDC5F", "\uD83C\uDC60", "\uD83C\uDC61"},
    };

    private int aLeft;
    private int aRight;


    public Bone(int aLeft, int aRight) {
        this.aLeft = aLeft;
        this.aRight = aRight;
    }

    public void flip() {
        int tmp = aLeft;
        aLeft = aRight;
        aRight = tmp;

    }

    @Override
    public String toString() {
        return ALL_BONES_TEXTS[aLeft][aRight];
    }

}
