package x6;
public final class r0 extends s0 {
    public final int d;
    public final int f49055e;

    public r0(byte[] bArr, int i9, int i10) {
        super(bArr);
        s0.s(i9, i9 + i10, bArr.length);
        this.d = i9;
        this.f49055e = i10;
    }

    @Override
    public final byte i(int i9) {
        int i10 = this.f49055e;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(j3.r0.l(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(aa.d.k(i9, i10, "Index > length: ", ", "));
        }
        return this.f49059b[this.d + i9];
    }

    @Override
    public final byte n(int i9) {
        return this.f49059b[this.d + i9];
    }

    @Override
    public final int o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f49055e;
    }

    @Override
    public final void q(int i9, byte[] bArr) {
        System.arraycopy(this.f49059b, this.d, bArr, 0, i9);
    }
}
