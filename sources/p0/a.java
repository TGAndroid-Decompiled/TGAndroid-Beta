package p0;
public final class a {
    public static final byte[] f53081e = new byte[1792];
    public final CharSequence f53082a;
    public final int f53083b;
    public int f53084c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f53081e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f53082a = charSequence;
        this.f53083b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f53082a;
        char charAt = charSequence.charAt(this.f53084c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f53084c);
            this.f53084c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f53084c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f53081e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
