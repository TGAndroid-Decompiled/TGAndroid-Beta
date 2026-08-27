package qb;

public enum d {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    public final int[] f46194a;

    public final int f46195b;

    d(int[] iArr, int i10) {
        this.f46194a = iArr;
        this.f46195b = i10;
    }

    public final int a(e eVar) {
        char c10;
        int i10 = eVar.f46198a;
        if (i10 <= 9) {
            c10 = 0;
        } else {
            c10 = i10 <= 26 ? (char) 1 : (char) 2;
        }
        return this.f46194a[c10];
    }
}
