package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f43898a;
    public final int f43899b;
    public int f43900c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43898a = charSequence;
        this.f43899b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43898a;
        char charAt = charSequence.charAt(this.f43900c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43900c);
            this.f43900c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43900c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
