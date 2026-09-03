package r3;

import h5.d0;
import j3.m0;
import j3.n0;
import java.util.Collections;
import q5.c0;
public final class o {
    public final int f46597a;
    public final int f46598b;
    public final int f46599c;
    public final int d;
    public final int f46600e;
    public final int f46601f;
    public final int f46602g;
    public final int h;
    public final int f46603i;
    public final long f46604j;
    public final c0 f46605k;
    public final e4.c f46606l;

    public o(byte[] bArr, int i10) {
        h5.v vVar = new h5.v(bArr, bArr.length);
        vVar.p(i10 * 8);
        this.f46597a = vVar.i(16);
        this.f46598b = vVar.i(16);
        this.f46599c = vVar.i(24);
        this.d = vVar.i(24);
        int i11 = vVar.i(20);
        this.f46600e = i11;
        this.f46601f = d(i11);
        this.f46602g = vVar.i(3) + 1;
        int i12 = vVar.i(5) + 1;
        this.h = i12;
        this.f46603i = a(i12);
        int i13 = vVar.i(4);
        int i14 = vVar.i(32);
        int i15 = d0.f7237a;
        this.f46604j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f46605k = null;
        this.f46606l = null;
    }

    public static int a(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f46604j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f46600e;
    }

    public final n0 c(byte[] bArr, e4.c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        e4.c cVar2 = this.f46606l;
        if (cVar2 != null) {
            if (cVar == null) {
                cVar = cVar2;
            } else {
                cVar = cVar2.a(cVar.f4938a);
            }
        }
        m0 m0Var = new m0();
        m0Var.f9265o = "audio/flac";
        m0Var.f9266p = i10;
        m0Var.B = this.f46602g;
        m0Var.C = this.f46600e;
        m0Var.f9267q = Collections.singletonList(bArr);
        m0Var.f9259i = cVar;
        return new n0(m0Var);
    }

    public o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, c0 c0Var, e4.c cVar) {
        this.f46597a = i10;
        this.f46598b = i11;
        this.f46599c = i12;
        this.d = i13;
        this.f46600e = i14;
        this.f46601f = d(i14);
        this.f46602g = i15;
        this.h = i16;
        this.f46603i = a(i16);
        this.f46604j = j10;
        this.f46605k = c0Var;
        this.f46606l = cVar;
    }
}
