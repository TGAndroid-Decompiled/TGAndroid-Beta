package u3;

import c3.p;
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] f46956a = new byte[8];
    public int f46957b;
    public int f46958c;

    public static long a(int i10, boolean z10, byte[] bArr) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final long b(p pVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f46957b;
        byte[] bArr = this.f46956a;
        if (i12 == 0) {
            if (!pVar.d(bArr, 0, 1, z10)) {
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
            this.f46958c = i11;
            if (i11 != -1) {
                this.f46957b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i15 = this.f46958c;
        if (i15 > i10) {
            this.f46957b = 0;
            return -2L;
        }
        if (i15 != 1) {
            pVar.readFully(bArr, 1, i15 - 1);
        }
        this.f46957b = 0;
        return a(this.f46958c, z11, bArr);
    }
}
