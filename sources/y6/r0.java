package y6;

public final class r0 extends s0 {
    public final int d;

    public final int f49772e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.f49772e = i11;
    }

    @Override
    public final byte i(int i10) {
        int i11 = this.f49772e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f49776b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i0.a.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a9.p.j(i10, i11, "Index > length: ", ", "));
    }

    @Override
    public final byte n(int i10) {
        return this.f49776b[this.d + i10];
    }

    @Override
    public final int o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f49772e;
    }

    @Override
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.f49776b, this.d, bArr, 0, i10);
    }
}
