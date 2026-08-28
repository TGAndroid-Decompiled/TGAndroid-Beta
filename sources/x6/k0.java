package x6;
public final class k0 extends m0 {
    public final char[] f49032e;

    public k0(j0 j0Var) {
        super(j0Var, (Character) null);
        this.f49032e = new char[512];
        char[] cArr = j0Var.f49026b;
        if (cArr.length == 16) {
            for (int i9 = 0; i9 < 256; i9++) {
                char[] cArr2 = this.f49032e;
                cArr2[i9] = cArr[i9 >>> 4];
                cArr2[i9 | 256] = cArr[i9 & 15];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i9) {
        a.m(0, i9, bArr.length);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f49032e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
