package yb;

import k2.p1;
public final class g extends d {
    public final byte[] f59363c;
    public final int d;
    public final int f59364e;

    public g(int i3, int i10, int[] iArr) {
        super(i3, i10);
        int i11 = i3 * i10;
        if (iArr.length >= i11) {
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = iArr[i12];
                bArr[i12] = (byte) (((((i13 >> 16) & 255) + ((i13 >> 7) & 510)) + (i13 & 255)) / 4);
            }
            this.f59363c = bArr;
            this.d = i3;
            this.f59364e = i10;
            return;
        }
        throw new IllegalArgumentException("Pixel array length is less than width * height");
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.f59363c;
        int i3 = this.f59357a;
        int i10 = this.f59358b;
        int i11 = this.d;
        if (i3 == i11 && i10 == this.f59364e) {
            return bArr;
        }
        int i12 = i3 * i10;
        byte[] bArr2 = new byte[i12];
        if (i3 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i3, i3);
            i13 += i11;
        }
        return bArr2;
    }

    @Override
    public final byte[] b(int i3, byte[] bArr) {
        if (i3 >= 0 && i3 < this.f59358b) {
            int i10 = this.f59357a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(this.f59363c, i3 * this.d, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(p1.i(i3, "Requested row is outside the image: "));
    }
}
