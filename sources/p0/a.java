package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40401a;
    public final int f40402b;
    public int f40403c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40401a = charSequence;
        this.f40402b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40401a;
        char charAt = charSequence.charAt(this.f40403c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40403c);
            this.f40403c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40403c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
