package x3;

import r3.l;
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] f46763a = new byte[8];
    public int f46764b;
    public int f46765c;

    public static long a(int i10, boolean z4, byte[] bArr) {
        long j10 = bArr[0] & 255;
        if (z4) {
            j10 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z4, boolean z10, int i10) {
        int i11;
        int i12 = this.f46764b;
        byte[] bArr = this.f46763a;
        if (i12 == 0) {
            if (!lVar.d(bArr, 0, 1, z4)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 < 8) {
                    if ((d[i14] & i13) != 0) {
                        i11 = i14 + 1;
                        break;
                    }
                    i14++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            this.f46765c = i11;
            if (i11 != -1) {
                this.f46764b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i15 = this.f46765c;
        if (i15 > i10) {
            this.f46764b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.f46764b = 0;
        return a(this.f46765c, z10, bArr);
    }
}
