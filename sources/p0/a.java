package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40924a;
    public final int f40925b;
    public int f40926c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40924a = charSequence;
        this.f40925b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40924a;
        char charAt = charSequence.charAt(this.f40926c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40926c);
            this.f40926c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40926c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
