package y3;
public final class v {
    public final int f50441a;
    public final f5.c0 f50442b;
    public final f5.w f50443c;
    public boolean d;
    public boolean f50444e;
    public boolean f50445f;
    public long f50446g;
    public long h;
    public long f50447i;

    public v(int i10) {
        this.f50441a = i10;
        switch (i10) {
            case 1:
                this.f50442b = new f5.c0(0L);
                this.f50446g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f50447i = -9223372036854775807L;
                this.f50443c = new f5.w();
                return;
            default:
                this.f50442b = new f5.c0(0L);
                this.f50446g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f50447i = -9223372036854775807L;
                this.f50443c = new f5.w();
                return;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(f5.w wVar) {
        int i10 = wVar.f6641b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.c(0, 9, bArr);
        wVar.C(i10);
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

    public final void a(o3.l lVar) {
        switch (this.f50441a) {
            case 0:
                byte[] bArr = f5.d0.f6583f;
                f5.w wVar = this.f50443c;
                wVar.getClass();
                wVar.A(bArr.length, bArr);
                this.d = true;
                lVar.s();
                return;
            default:
                byte[] bArr2 = f5.d0.f6583f;
                f5.w wVar2 = this.f50443c;
                wVar2.getClass();
                wVar2.A(bArr2.length, bArr2);
                this.d = true;
                lVar.s();
                return;
        }
    }
}
