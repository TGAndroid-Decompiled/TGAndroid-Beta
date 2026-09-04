package p0;
public final class a {
    public static final byte[] f43622e = new byte[1792];
    public final CharSequence f43623a;
    public final int f43624b;
    public int f43625c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43622e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43623a = charSequence;
        this.f43624b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43623a;
        char charAt = charSequence.charAt(this.f43625c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43625c);
            this.f43625c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43625c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43622e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
