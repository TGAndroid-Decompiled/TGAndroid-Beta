package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40697a;
    public final int f40698b;
    public int f40699c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40697a = charSequence;
        this.f40698b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40697a;
        char charAt = charSequence.charAt(this.f40699c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40699c);
            this.f40699c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40699c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
