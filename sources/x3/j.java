package x3;

import e0.i0;
import f5.v;
import f5.w;
import i7.w5;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.ArrayList;
import java.util.Arrays;
import l3.p0;
import o3.y;
import q8.z;
import v5.n;
public final class j extends i {
    public i0 f50089n;
    public int f50090o;
    public boolean f50091p;
    public p0 f50092q;
    public y f50093r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f50083g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50091p = z10;
        p0 p0Var = this.f50092q;
        if (p0Var != null) {
            i10 = p0Var.f14156e;
        }
        this.f50090o = i10;
    }

    @Override
    public final long b(w wVar) {
        int i10;
        int i11 = 0;
        byte b10 = wVar.f6640a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.f50089n;
        f5.a.j(i0Var);
        int i12 = i0Var.f5677a;
        p0 p0Var = (p0) i0Var.f5678b;
        if (!((f5.c[]) i0Var.f5680e)[(b10 >> 1) & (255 >>> (8 - i12))].f6575a) {
            i10 = p0Var.f14156e;
        } else {
            i10 = p0Var.f14157f;
        }
        if (this.f50091p) {
            i11 = (this.f50090o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = wVar.f6640a;
        int length = bArr.length;
        int i13 = wVar.f6642c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            wVar.A(copyOf.length, copyOf);
        } else {
            wVar.B(i13);
        }
        byte[] bArr2 = wVar.f6640a;
        int i14 = wVar.f6642c;
        bArr2[i14 - 4] = (byte) (j10 & 255);
        bArr2[i14 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f50091p = true;
        this.f50090o = i10;
        return j10;
    }

    @Override
    public final boolean c(w wVar, long j10, n nVar) {
        i0 i0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f50089n != null) {
            ((t0) nVar.f49431b).getClass();
            return false;
        }
        p0 p0Var = this.f50092q;
        int i14 = -1;
        if (p0Var == null) {
            w5.c(1, wVar, false);
            wVar.j();
            int r6 = wVar.r();
            int j11 = wVar.j();
            int g10 = wVar.g();
            if (g10 <= 0) {
                g10 = -1;
            }
            int g11 = wVar.g();
            if (g11 > 0) {
                i14 = g11;
            }
            wVar.g();
            int r9 = wVar.r();
            int pow = (int) Math.pow(2.0d, (r9 & 240) >> 4);
            wVar.r();
            ?? copyOf = Arrays.copyOf(wVar.f6640a, wVar.f6642c);
            ?? obj = new Object();
            obj.f14153a = r6;
            obj.f14154b = j11;
            obj.f14155c = g10;
            obj.d = i14;
            obj.f14156e = (int) Math.pow(2.0d, r9 & 15);
            obj.f14157f = pow;
            obj.f14158g = copyOf;
            this.f50092q = obj;
        } else {
            y yVar = this.f50093r;
            if (yVar == null) {
                this.f50093r = w5.b(wVar, true, true);
            } else {
                int i15 = wVar.f6642c;
                byte[] bArr = new byte[i15];
                System.arraycopy(wVar.f6640a, 0, bArr, 0, i15);
                int i16 = p0Var.f14153a;
                int i17 = 5;
                w5.c(5, wVar, false);
                int r10 = wVar.r() + 1;
                v vVar = new v(wVar.f6640a);
                vVar.s(wVar.f6641b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 < r10) {
                        if (vVar.i(24) == 5653314) {
                            int i20 = vVar.i(16);
                            int i21 = vVar.i(24);
                            long[] jArr = new long[i21];
                            long j12 = 0;
                            if (!vVar.h()) {
                                boolean h = vVar.h();
                                int i22 = 0;
                                while (i22 < i21) {
                                    if (h) {
                                        if (vVar.h()) {
                                            i13 = r10;
                                            jArr[i22] = vVar.i(i17) + 1;
                                        } else {
                                            i13 = r10;
                                            jArr[i22] = 0;
                                        }
                                    } else {
                                        i13 = r10;
                                        jArr[i22] = vVar.i(5) + 1;
                                    }
                                    i22++;
                                    r10 = i13;
                                    i17 = 5;
                                }
                                i12 = r10;
                            } else {
                                i12 = r10;
                                int i23 = vVar.i(5) + 1;
                                int i24 = 0;
                                while (i24 < i21) {
                                    int i25 = 0;
                                    for (int i26 = i21 - i24; i26 > 0; i26 >>>= 1) {
                                        i25++;
                                    }
                                    int i27 = vVar.i(i25);
                                    int i28 = 0;
                                    while (i28 < i27 && i24 < i21) {
                                        int i29 = i24;
                                        jArr[i29] = i23;
                                        i24 = i29 + 1;
                                        i28++;
                                        p0Var = p0Var;
                                    }
                                    i23++;
                                    i24 = i24;
                                    p0Var = p0Var;
                                }
                            }
                            p0 p0Var2 = p0Var;
                            int i30 = vVar.i(4);
                            if (i30 <= 2) {
                                if (i30 == 1 || i30 == 2) {
                                    vVar.s(32);
                                    vVar.s(32);
                                    int i31 = vVar.i(4) + 1;
                                    vVar.s(1);
                                    if (i30 == 1) {
                                        if (i20 != 0) {
                                            j12 = (long) Math.floor(Math.pow(i21, 1.0d / i20));
                                        }
                                    } else {
                                        j12 = i21 * i20;
                                    }
                                    vVar.s((int) (i31 * j12));
                                }
                                i18++;
                                r10 = i12;
                                p0Var = p0Var2;
                                i17 = 5;
                            } else {
                                throw t1.a("lookup type greater than 2 not decodable: " + i30, null);
                            }
                        } else {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((vVar.d * 8) + vVar.f6637e), null);
                        }
                    } else {
                        p0 p0Var3 = p0Var;
                        int i32 = 6;
                        int i33 = vVar.i(6) + 1;
                        for (int i34 = 0; i34 < i33; i34++) {
                            if (vVar.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i35 = 1;
                        int i36 = vVar.i(6) + 1;
                        int i37 = 0;
                        while (true) {
                            int i38 = 3;
                            if (i37 < i36) {
                                int i39 = vVar.i(i19);
                                if (i39 != 0) {
                                    if (i39 == i35) {
                                        int i40 = vVar.i(5);
                                        int[] iArr = new int[i40];
                                        int i41 = -1;
                                        for (int i42 = 0; i42 < i40; i42++) {
                                            int i43 = vVar.i(4);
                                            iArr[i42] = i43;
                                            if (i43 > i41) {
                                                i41 = i43;
                                            }
                                        }
                                        int i44 = i41 + 1;
                                        int[] iArr2 = new int[i44];
                                        int i45 = 0;
                                        while (i45 < i44) {
                                            iArr2[i45] = vVar.i(i38) + 1;
                                            int i46 = vVar.i(2);
                                            int i47 = 8;
                                            if (i46 > 0) {
                                                vVar.s(8);
                                            }
                                            int i48 = 0;
                                            for (int i49 = 1; i48 < (i49 << i46); i49 = 1) {
                                                vVar.s(i47);
                                                i48++;
                                                i47 = 8;
                                            }
                                            i45++;
                                            i38 = 3;
                                        }
                                        vVar.s(2);
                                        int i50 = vVar.i(4);
                                        int i51 = 0;
                                        int i52 = 0;
                                        for (int i53 = 0; i53 < i40; i53++) {
                                            i51 += iArr2[iArr[i53]];
                                            while (i52 < i51) {
                                                vVar.s(i50);
                                                i52++;
                                            }
                                        }
                                    } else {
                                        throw t1.a("floor type greater than 1 not decodable: " + i39, null);
                                    }
                                } else {
                                    int i54 = 8;
                                    vVar.s(8);
                                    vVar.s(16);
                                    vVar.s(16);
                                    vVar.s(6);
                                    vVar.s(8);
                                    int i55 = vVar.i(4) + 1;
                                    int i56 = 0;
                                    while (i56 < i55) {
                                        vVar.s(i54);
                                        i56++;
                                        i54 = 8;
                                    }
                                }
                                i37++;
                                i32 = 6;
                                i19 = 16;
                                i35 = 1;
                            } else {
                                int i57 = vVar.i(i32) + 1;
                                int i58 = 0;
                                while (i58 < i57) {
                                    if (vVar.i(16) <= 2) {
                                        vVar.s(24);
                                        vVar.s(24);
                                        vVar.s(24);
                                        int i59 = vVar.i(i32) + 1;
                                        int i60 = 8;
                                        vVar.s(8);
                                        int[] iArr3 = new int[i59];
                                        for (int i61 = 0; i61 < i59; i61++) {
                                            int i62 = vVar.i(3);
                                            if (vVar.h()) {
                                                i11 = vVar.i(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr3[i61] = (i11 * 8) + i62;
                                        }
                                        int i63 = 0;
                                        while (i63 < i59) {
                                            int i64 = 0;
                                            while (i64 < i60) {
                                                if ((iArr3[i63] & (1 << i64)) != 0) {
                                                    vVar.s(i60);
                                                }
                                                i64++;
                                                i60 = 8;
                                            }
                                            i63++;
                                            i60 = 8;
                                        }
                                        i58++;
                                        i32 = 6;
                                    } else {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i65 = vVar.i(i32) + 1;
                                for (int i66 = 0; i66 < i65; i66++) {
                                    int i67 = vVar.i(16);
                                    if (i67 != 0) {
                                        f5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i67);
                                    } else {
                                        if (vVar.h()) {
                                            i10 = vVar.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (vVar.h()) {
                                            int i68 = vVar.i(8) + 1;
                                            for (int i69 = 0; i69 < i68; i69++) {
                                                int i70 = i16 - 1;
                                                int i71 = 0;
                                                for (int i72 = i70; i72 > 0; i72 >>>= 1) {
                                                    i71++;
                                                }
                                                vVar.s(i71);
                                                int i73 = 0;
                                                while (i70 > 0) {
                                                    i73++;
                                                    i70 >>>= 1;
                                                }
                                                vVar.s(i73);
                                            }
                                        }
                                        if (vVar.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i74 = 0; i74 < i16; i74++) {
                                                    vVar.s(4);
                                                }
                                            }
                                            for (int i75 = 0; i75 < i10; i75++) {
                                                vVar.s(8);
                                                vVar.s(8);
                                                vVar.s(8);
                                            }
                                        } else {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int i76 = vVar.i(6);
                                int i77 = i76 + 1;
                                f5.c[] cVarArr = new f5.c[i77];
                                for (int i78 = 0; i78 < i77; i78++) {
                                    boolean h10 = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f6575a = h10;
                                    cVarArr[i78] = obj2;
                                }
                                if (vVar.h()) {
                                    int i79 = 0;
                                    while (i76 > 0) {
                                        i79++;
                                        i76 >>>= 1;
                                    }
                                    i0Var = new i0(p0Var3, yVar, bArr, cVarArr, i79);
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
        this.f50089n = i0Var;
        if (i0Var == null) {
            return true;
        }
        p0 p0Var4 = (p0) i0Var.f5678b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) p0Var4.f14158g);
        arrayList.add((byte[]) i0Var.d);
        b4.c a2 = w5.a(z.v(((y) i0Var.f5679c).f19129a));
        s0 s0Var = new s0();
        s0Var.f10742o = "audio/vorbis";
        s0Var.f10734f = p0Var4.d;
        s0Var.f10735g = p0Var4.f14155c;
        s0Var.B = p0Var4.f14153a;
        s0Var.C = p0Var4.f14154b;
        s0Var.f10744q = arrayList;
        s0Var.f10736i = a2;
        nVar.f49431b = new t0(s0Var);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50089n = null;
            this.f50092q = null;
            this.f50093r = null;
        }
        this.f50090o = 0;
        this.f50091p = false;
    }
}
