package tb;
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
    
    public final int[] f44697a;
    public final int f44698b;

    d(int[] iArr, int i10) {
        this.f44697a = iArr;
        this.f44698b = i10;
    }

    public final int a(e eVar) {
        char c3;
        int i10 = eVar.f44700a;
        if (i10 <= 9) {
            c3 = 0;
        } else if (i10 <= 26) {
            c3 = 1;
        } else {
            c3 = 2;
        }
        return this.f44697a[c3];
    }
}
