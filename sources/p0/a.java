package p0;
public final class a {
    public static final byte[] f53043e = new byte[1792];
    public final CharSequence f53044a;
    public final int f53045b;
    public int f53046c;
    public char d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f53043e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f53044a = charSequence;
        this.f53045b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f53044a;
        char charAt = charSequence.charAt(this.f53046c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f53046c);
            this.f53046c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f53046c--;
        char c2 = this.d;
        if (c2 < 1792) {
            return f53043e[c2];
        }
        return Character.getDirectionality(c2);
    }
}
