package p0;
public final class a {
    public static final byte[] f45400e = new byte[1792];
    public final CharSequence f45401a;
    public final int f45402b;
    public int f45403c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45400e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45401a = charSequence;
        this.f45402b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45401a;
        char charAt = charSequence.charAt(this.f45403c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45403c);
            this.f45403c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45403c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return f45400e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
