package v3;

import d5.x;
import e0.i0;
import g7.t;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import m3.y;
import o8.z;
import org.telegram.ui.Cells.e3;
public final class j extends i {
    public i0 f48351n;
    public int f48352o;
    public boolean f48353p;
    public n0 f48354q;
    public y f48355r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f48345g = j10;
        int i9 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48353p = z10;
        n0 n0Var = this.f48354q;
        if (n0Var != null) {
            i9 = n0Var.f13296e;
        }
        this.f48352o = i9;
    }

    @Override
    public final long b(d5.y yVar) {
        int i9;
        int i10 = 0;
        byte b10 = yVar.f4410a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.f48351n;
        d5.a.j(i0Var);
        int i11 = i0Var.f4707a;
        n0 n0Var = (n0) i0Var.f4708b;
        if (!((d5.c[]) i0Var.f4710e)[(b10 >> 1) & (255 >>> (8 - i11))].f4335a) {
            i9 = n0Var.f13296e;
        } else {
            i9 = n0Var.f13297f;
        }
        if (this.f48353p) {
            i10 = (this.f48352o + i9) / 4;
        }
        long j10 = i10;
        byte[] bArr = yVar.f4410a;
        int length = bArr.length;
        int i12 = yVar.f4412c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            yVar.A(copyOf.length, copyOf);
        } else {
            yVar.B(i12);
        }
        byte[] bArr2 = yVar.f4410a;
        int i13 = yVar.f4412c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f48353p = true;
        this.f48352o = i9;
        return j10;
    }

    @Override
    public final boolean c(d5.y yVar, long j10, e3 e3Var) {
        i0 i0Var;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.f48351n != null) {
            ((t0) e3Var.f24286b).getClass();
            return false;
        }
        n0 n0Var = this.f48354q;
        int i13 = -1;
        if (n0Var == null) {
            t.c(1, yVar, false);
            yVar.j();
            int r10 = yVar.r();
            int j11 = yVar.j();
            int g10 = yVar.g();
            if (g10 <= 0) {
                g10 = -1;
            }
            int g11 = yVar.g();
            if (g11 > 0) {
                i13 = g11;
            }
            yVar.g();
            int r11 = yVar.r();
            int pow = (int) Math.pow(2.0d, (r11 & 240) >> 4);
            yVar.r();
            ?? copyOf = Arrays.copyOf(yVar.f4410a, yVar.f4412c);
            ?? obj = new Object();
            obj.f13293a = r10;
            obj.f13294b = j11;
            obj.f13295c = g10;
            obj.d = i13;
            obj.f13296e = (int) Math.pow(2.0d, r11 & 15);
            obj.f13297f = pow;
            obj.f13298g = copyOf;
            this.f48354q = obj;
        } else {
            y yVar2 = this.f48355r;
            if (yVar2 == null) {
                this.f48355r = t.b(yVar, true, true);
            } else {
                int i14 = yVar.f4412c;
                byte[] bArr = new byte[i14];
                System.arraycopy(yVar.f4410a, 0, bArr, 0, i14);
                int i15 = n0Var.f13293a;
                int i16 = 5;
                t.c(5, yVar, false);
                int r12 = yVar.r() + 1;
                x xVar = new x(yVar.f4410a);
                xVar.s(yVar.f4411b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 < r12) {
                        if (xVar.i(24) == 5653314) {
                            int i19 = xVar.i(16);
                            int i20 = xVar.i(24);
                            long[] jArr = new long[i20];
                            long j12 = 0;
                            if (!xVar.h()) {
                                boolean h = xVar.h();
                                int i21 = 0;
                                while (i21 < i20) {
                                    if (h) {
                                        if (xVar.h()) {
                                            i12 = r12;
                                            jArr[i21] = xVar.i(i16) + 1;
                                        } else {
                                            i12 = r12;
                                            jArr[i21] = 0;
                                        }
                                    } else {
                                        i12 = r12;
                                        jArr[i21] = xVar.i(5) + 1;
                                    }
                                    i21++;
                                    r12 = i12;
                                    i16 = 5;
                                }
                                i11 = r12;
                            } else {
                                i11 = r12;
                                int i22 = xVar.i(5) + 1;
                                int i23 = 0;
                                while (i23 < i20) {
                                    int i24 = 0;
                                    for (int i25 = i20 - i23; i25 > 0; i25 >>>= 1) {
                                        i24++;
                                    }
                                    int i26 = xVar.i(i24);
                                    int i27 = 0;
                                    while (i27 < i26 && i23 < i20) {
                                        int i28 = i23;
                                        jArr[i28] = i22;
                                        i23 = i28 + 1;
                                        i27++;
                                        n0Var = n0Var;
                                    }
                                    i22++;
                                    i23 = i23;
                                    n0Var = n0Var;
                                }
                            }
                            n0 n0Var2 = n0Var;
                            int i29 = xVar.i(4);
                            if (i29 <= 2) {
                                if (i29 == 1 || i29 == 2) {
                                    xVar.s(32);
                                    xVar.s(32);
                                    int i30 = xVar.i(4) + 1;
                                    xVar.s(1);
                                    if (i29 == 1) {
                                        if (i19 != 0) {
                                            j12 = (long) Math.floor(Math.pow(i20, 1.0d / i19));
                                        }
                                    } else {
                                        j12 = i20 * i19;
                                    }
                                    xVar.s((int) (i30 * j12));
                                }
                                i17++;
                                r12 = i11;
                                n0Var = n0Var2;
                                i16 = 5;
                            } else {
                                throw t1.a("lookup type greater than 2 not decodable: " + i29, null);
                            }
                        } else {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((xVar.d * 8) + xVar.f4407e), null);
                        }
                    } else {
                        n0 n0Var3 = n0Var;
                        int i31 = 6;
                        int i32 = xVar.i(6) + 1;
                        for (int i33 = 0; i33 < i32; i33++) {
                            if (xVar.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i34 = 1;
                        int i35 = xVar.i(6) + 1;
                        int i36 = 0;
                        while (true) {
                            int i37 = 3;
                            if (i36 < i35) {
                                int i38 = xVar.i(i18);
                                if (i38 != 0) {
                                    if (i38 == i34) {
                                        int i39 = xVar.i(5);
                                        int[] iArr = new int[i39];
                                        int i40 = -1;
                                        for (int i41 = 0; i41 < i39; i41++) {
                                            int i42 = xVar.i(4);
                                            iArr[i41] = i42;
                                            if (i42 > i40) {
                                                i40 = i42;
                                            }
                                        }
                                        int i43 = i40 + 1;
                                        int[] iArr2 = new int[i43];
                                        int i44 = 0;
                                        while (i44 < i43) {
                                            iArr2[i44] = xVar.i(i37) + 1;
                                            int i45 = xVar.i(2);
                                            int i46 = 8;
                                            if (i45 > 0) {
                                                xVar.s(8);
                                            }
                                            int i47 = 0;
                                            for (int i48 = 1; i47 < (i48 << i45); i48 = 1) {
                                                xVar.s(i46);
                                                i47++;
                                                i46 = 8;
                                            }
                                            i44++;
                                            i37 = 3;
                                        }
                                        xVar.s(2);
                                        int i49 = xVar.i(4);
                                        int i50 = 0;
                                        int i51 = 0;
                                        for (int i52 = 0; i52 < i39; i52++) {
                                            i50 += iArr2[iArr[i52]];
                                            while (i51 < i50) {
                                                xVar.s(i49);
                                                i51++;
                                            }
                                        }
                                    } else {
                                        throw t1.a("floor type greater than 1 not decodable: " + i38, null);
                                    }
                                } else {
                                    int i53 = 8;
                                    xVar.s(8);
                                    xVar.s(16);
                                    xVar.s(16);
                                    xVar.s(6);
                                    xVar.s(8);
                                    int i54 = xVar.i(4) + 1;
                                    int i55 = 0;
                                    while (i55 < i54) {
                                        xVar.s(i53);
                                        i55++;
                                        i53 = 8;
                                    }
                                }
                                i36++;
                                i31 = 6;
                                i18 = 16;
                                i34 = 1;
                            } else {
                                int i56 = xVar.i(i31) + 1;
                                int i57 = 0;
                                while (i57 < i56) {
                                    if (xVar.i(16) <= 2) {
                                        xVar.s(24);
                                        xVar.s(24);
                                        xVar.s(24);
                                        int i58 = xVar.i(i31) + 1;
                                        int i59 = 8;
                                        xVar.s(8);
                                        int[] iArr3 = new int[i58];
                                        for (int i60 = 0; i60 < i58; i60++) {
                                            int i61 = xVar.i(3);
                                            if (xVar.h()) {
                                                i10 = xVar.i(5);
                                            } else {
                                                i10 = 0;
                                            }
                                            iArr3[i60] = (i10 * 8) + i61;
                                        }
                                        int i62 = 0;
                                        while (i62 < i58) {
                                            int i63 = 0;
                                            while (i63 < i59) {
                                                if ((iArr3[i62] & (1 << i63)) != 0) {
                                                    xVar.s(i59);
                                                }
                                                i63++;
                                                i59 = 8;
                                            }
                                            i62++;
                                            i59 = 8;
                                        }
                                        i57++;
                                        i31 = 6;
                                    } else {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i64 = xVar.i(i31) + 1;
                                for (int i65 = 0; i65 < i64; i65++) {
                                    int i66 = xVar.i(16);
                                    if (i66 != 0) {
                                        d5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i66);
                                    } else {
                                        if (xVar.h()) {
                                            i9 = xVar.i(4) + 1;
                                        } else {
                                            i9 = 1;
                                        }
                                        if (xVar.h()) {
                                            int i67 = xVar.i(8) + 1;
                                            for (int i68 = 0; i68 < i67; i68++) {
                                                int i69 = i15 - 1;
                                                int i70 = 0;
                                                for (int i71 = i69; i71 > 0; i71 >>>= 1) {
                                                    i70++;
                                                }
                                                xVar.s(i70);
                                                int i72 = 0;
                                                while (i69 > 0) {
                                                    i72++;
                                                    i69 >>>= 1;
                                                }
                                                xVar.s(i72);
                                            }
                                        }
                                        if (xVar.i(2) == 0) {
                                            if (i9 > 1) {
                                                for (int i73 = 0; i73 < i15; i73++) {
                                                    xVar.s(4);
                                                }
                                            }
                                            for (int i74 = 0; i74 < i9; i74++) {
                                                xVar.s(8);
                                                xVar.s(8);
                                                xVar.s(8);
                                            }
                                        } else {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int i75 = xVar.i(6);
                                int i76 = i75 + 1;
                                d5.c[] cVarArr = new d5.c[i76];
                                for (int i77 = 0; i77 < i76; i77++) {
                                    boolean h10 = xVar.h();
                                    xVar.i(16);
                                    xVar.i(16);
                                    xVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f4335a = h10;
                                    cVarArr[i77] = obj2;
                                }
                                if (xVar.h()) {
                                    int i78 = 0;
                                    while (i75 > 0) {
                                        i78++;
                                        i75 >>>= 1;
                                    }
                                    i0Var = new i0(n0Var3, yVar2, bArr, cVarArr, i78);
                                } else {
                                    throw t1.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        i0Var = null;
        this.f48351n = i0Var;
        if (i0Var == null) {
            return true;
        }
        n0 n0Var4 = (n0) i0Var.f4708b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) n0Var4.f13298g);
        arrayList.add((byte[]) i0Var.d);
        z3.c a2 = t.a(z.v(((y) i0Var.f4709c).f17270a));
        s0 s0Var = new s0();
        s0Var.f9705o = "audio/vorbis";
        s0Var.f9697f = n0Var4.d;
        s0Var.f9698g = n0Var4.f13295c;
        s0Var.B = n0Var4.f13293a;
        s0Var.C = n0Var4.f13294b;
        s0Var.f9707q = arrayList;
        s0Var.f9699i = a2;
        e3Var.f24286b = new t0(s0Var);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48351n = null;
            this.f48354q = null;
            this.f48355r = null;
        }
        this.f48352o = 0;
        this.f48353p = false;
    }
}
