package q7;
public final class k0 extends m0 {
    public final char[] f54009e;

    public k0(j0 j0Var) {
        super(j0Var, (Character) null);
        this.f54009e = new char[512];
        char[] cArr = j0Var.f54003b;
        if (cArr.length == 16) {
            for (int i7 = 0; i7 < 256; i7++) {
                char[] cArr2 = this.f54009e;
                cArr2[i7] = cArr[i7 >>> 4];
                cArr2[i7 | 256] = cArr[i7 & 15];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i7) {
        a.m(0, i7, bArr.length);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f54009e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
