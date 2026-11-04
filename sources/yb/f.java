package yb;

import k2.p1;
public final class f extends d {
    public final int f59360c;
    public final int d;
    public final int f59361e;
    public final int f59362f;

    public f(int i3, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 <= i3 && i14 + i12 <= i10) {
            this.f59360c = i3;
            this.d = i10;
            this.f59361e = i11;
            this.f59362f = i12;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override
    public final byte[] a() {
        int i3 = this.f59357a;
        int i10 = this.f59358b;
        int i11 = this.f59360c;
        if (i3 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i3 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f59362f * i11) + this.f59361e;
        if (i3 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i3, i3);
            i13 += i11;
        }
        return bArr;
    }

    @Override
    public final byte[] b(int i3, byte[] bArr) {
        if (i3 >= 0 && i3 < this.f59358b) {
            int i10 = this.f59357a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(null, ((i3 + this.f59362f) * this.f59360c) + this.f59361e, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(p1.i(i3, "Requested row is outside the image: "));
    }
}
