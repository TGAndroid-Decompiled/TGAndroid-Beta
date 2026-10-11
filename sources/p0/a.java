package p0;
public final class a {
    public static final byte[] f45212e = new byte[1792];
    public final CharSequence f45213a;
    public final int f45214b;
    public int f45215c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45212e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45213a = charSequence;
        this.f45214b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45213a;
        char charAt = charSequence.charAt(this.f45215c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45215c);
            this.f45215c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45215c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45212e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
