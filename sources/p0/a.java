package p0;

public final class a {

    public static final byte[] f45326e = new byte[1792];

    public final CharSequence f45327a;

    public final int f45328b;

    public int f45329c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45326e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45327a = charSequence;
        this.f45328b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f45329c - 1;
        CharSequence charSequence = this.f45327a;
        char cCharAt = charSequence.charAt(i10);
        this.d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f45329c);
            this.f45329c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f45329c--;
        char c10 = this.d;
        return c10 < 1792 ? f45326e[c10] : Character.getDirectionality(c10);
    }
}
