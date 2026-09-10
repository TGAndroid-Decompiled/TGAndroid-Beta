package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import b2.s0;
import c3.j0;
import c3.k0;
import c3.z;
import e0.i0;
import e2.v;
import java.util.ArrayList;
import java.util.Arrays;
import n7.a1;
public final class j extends i {
    public i0 f44596n;
    public int f44597o;
    public boolean f44598p;
    public z f44599q;
    public j0 f44600r;

    @Override
    public final void a(long j3) {
        boolean z10;
        this.f44590g = j3;
        int i10 = 0;
        if (j3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44598p = z10;
        z zVar = this.f44599q;
        if (zVar != null) {
            i10 = zVar.e;
        }
        this.f44597o = i10;
    }

    @Override
    public final long b(v vVar) {
        int i10;
        int i11 = 0;
        byte b10 = vVar.f7234a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.f44596n;
        e2.d.h(i0Var);
        int i12 = i0Var.f7089a;
        z zVar = (z) i0Var.f7090b;
        if (!((k0[]) i0Var.e)[(b10 >> 1) & (255 >>> (8 - i12))].f4201b) {
            i10 = zVar.e;
        } else {
            i10 = zVar.f4247f;
        }
        if (this.f44598p) {
            i11 = (this.f44597o + i10) / 4;
        }
        long j3 = i11;
        byte[] bArr = vVar.f7234a;
        int length = bArr.length;
        int i13 = vVar.f7236c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            vVar.H(copyOf.length, copyOf);
        } else {
            vVar.I(i13);
        }
        byte[] bArr2 = vVar.f7234a;
        int i14 = vVar.f7236c;
        bArr2[i14 - 4] = (byte) (j3 & 255);
        bArr2[i14 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f44598p = true;
        this.f44597o = i10;
        return j3;
    }

    @Override
    public final boolean c(v vVar, long j3, a1 a1Var) {
        i0 i0Var;
        int i10;
        int i11;
        long j10;
        if (this.f44596n != null) {
            ((s) a1Var.f13938b).getClass();
            return false;
        }
        z zVar = this.f44599q;
        int i12 = 4;
        int i13 = -1;
        if (zVar == null) {
            c3.b.x(1, vVar, false);
            vVar.p();
            int x10 = vVar.x();
            int p5 = vVar.p();
            int l4 = vVar.l();
            if (l4 <= 0) {
                l4 = -1;
            }
            int l10 = vVar.l();
            if (l10 > 0) {
                i13 = l10;
            }
            vVar.l();
            int x11 = vVar.x();
            int pow = (int) Math.pow(2.0d, (x11 & 240) >> 4);
            vVar.x();
            ?? copyOf = Arrays.copyOf(vVar.f7234a, vVar.f7236c);
            ?? obj = new Object();
            obj.f4244a = x10;
            obj.f4245b = p5;
            obj.f4246c = l4;
            obj.d = i13;
            obj.e = (int) Math.pow(2.0d, x11 & 15);
            obj.f4247f = pow;
            obj.f4248g = copyOf;
            this.f44599q = obj;
        } else {
            j0 j0Var = this.f44600r;
            if (j0Var == null) {
                this.f44600r = c3.b.v(vVar, true, true);
            } else {
                int i14 = vVar.f7236c;
                byte[] bArr = new byte[i14];
                System.arraycopy(vVar.f7234a, 0, bArr, 0, i14);
                int i15 = zVar.f4244a;
                int i16 = 5;
                c3.b.x(5, vVar, false);
                int x12 = vVar.x() + 1;
                a4.h hVar = new a4.h(vVar.f7234a);
                hVar.t(vVar.f7235b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 < x12) {
                        if (hVar.i(24) == 5653314) {
                            int i19 = hVar.i(16);
                            int i20 = hVar.i(24);
                            if (!hVar.h()) {
                                boolean h = hVar.h();
                                for (int i21 = 0; i21 < i20; i21++) {
                                    if (h) {
                                        if (hVar.h()) {
                                            hVar.t(i16);
                                        }
                                    } else {
                                        hVar.t(i16);
                                    }
                                }
                            } else {
                                hVar.t(i16);
                                int i22 = 0;
                                while (i22 < i20) {
                                    int i23 = 0;
                                    for (int i24 = i20 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    i22 += hVar.i(i23);
                                }
                            }
                            int i25 = hVar.i(4);
                            if (i25 <= 2) {
                                if (i25 == 1 || i25 == 2) {
                                    hVar.t(32);
                                    hVar.t(32);
                                    int i26 = hVar.i(4) + 1;
                                    hVar.t(1);
                                    if (i25 == 1) {
                                        if (i19 != 0) {
                                            j10 = (long) Math.floor(Math.pow(i20, 1.0d / i19));
                                        } else {
                                            j10 = 0;
                                        }
                                    } else {
                                        j10 = i20 * i19;
                                    }
                                    hVar.t((int) (j10 * i26));
                                }
                                i17++;
                                i16 = 5;
                            } else {
                                throw s0.a(null, "lookup type greater than 2 not decodable: " + i25);
                            }
                        } else {
                            throw s0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((hVar.d * 8) + hVar.e));
                        }
                    } else {
                        int i27 = 6;
                        int i28 = hVar.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (hVar.i(16) != 0) {
                                throw s0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i30 = 1;
                        int i31 = hVar.i(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 < i31) {
                                int i34 = hVar.i(i18);
                                if (i34 != 0) {
                                    if (i34 == i30) {
                                        int i35 = hVar.i(5);
                                        int[] iArr = new int[i35];
                                        int i36 = -1;
                                        for (int i37 = 0; i37 < i35; i37++) {
                                            int i38 = hVar.i(i12);
                                            iArr[i37] = i38;
                                            if (i38 > i36) {
                                                i36 = i38;
                                            }
                                        }
                                        int i39 = i36 + 1;
                                        int[] iArr2 = new int[i39];
                                        int i40 = 0;
                                        while (i40 < i39) {
                                            iArr2[i40] = hVar.i(i33) + 1;
                                            int i41 = hVar.i(2);
                                            int i42 = 8;
                                            if (i41 > 0) {
                                                hVar.t(8);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i43 = 0;
                                            for (int i44 = 1; i43 < (i44 << i41); i44 = 1) {
                                                hVar.t(i42);
                                                i43++;
                                                i42 = 8;
                                            }
                                            i40++;
                                            iArr2 = iArr3;
                                            i33 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        hVar.t(2);
                                        int i45 = hVar.i(4);
                                        int i46 = 0;
                                        int i47 = 0;
                                        for (int i48 = 0; i48 < i35; i48++) {
                                            i46 += iArr4[iArr[i48]];
                                            while (i47 < i46) {
                                                hVar.t(i45);
                                                i47++;
                                            }
                                        }
                                    } else {
                                        throw s0.a(null, "floor type greater than 1 not decodable: " + i34);
                                    }
                                } else {
                                    int i49 = 8;
                                    hVar.t(8);
                                    hVar.t(16);
                                    hVar.t(16);
                                    hVar.t(6);
                                    hVar.t(8);
                                    int i50 = hVar.i(4) + 1;
                                    int i51 = 0;
                                    while (i51 < i50) {
                                        hVar.t(i49);
                                        i51++;
                                        i49 = 8;
                                    }
                                }
                                i32++;
                                i27 = 6;
                                i12 = 4;
                                i18 = 16;
                                i30 = 1;
                            } else {
                                int i52 = hVar.i(i27) + 1;
                                int i53 = 0;
                                while (i53 < i52) {
                                    if (hVar.i(16) <= 2) {
                                        hVar.t(24);
                                        hVar.t(24);
                                        hVar.t(24);
                                        int i54 = hVar.i(i27) + 1;
                                        int i55 = 8;
                                        hVar.t(8);
                                        int[] iArr5 = new int[i54];
                                        for (int i56 = 0; i56 < i54; i56++) {
                                            int i57 = hVar.i(3);
                                            if (hVar.h()) {
                                                i11 = hVar.i(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr5[i56] = (i11 * 8) + i57;
                                        }
                                        int i58 = 0;
                                        while (i58 < i54) {
                                            int i59 = 0;
                                            while (i59 < i55) {
                                                if ((iArr5[i58] & (1 << i59)) != 0) {
                                                    hVar.t(i55);
                                                }
                                                i59++;
                                                i55 = 8;
                                            }
                                            i58++;
                                            i55 = 8;
                                        }
                                        i53++;
                                        i27 = 6;
                                    } else {
                                        throw s0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i60 = hVar.i(i27) + 1;
                                for (int i61 = 0; i61 < i60; i61++) {
                                    int i62 = hVar.i(16);
                                    if (i62 != 0) {
                                        e2.a.e("VorbisUtil", "mapping type other than 0 not supported: " + i62);
                                    } else {
                                        if (hVar.h()) {
                                            i10 = hVar.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (hVar.h()) {
                                            int i63 = hVar.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i15 - 1;
                                                int i66 = 0;
                                                for (int i67 = i65; i67 > 0; i67 >>>= 1) {
                                                    i66++;
                                                }
                                                hVar.t(i66);
                                                int i68 = 0;
                                                while (i65 > 0) {
                                                    i68++;
                                                    i65 >>>= 1;
                                                }
                                                hVar.t(i68);
                                            }
                                        }
                                        if (hVar.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i69 = 0; i69 < i15; i69++) {
                                                    hVar.t(4);
                                                }
                                            }
                                            for (int i70 = 0; i70 < i10; i70++) {
                                                hVar.t(8);
                                                hVar.t(8);
                                                hVar.t(8);
                                            }
                                        } else {
                                            throw s0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int i71 = hVar.i(6);
                                int i72 = i71 + 1;
                                k0[] k0VarArr = new k0[i72];
                                for (int i73 = 0; i73 < i72; i73++) {
                                    boolean h10 = hVar.h();
                                    hVar.i(16);
                                    hVar.i(16);
                                    hVar.i(8);
                                    k0VarArr[i73] = new k0(h10);
                                }
                                if (hVar.h()) {
                                    int i74 = 0;
                                    while (i71 > 0) {
                                        i74++;
                                        i71 >>>= 1;
                                    }
                                    i0Var = new i0(zVar, j0Var, bArr, k0VarArr, i74);
                                } else {
                                    throw s0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        i0Var = null;
        this.f44596n = i0Var;
        if (i0Var == null) {
            return true;
        }
        z zVar2 = (z) i0Var.f7090b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f4248g);
        arrayList.add((byte[]) i0Var.d);
        p0 r10 = c3.b.r(e9.i0.w(((j0) i0Var.f7091c).f4194a));
        r rVar = new r();
        rVar.f1945p = r0.n("audio/ogg");
        rVar.f1946q = r0.n("audio/vorbis");
        rVar.h = zVar2.d;
        rVar.f1938i = zVar2.f4246c;
        rVar.I = zVar2.f4244a;
        rVar.J = zVar2.f4245b;
        rVar.f1949t = arrayList;
        rVar.f1940k = r10;
        a1Var.f13938b = new s(rVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f44596n = null;
            this.f44599q = null;
            this.f44600r = null;
        }
        this.f44597o = 0;
        this.f44598p = false;
    }
}
