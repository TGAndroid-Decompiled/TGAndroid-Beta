package q7;
public final class r0 extends s0 {
    public final int d;
    public final int f56052e;

    public r0(byte[] bArr, int i7, int i10) {
        super(bArr);
        s0.n(i7, i7 + i10, bArr.length);
        this.d = i7;
        this.f56052e = i10;
    }

    @Override
    public final byte f(int i7) {
        int i10 = this.f56052e;
        if (((i10 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(i5.c.i(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a8.p0.m(i7, i10, "Index > length: ", ", "));
        }
        return this.f56056b[this.d + i7];
    }

    @Override
    public final byte i(int i7) {
        return this.f56056b[this.d + i7];
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f56052e;
    }

    @Override
    public final void l(int i7, byte[] bArr) {
        System.arraycopy(this.f56056b, this.d, bArr, 0, i7);
    }
}
