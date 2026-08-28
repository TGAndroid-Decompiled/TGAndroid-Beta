package w3;

import d5.f0;
public final class v {
    public final int f48708a;
    public final d5.e0 f48709b;
    public final d5.y f48710c;
    public boolean d;
    public boolean f48711e;
    public boolean f48712f;
    public long f48713g;
    public long h;
    public long f48714i;

    public v(int i9) {
        this.f48708a = i9;
        switch (i9) {
            case 1:
                this.f48709b = new d5.e0(0L);
                this.f48713g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f48714i = -9223372036854775807L;
                this.f48710c = new d5.y();
                return;
            default:
                this.f48709b = new d5.e0(0L);
                this.f48713g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f48714i = -9223372036854775807L;
                this.f48710c = new d5.y();
                return;
        }
    }

    public static int b(int i9, byte[] bArr) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public static long c(d5.y yVar) {
        int i9 = yVar.f4411b;
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.c(0, 9, bArr);
        yVar.C(i9);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(m3.l lVar) {
        switch (this.f48708a) {
            case 0:
                byte[] bArr = f0.f4353f;
                d5.y yVar = this.f48710c;
                yVar.getClass();
                yVar.A(bArr.length, bArr);
                this.d = true;
                lVar.t();
                return;
            default:
                byte[] bArr2 = f0.f4353f;
                d5.y yVar2 = this.f48710c;
                yVar2.getClass();
                yVar2.A(bArr2.length, bArr2);
                this.d = true;
                lVar.t();
                return;
        }
    }
}
