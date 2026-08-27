package y6;

public final class k0 extends m0 {

    public final char[] f49749e;

    public k0(j0 j0Var) {
        super(j0Var, (Character) null);
        this.f49749e = new char[512];
        char[] cArr = j0Var.f49743b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f49749e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        a.m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f49749e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
