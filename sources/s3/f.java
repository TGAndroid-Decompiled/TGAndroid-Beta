package s3;

import m3.l;

public final class f {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    public final byte[] f47723a = new byte[8];

    public int f47724b;

    public int f47725c;

    public static long a(int i10, boolean z10, byte[] bArr) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f47724b;
        byte[] bArr = this.f47723a;
        if (i12 == 0) {
            if (!lVar.d(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f47725c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f47724b = 1;
        }
        int i15 = this.f47725c;
        if (i15 > i10) {
            this.f47724b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.f47724b = 0;
        return a(this.f47725c, z11, bArr);
    }
}
