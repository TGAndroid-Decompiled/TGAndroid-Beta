package p7;

import k2.p1;
public final class s0 extends t0 {
    public final int d;
    public final int f53402e;

    public s0(byte[] bArr, int i3, int i10) {
        super(bArr);
        t0.n(i3, i3 + i10, bArr.length);
        this.d = i3;
        this.f53402e = i10;
    }

    @Override
    public final byte h(int i3) {
        int i10 = this.f53402e;
        if (((i10 - (i3 + 1)) | i3) < 0) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException(p1.i(i3, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a1.g.n(i3, i10, "Index > length: ", ", "));
        }
        return this.f53406b[this.d + i3];
    }

    @Override
    public final byte i(int i3) {
        return this.f53406b[this.d + i3];
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f53402e;
    }

    @Override
    public final void l(int i3, byte[] bArr) {
        System.arraycopy(this.f53406b, this.d, bArr, 0, i3);
    }
}
