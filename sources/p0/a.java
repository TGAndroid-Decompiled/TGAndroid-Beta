package p0;
public final class a {
    public static final byte[] f53069e = new byte[1792];
    public final CharSequence f53070a;
    public final int f53071b;
    public int f53072c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f53069e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f53070a = charSequence;
        this.f53071b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f53070a;
        char charAt = charSequence.charAt(this.f53072c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f53072c);
            this.f53072c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f53072c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f53069e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
