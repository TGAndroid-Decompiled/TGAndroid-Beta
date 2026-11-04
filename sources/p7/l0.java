package p7;
public final class l0 extends n0 {
    public final char[] f53379e;

    public l0(k0 k0Var) {
        super(k0Var, (Character) null);
        this.f53379e = new char[512];
        char[] cArr = k0Var.f53373b;
        if (cArr.length == 16) {
            for (int i3 = 0; i3 < 256; i3++) {
                char[] cArr2 = this.f53379e;
                cArr2[i3] = cArr[i3 >>> 4];
                cArr2[i3 | 256] = cArr[i3 & 15];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i3) {
        a.m(0, i3, bArr.length);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f53379e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
