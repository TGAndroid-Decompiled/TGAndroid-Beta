package q7;
public final class r0 extends s0 {
    public final int d;
    public final int f54019e;

    public r0(byte[] bArr, int i7, int i10) {
        super(bArr);
        s0.n(i7, i7 + i10, bArr.length);
        this.d = i7;
        this.f54019e = i10;
    }

    @Override
    public final byte f(int i7) {
        int i10 = this.f54019e;
        if (((i10 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(jg.g.j(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a8.p0.m(i7, i10, "Index > length: ", ", "));
        }
        return this.f54023b[this.d + i7];
    }

    @Override
    public final byte i(int i7) {
        return this.f54023b[this.d + i7];
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f54019e;
    }

    @Override
    public final void l(int i7, byte[] bArr) {
        System.arraycopy(this.f54023b, this.d, bArr, 0, i7);
    }
}
