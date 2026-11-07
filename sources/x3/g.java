package x3;

import f3.p;
public final class g {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] f58527a = new byte[8];
    public int f58528b;
    public int f58529c;

    public static long a(int i7, boolean z9, byte[] bArr) {
        long j3 = bArr[0] & 255;
        if (z9) {
            j3 &= ~d[i7 - 1];
        }
        for (int i10 = 1; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }

    public final long b(p pVar, boolean z9, boolean z10, int i7) {
        int i10;
        int i11 = this.f58528b;
        byte[] bArr = this.f58527a;
        if (i11 == 0) {
            if (!pVar.c(bArr, 0, 1, z9)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 < 8) {
                    if ((d[i13] & i12) != 0) {
                        i10 = i13 + 1;
                        break;
                    }
                    i13++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            this.f58529c = i10;
            if (i10 != -1) {
                this.f58528b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i14 = this.f58529c;
        if (i14 > i7) {
            this.f58528b = 0;
            return -2L;
        }
        if (i14 != 1) {
            pVar.readFully(bArr, 1, i14 - 1);
        }
        this.f58528b = 0;
        return a(this.f58529c, z10, bArr);
    }
}
