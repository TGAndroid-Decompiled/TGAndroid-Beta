package p0;
public final class a {
    public static final byte[] f45024e = new byte[1792];
    public final CharSequence f45025a;
    public final int f45026b;
    public int f45027c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45024e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45025a = charSequence;
        this.f45026b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45025a;
        char charAt = charSequence.charAt(this.f45027c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45027c);
            this.f45027c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45027c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45024e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
