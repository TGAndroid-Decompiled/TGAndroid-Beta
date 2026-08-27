package x3;

import c2.a1;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import m3.l;
import m3.m;
import m3.w;

public final class a implements b {

    public static final int[] f49338m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    public static final int[] f49339n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    public final m f49340a;

    public final w f49341b;

    public final a1 f49342c;
    public final int d;

    public final byte[] f49343e;

    public final z f49344f;

    public final int f49345g;
    public final t0 h;

    public int f49346i;

    public long f49347j;

    public int f49348k;

    public long f49349l;

    public a(m mVar, w wVar, a1 a1Var) throws t1 {
        this.f49340a = mVar;
        this.f49341b = wVar;
        this.f49342c = a1Var;
        int i10 = a1Var.f2230b;
        int iMax = Math.max(1, i10 / 10);
        this.f49345g = iMax;
        z zVar = new z((byte[]) a1Var.f2232e);
        zVar.k();
        int iK = zVar.k();
        this.d = iK;
        int i11 = a1Var.f2229a;
        int i12 = a1Var.f2231c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (a1Var.d * i11)) + 1;
        if (iK != i13) {
            throw t1.a("Expected frames per block: " + i13 + "; got: " + iK, null);
        }
        int iF = g0.f(iMax, iK);
        this.f49343e = new byte[iF * i12];
        this.f49344f = new z(iK * 2 * i11 * iF);
        int i14 = ((i12 * i10) * 8) / iK;
        s0 s0Var = new s0();
        s0Var.f8135o = "audio/raw";
        s0Var.f8127f = i14;
        s0Var.f8128g = i14;
        s0Var.f8136p = iMax * 2 * i11;
        s0Var.B = i11;
        s0Var.C = i10;
        s0Var.D = 2;
        this.h = new t0(s0Var);
    }

    @Override
    public final boolean a(l lVar, long j10) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        z zVar;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        int i17;
        int iH;
        int iMin;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        byte b10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.f49348k;
        a1 a1Var = this.f49342c;
        int i28 = i27 / (a1Var.f2229a * 2);
        int i29 = this.f49345g;
        int i30 = this.d;
        int iF = g0.f(i29 - i28, i30);
        int i31 = a1Var.f2231c;
        int i32 = iF * i31;
        boolean z10 = j10 == 0;
        while (true) {
            bArr = this.f49343e;
            if (z10 && (i25 = this.f49346i) < i32) {
                i26 = lVar.read(bArr, this.f49346i, (int) Math.min(i32 - i25, j10));
                if (i26 == -1) {
                    break;
                }
                this.f49346i += i26;
                bArr = this.f49343e;
                if (z10) {
                }
            }
            i10 = this.f49346i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    zVar = this.f49344f;
                    if (i12 < i10) {
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = a1Var.f2229a;
                        if (i14 < i15) {
                            bArr2 = zVar.f4858a;
                            int i33 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i33;
                            i17 = (i31 / i15) - 4;
                            iH = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                            int i34 = i10;
                            iMin = Math.min(bArr[i33 + 2] & 255, 88);
                            iArr = f49339n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iH & 255);
                            bArr2[i19 + 1] = (byte) (iH >> 8);
                            int i35 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b10 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iH = g0.h(iH + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iH & 255);
                                bArr2[i19 + 1] = (byte) (iH >> 8);
                                iMin = g0.h(iMin + f49338m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i34;
                            i12 = i35;
                        }
                    }
                    i12++;
                }
                int i36 = i10;
                int i37 = i30 * i36 * 2 * a1Var.f2229a;
                zVar.C(0);
                zVar.B(i37);
                this.f49346i -= i36 * i31;
                int i38 = zVar.f4860c;
                this.f49341b.a(i38, zVar);
                i13 = this.f49348k + i38;
                this.f49348k = i13;
                if (i13 / (a1Var.f2229a * 2) >= i29) {
                    d(i29);
                }
            }
            if (z10 && (i11 = this.f49348k / (a1Var.f2229a * 2)) > 0) {
                d(i11);
            }
            return z10;
        }
        while (true) {
            bArr = this.f49343e;
            if (z10) {
            }
            i10 = this.f49346i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    zVar = this.f49344f;
                    if (i12 < i10) {
                        break;
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = a1Var.f2229a;
                        if (i14 < i15) {
                            bArr2 = zVar.f4858a;
                            int i39 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i39;
                            i17 = (i31 / i15) - 4;
                            iH = (short) ((bArr[i39] & 255) | ((bArr[i39 + 1] & 255) << 8));
                            int i310 = i10;
                            iMin = Math.min(bArr[i39 + 2] & 255, 88);
                            iArr = f49339n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iH & 255);
                            bArr2[i19 + 1] = (byte) (iH >> 8);
                            int i311 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b10 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iH = g0.h(iH + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iH & 255);
                                bArr2[i19 + 1] = (byte) (iH >> 8);
                                iMin = g0.h(iMin + f49338m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i310;
                            i12 = i311;
                        }
                    }
                    i12++;
                }
                int i312 = i10;
                int i313 = i30 * i312 * 2 * a1Var.f2229a;
                zVar.C(0);
                zVar.B(i313);
                this.f49346i -= i312 * i31;
                int i314 = zVar.f4860c;
                this.f49341b.a(i314, zVar);
                i13 = this.f49348k + i314;
                this.f49348k = i13;
                if (i13 / (a1Var.f2229a * 2) >= i29) {
                    d(i29);
                }
            }
            if (z10) {
                d(i11);
            }
            return z10;
            this.f49346i += i26;
        }
    }

    @Override
    public final void b(long j10) {
        this.f49346i = 0;
        this.f49347j = j10;
        this.f49348k = 0;
        this.f49349l = 0L;
    }

    @Override
    public final void c(int i10, long j10) {
        this.f49340a.n(new d(this.f49342c, this.d, i10, j10));
        this.f49341b.c(this.h);
    }

    public final void d(int i10) {
        long j10 = this.f49347j;
        long j11 = this.f49349l;
        a1 a1Var = this.f49342c;
        long jO = j10 + g0.O(j11, 1000000L, a1Var.f2230b);
        int i11 = i10 * 2 * a1Var.f2229a;
        this.f49341b.e(jO, 1, i11, this.f49348k - i11, null);
        this.f49349l += (long) i10;
        this.f49348k -= i11;
    }
}
