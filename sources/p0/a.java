package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f39507a;
    public final int f39508b;
    public int f39509c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f39507a = charSequence;
        this.f39508b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f39507a;
        char charAt = charSequence.charAt(this.f39509c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f39509c);
            this.f39509c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f39509c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
