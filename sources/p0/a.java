package p0;
public final class a {
    public static final byte[] f43623e = new byte[1792];
    public final CharSequence f43624a;
    public final int f43625b;
    public int f43626c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43623e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43624a = charSequence;
        this.f43625b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43624a;
        char charAt = charSequence.charAt(this.f43626c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43626c);
            this.f43626c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43626c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43623e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
