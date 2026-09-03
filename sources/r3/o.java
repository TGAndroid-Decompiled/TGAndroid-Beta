package r3;

import h5.d0;
import j3.m0;
import j3.n0;
import java.util.Collections;
import q5.c0;
public final class o {
    public final int f43255a;
    public final int f43256b;
    public final int f43257c;
    public final int d;
    public final int e;
    public final int f43258f;
    public final int f43259g;
    public final int h;
    public final int f43260i;
    public final long f43261j;
    public final c0 f43262k;
    public final e4.c f43263l;

    public o(byte[] bArr, int i10) {
        h5.v vVar = new h5.v(bArr, bArr.length);
        vVar.p(i10 * 8);
        this.f43255a = vVar.i(16);
        this.f43256b = vVar.i(16);
        this.f43257c = vVar.i(24);
        this.d = vVar.i(24);
        int i11 = vVar.i(20);
        this.e = i11;
        this.f43258f = d(i11);
        this.f43259g = vVar.i(3) + 1;
        int i12 = vVar.i(5) + 1;
        this.h = i12;
        this.f43260i = a(i12);
        int i13 = vVar.i(4);
        int i14 = vVar.i(32);
        int i15 = d0.f6924a;
        this.f43261j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f43262k = null;
        this.f43263l = null;
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
        long j10 = this.f43261j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final n0 c(byte[] bArr, e4.c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        e4.c cVar2 = this.f43263l;
        if (cVar2 != null) {
            if (cVar == null) {
                cVar = cVar2;
            } else {
                cVar = cVar2.a(cVar.f5109a);
            }
        }
        m0 m0Var = new m0();
        m0Var.f8666o = "audio/flac";
        m0Var.f8667p = i10;
        m0Var.B = this.f43259g;
        m0Var.C = this.e;
        m0Var.f8668q = Collections.singletonList(bArr);
        m0Var.f8660i = cVar;
        return new n0(m0Var);
    }

    public o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, c0 c0Var, e4.c cVar) {
        this.f43255a = i10;
        this.f43256b = i11;
        this.f43257c = i12;
        this.d = i13;
        this.e = i14;
        this.f43258f = d(i14);
        this.f43259g = i15;
        this.h = i16;
        this.f43260i = a(i16);
        this.f43261j = j10;
        this.f43262k = c0Var;
        this.f43263l = cVar;
    }
}
