package w3;

import d5.g0;

public final class v {

    public final int f49214a;

    public final d5.f0 f49215b;

    public final d5.z f49216c;
    public boolean d;

    public boolean f49217e;

    public boolean f49218f;

    public long f49219g;
    public long h;

    public long f49220i;

    public v(int i10) {
        this.f49214a = i10;
        switch (i10) {
            case 1:
                this.f49215b = new d5.f0(0L);
                this.f49219g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f49220i = -9223372036854775807L;
                this.f49216c = new d5.z();
                break;
            default:
                this.f49215b = new d5.f0(0L);
                this.f49219g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f49220i = -9223372036854775807L;
                this.f49216c = new d5.z();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(d5.z zVar) {
        int i10 = zVar.f4859b;
        if (zVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zVar.c(0, 9, bArr);
        zVar.C(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(m3.l lVar) {
        switch (this.f49214a) {
            case 0:
                byte[] bArr = g0.f4799f;
                d5.z zVar = this.f49216c;
                zVar.getClass();
                zVar.A(bArr.length, bArr);
                this.d = true;
                lVar.q();
                break;
            default:
                byte[] bArr2 = g0.f4799f;
                d5.z zVar2 = this.f49216c;
                zVar2.getClass();
                zVar2.A(bArr2.length, bArr2);
                this.d = true;
                lVar.q();
                break;
        }
    }
}
