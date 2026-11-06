package p0;
public final class a {
    public static final byte[] f52976e = new byte[1792];
    public final CharSequence f52977a;
    public final int f52978b;
    public int f52979c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f52976e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f52977a = charSequence;
        this.f52978b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f52977a;
        char charAt = charSequence.charAt(this.f52979c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f52979c);
            this.f52979c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f52979c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f52976e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
