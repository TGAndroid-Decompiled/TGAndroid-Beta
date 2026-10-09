package x3;

import a4.l;
import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import b2.s0;
import c3.j0;
import c3.z;
import e0.g0;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n6.t;
public final class j extends i {
    public g0 f50585n;
    public int f50586o;
    public boolean f50587p;
    public z f50588q;
    public l f50589r;

    @Override
    public final void a(long j3) {
        boolean z10;
        this.f50579g = j3;
        int i10 = 0;
        if (j3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50587p = z10;
        z zVar = this.f50588q;
        if (zVar != null) {
            i10 = zVar.f4187e;
        }
        this.f50586o = i10;
    }

    @Override
    public final long b(v vVar) {
        int i10;
        int i11 = 0;
        byte b10 = vVar.f8584a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        g0 g0Var = this.f50585n;
        e2.d.h(g0Var);
        int i12 = g0Var.f8412a;
        z zVar = (z) g0Var.f8413b;
        if (!((j0[]) g0Var.f8415e)[(b10 >> 1) & (255 >>> (8 - i12))].f4131b) {
            i10 = zVar.f4187e;
        } else {
            i10 = zVar.f4188f;
        }
        if (this.f50587p) {
            i11 = (this.f50586o + i10) / 4;
        }
        long j3 = i11;
        byte[] bArr = vVar.f8584a;
        int length = bArr.length;
        int i13 = vVar.f8586c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            vVar.H(copyOf.length, copyOf);
        } else {
            vVar.I(i13);
        }
        byte[] bArr2 = vVar.f8584a;
        int i14 = vVar.f8586c;
        bArr2[i14 - 4] = (byte) (j3 & 255);
        bArr2[i14 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f50587p = true;
        this.f50586o = i10;
        return j3;
    }

    @Override
    public final boolean c(v vVar, long j3, t tVar) {
        g0 g0Var;
        int i10;
        int i11;
        long j10;
        if (this.f50585n != null) {
            ((s) tVar.f16717b).getClass();
            return false;
        }
        z zVar = this.f50588q;
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
            ?? copyOf = Arrays.copyOf(vVar.f8584a, vVar.f8586c);
            ?? obj = new Object();
            obj.f4184a = x10;
            obj.f4185b = p5;
            obj.f4186c = l4;
            obj.d = i13;
            obj.f4187e = (int) Math.pow(2.0d, x11 & 15);
            obj.f4188f = pow;
            obj.f4189g = copyOf;
            this.f50588q = obj;
        } else {
            l lVar = this.f50589r;
            if (lVar == null) {
                this.f50589r = c3.b.v(vVar, true, true);
            } else {
                int i14 = vVar.f8586c;
                byte[] bArr = new byte[i14];
                System.arraycopy(vVar.f8584a, 0, bArr, 0, i14);
                int i15 = zVar.f4184a;
                int i16 = 5;
                c3.b.x(5, vVar, false);
                int x12 = vVar.x() + 1;
                a4.g gVar = new a4.g(vVar.f8584a);
                int i17 = 8;
                gVar.t(vVar.f8585b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 < x12) {
                        int i20 = i17;
                        if (gVar.i(24) == 5653314) {
                            int i21 = gVar.i(16);
                            int i22 = gVar.i(24);
                            if (!gVar.h()) {
                                boolean h = gVar.h();
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if (h) {
                                        if (gVar.h()) {
                                            gVar.t(i16);
                                        }
                                    } else {
                                        gVar.t(i16);
                                    }
                                }
                            } else {
                                gVar.t(i16);
                                int i24 = 0;
                                while (i24 < i22) {
                                    int i25 = 0;
                                    for (int i26 = i22 - i24; i26 > 0; i26 >>>= 1) {
                                        i25++;
                                    }
                                    i24 += gVar.i(i25);
                                }
                            }
                            int i27 = gVar.i(4);
                            if (i27 <= 2) {
                                if (i27 == 1 || i27 == 2) {
                                    gVar.t(32);
                                    gVar.t(32);
                                    int i28 = gVar.i(4) + 1;
                                    gVar.t(1);
                                    if (i27 == 1) {
                                        if (i21 != 0) {
                                            j10 = (long) Math.floor(Math.pow(i22, 1.0d / i21));
                                        } else {
                                            j10 = 0;
                                        }
                                    } else {
                                        j10 = i22 * i21;
                                    }
                                    gVar.t((int) (j10 * i28));
                                }
                                i18++;
                                i17 = i20;
                                i16 = 5;
                            } else {
                                throw s0.a(null, "lookup type greater than 2 not decodable: " + i27);
                            }
                        } else {
                            throw s0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.f278e));
                        }
                    } else {
                        int i29 = i17;
                        int i30 = 6;
                        int i31 = gVar.i(6) + 1;
                        for (int i32 = 0; i32 < i31; i32++) {
                            if (gVar.i(16) != 0) {
                                throw s0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i33 = 1;
                        int i34 = gVar.i(6) + 1;
                        int i35 = 0;
                        while (true) {
                            int i36 = 3;
                            if (i35 < i34) {
                                int i37 = gVar.i(i19);
                                if (i37 != 0) {
                                    if (i37 == i33) {
                                        int i38 = gVar.i(5);
                                        int[] iArr = new int[i38];
                                        int i39 = -1;
                                        for (int i40 = 0; i40 < i38; i40++) {
                                            int i41 = gVar.i(i12);
                                            iArr[i40] = i41;
                                            if (i41 > i39) {
                                                i39 = i41;
                                            }
                                        }
                                        int i42 = i39 + 1;
                                        int[] iArr2 = new int[i42];
                                        int i43 = 0;
                                        while (i43 < i42) {
                                            iArr2[i43] = gVar.i(i36) + 1;
                                            int i44 = gVar.i(2);
                                            int i45 = i29;
                                            if (i44 > 0) {
                                                gVar.t(i45);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i46 = 0;
                                            for (int i47 = 1; i46 < (i47 << i44); i47 = 1) {
                                                gVar.t(i45);
                                                i46++;
                                                i45 = 8;
                                            }
                                            i43++;
                                            iArr2 = iArr3;
                                            i29 = 8;
                                            i36 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        gVar.t(2);
                                        int i48 = gVar.i(4);
                                        int i49 = 0;
                                        int i50 = 0;
                                        for (int i51 = 0; i51 < i38; i51++) {
                                            i49 += iArr4[iArr[i51]];
                                            while (i50 < i49) {
                                                gVar.t(i48);
                                                i50++;
                                            }
                                        }
                                    } else {
                                        throw s0.a(null, "floor type greater than 1 not decodable: " + i37);
                                    }
                                } else {
                                    int i52 = i29;
                                    gVar.t(i52);
                                    gVar.t(16);
                                    gVar.t(16);
                                    gVar.t(6);
                                    gVar.t(i52);
                                    int i53 = gVar.i(4) + 1;
                                    int i54 = 0;
                                    while (i54 < i53) {
                                        gVar.t(i52);
                                        i54++;
                                        i52 = 8;
                                    }
                                }
                                i35++;
                                i29 = 8;
                                i30 = 6;
                                i12 = 4;
                                i19 = 16;
                                i33 = 1;
                            } else {
                                int i55 = gVar.i(i30) + 1;
                                int i56 = 0;
                                while (i56 < i55) {
                                    if (gVar.i(16) <= 2) {
                                        gVar.t(24);
                                        gVar.t(24);
                                        gVar.t(24);
                                        int i57 = gVar.i(i30) + 1;
                                        int i58 = 8;
                                        gVar.t(8);
                                        int[] iArr5 = new int[i57];
                                        for (int i59 = 0; i59 < i57; i59++) {
                                            int i60 = gVar.i(3);
                                            if (gVar.h()) {
                                                i11 = gVar.i(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr5[i59] = (i11 * 8) + i60;
                                        }
                                        int i61 = 0;
                                        while (i61 < i57) {
                                            int i62 = 0;
                                            while (i62 < i58) {
                                                if ((iArr5[i61] & (1 << i62)) != 0) {
                                                    gVar.t(i58);
                                                }
                                                i62++;
                                                i58 = 8;
                                            }
                                            i61++;
                                            i58 = 8;
                                        }
                                        i56++;
                                        i30 = 6;
                                    } else {
                                        throw s0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i63 = gVar.i(i30) + 1;
                                for (int i64 = 0; i64 < i63; i64++) {
                                    int i65 = gVar.i(16);
                                    if (i65 != 0) {
                                        e2.a.e("VorbisUtil", "mapping type other than 0 not supported: " + i65);
                                    } else {
                                        if (gVar.h()) {
                                            i10 = gVar.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (gVar.h()) {
                                            int i66 = gVar.i(8) + 1;
                                            for (int i67 = 0; i67 < i66; i67++) {
                                                int i68 = i15 - 1;
                                                int i69 = 0;
                                                for (int i70 = i68; i70 > 0; i70 >>>= 1) {
                                                    i69++;
                                                }
                                                gVar.t(i69);
                                                int i71 = 0;
                                                while (i68 > 0) {
                                                    i71++;
                                                    i68 >>>= 1;
                                                }
                                                gVar.t(i71);
                                            }
                                        }
                                        if (gVar.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i72 = 0; i72 < i15; i72++) {
                                                    gVar.t(4);
                                                }
                                            }
                                            for (int i73 = 0; i73 < i10; i73++) {
                                                gVar.t(8);
                                                gVar.t(8);
                                                gVar.t(8);
                                            }
                                        } else {
                                            throw s0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int i74 = gVar.i(6);
                                int i75 = i74 + 1;
                                j0[] j0VarArr = new j0[i75];
                                for (int i76 = 0; i76 < i75; i76++) {
                                    boolean h10 = gVar.h();
                                    gVar.i(16);
                                    gVar.i(16);
                                    gVar.i(8);
                                    j0VarArr[i76] = new j0(h10);
                                }
                                if (gVar.h()) {
                                    int i77 = 0;
                                    while (i74 > 0) {
                                        i77++;
                                        i74 >>>= 1;
                                    }
                                    g0Var = new g0(zVar, lVar, bArr, j0VarArr, i77);
                                } else {
                                    throw s0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        g0Var = null;
        this.f50585n = g0Var;
        if (g0Var == null) {
            return true;
        }
        z zVar2 = (z) g0Var.f8413b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f4189g);
        arrayList.add((byte[]) g0Var.d);
        p0 r10 = c3.b.r(i0.w((String[]) ((l) g0Var.f8414c).f297b));
        r rVar = new r();
        rVar.f3584p = r0.n("audio/ogg");
        rVar.f3585q = r0.n("audio/vorbis");
        rVar.h = zVar2.d;
        rVar.f3577i = zVar2.f4186c;
        rVar.I = zVar2.f4184a;
        rVar.J = zVar2.f4185b;
        rVar.f3588t = arrayList;
        rVar.f3579k = r10;
        tVar.f16717b = new s(rVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50585n = null;
            this.f50588q = null;
            this.f50589r = null;
        }
        this.f50586o = 0;
        this.f50587p = false;
    }
}
