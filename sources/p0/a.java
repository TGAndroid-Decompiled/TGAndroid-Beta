package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f42817a;
    public final int f42818b;
    public int f42819c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f42817a = charSequence;
        this.f42818b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f42817a;
        char charAt = charSequence.charAt(this.f42819c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f42819c);
            this.f42819c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f42819c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
