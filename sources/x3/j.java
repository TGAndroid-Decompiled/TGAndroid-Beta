package x3;

import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.l0;
import c3.m0;
import c3.z;
import e0.e0;
import e2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.Arrays;
public final class j extends i {
    public e0 f51396n;
    public int f51397o;
    public boolean f51398p;
    public z f51399q;
    public l0 f51400r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f51390g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51398p = z10;
        z zVar = this.f51399q;
        if (zVar != null) {
            i10 = zVar.e;
        }
        this.f51397o = i10;
    }

    @Override
    public final long b(x xVar) {
        int i10;
        int i11 = 0;
        byte b10 = xVar.f9732a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        e0 e0Var = this.f51396n;
        e0Var.getClass();
        int i12 = e0Var.f9529b;
        z zVar = (z) e0Var.f9530c;
        if (!((m0[]) e0Var.f9531f)[(b10 >> 1) & (255 >>> (8 - i12))].f6089a) {
            i10 = zVar.e;
        } else {
            i10 = zVar.f6127f;
        }
        if (this.f51398p) {
            i11 = (this.f51397o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = xVar.f9732a;
        int length = bArr.length;
        int i13 = xVar.f9734c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i13);
        }
        byte[] bArr2 = xVar.f9732a;
        int i14 = xVar.f9734c;
        bArr2[i14 - 4] = (byte) (j10 & 255);
        bArr2[i14 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f51398p = true;
        this.f51397o = i10;
        return j10;
    }

    @Override
    public final boolean c(x xVar, long j10, m4.c cVar) {
        e0 e0Var;
        int i10;
        int i11;
        long j11;
        if (this.f51396n != null) {
            ((b2.x) cVar.f18009b).getClass();
            return false;
        }
        z zVar = this.f51399q;
        int i12 = 4;
        int i13 = -1;
        if (zVar == null) {
            c3.b.w(1, xVar, false);
            xVar.s();
            int A = xVar.A();
            int s10 = xVar.s();
            int o10 = xVar.o();
            if (o10 <= 0) {
                o10 = -1;
            }
            int o11 = xVar.o();
            if (o11 > 0) {
                i13 = o11;
            }
            xVar.o();
            int A2 = xVar.A();
            int pow = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            xVar.A();
            ?? copyOf = Arrays.copyOf(xVar.f9732a, xVar.f9734c);
            ?? obj = new Object();
            obj.f6124a = A;
            obj.f6125b = s10;
            obj.f6126c = o10;
            obj.d = i13;
            obj.e = (int) Math.pow(2.0d, A2 & 15);
            obj.f6127f = pow;
            obj.f6128g = copyOf;
            this.f51399q = obj;
        } else {
            l0 l0Var = this.f51400r;
            if (l0Var == null) {
                this.f51400r = c3.b.u(xVar, true, true);
            } else {
                int i14 = xVar.f9734c;
                byte[] bArr = new byte[i14];
                System.arraycopy(xVar.f9732a, 0, bArr, 0, i14);
                int i15 = zVar.f6124a;
                int i16 = 5;
                c3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                a4.g gVar = new a4.g(xVar.f9732a);
                int i17 = 8;
                gVar.o(xVar.f9733b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 < A3) {
                        int i20 = i17;
                        if (gVar.g(24) == 5653314) {
                            int g7 = gVar.g(16);
                            int g10 = gVar.g(24);
                            if (!gVar.f()) {
                                boolean f7 = gVar.f();
                                for (int i21 = 0; i21 < g10; i21++) {
                                    if (f7) {
                                        if (gVar.f()) {
                                            gVar.o(i16);
                                        }
                                    } else {
                                        gVar.o(i16);
                                    }
                                }
                            } else {
                                gVar.o(i16);
                                int i22 = 0;
                                while (i22 < g10) {
                                    int i23 = 0;
                                    for (int i24 = g10 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    i22 += gVar.g(i23);
                                }
                            }
                            int g11 = gVar.g(4);
                            if (g11 <= 2) {
                                if (g11 == 1 || g11 == 2) {
                                    gVar.o(32);
                                    gVar.o(32);
                                    int g12 = gVar.g(4) + 1;
                                    gVar.o(1);
                                    if (g11 == 1) {
                                        if (g7 != 0) {
                                            j11 = (long) Math.floor(Math.pow(g10, 1.0d / g7));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = g10 * g7;
                                    }
                                    gVar.o((int) (j11 * g12));
                                }
                                i18++;
                                i17 = i20;
                                i16 = 5;
                            } else {
                                throw x0.a(null, "lookup type greater than 2 not decodable: " + g11);
                            }
                        } else {
                            throw x0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                    } else {
                        int i25 = i17;
                        int i26 = 6;
                        int g13 = gVar.g(6) + 1;
                        for (int i27 = 0; i27 < g13; i27++) {
                            if (gVar.g(16) != 0) {
                                throw x0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i28 = 1;
                        int g14 = gVar.g(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < g14) {
                                int g15 = gVar.g(i19);
                                if (g15 != 0) {
                                    if (g15 == i28) {
                                        int g16 = gVar.g(5);
                                        int[] iArr = new int[g16];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < g16; i32++) {
                                            int g17 = gVar.g(i12);
                                            iArr[i32] = g17;
                                            if (g17 > i31) {
                                                i31 = g17;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = gVar.g(i30) + 1;
                                            int g18 = gVar.g(2);
                                            int i35 = i25;
                                            if (g18 > 0) {
                                                gVar.o(i35);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << g18); i37 = 1) {
                                                gVar.o(i35);
                                                i36++;
                                                i35 = 8;
                                            }
                                            i34++;
                                            iArr2 = iArr3;
                                            i25 = 8;
                                            i30 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        gVar.o(2);
                                        int g19 = gVar.g(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < g16; i40++) {
                                            i38 += iArr4[iArr[i40]];
                                            while (i39 < i38) {
                                                gVar.o(g19);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw x0.a(null, "floor type greater than 1 not decodable: " + g15);
                                    }
                                } else {
                                    int i41 = i25;
                                    gVar.o(i41);
                                    gVar.o(16);
                                    gVar.o(16);
                                    gVar.o(6);
                                    gVar.o(i41);
                                    int g20 = gVar.g(4) + 1;
                                    int i42 = 0;
                                    while (i42 < g20) {
                                        gVar.o(i41);
                                        i42++;
                                        i41 = 8;
                                    }
                                }
                                i29++;
                                i25 = 8;
                                i26 = 6;
                                i12 = 4;
                                i19 = 16;
                                i28 = 1;
                            } else {
                                int g21 = gVar.g(i26) + 1;
                                int i43 = 0;
                                while (i43 < g21) {
                                    if (gVar.g(16) <= 2) {
                                        gVar.o(24);
                                        gVar.o(24);
                                        gVar.o(24);
                                        int g22 = gVar.g(i26) + 1;
                                        int i44 = 8;
                                        gVar.o(8);
                                        int[] iArr5 = new int[g22];
                                        for (int i45 = 0; i45 < g22; i45++) {
                                            int g23 = gVar.g(3);
                                            if (gVar.f()) {
                                                i11 = gVar.g(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr5[i45] = (i11 * 8) + g23;
                                        }
                                        int i46 = 0;
                                        while (i46 < g22) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr5[i46] & (1 << i47)) != 0) {
                                                    gVar.o(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i26 = 6;
                                    } else {
                                        throw x0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int g24 = gVar.g(i26) + 1;
                                for (int i48 = 0; i48 < g24; i48++) {
                                    int g25 = gVar.g(16);
                                    if (g25 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + g25);
                                    } else {
                                        if (gVar.f()) {
                                            i10 = gVar.g(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (gVar.f()) {
                                            int g26 = gVar.g(8) + 1;
                                            for (int i49 = 0; i49 < g26; i49++) {
                                                int i50 = i15 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                gVar.o(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                gVar.o(i53);
                                            }
                                        }
                                        if (gVar.g(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i54 = 0; i54 < i15; i54++) {
                                                    gVar.o(4);
                                                }
                                            }
                                            for (int i55 = 0; i55 < i10; i55++) {
                                                gVar.o(8);
                                                gVar.o(8);
                                                gVar.o(8);
                                            }
                                        } else {
                                            throw x0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int g27 = gVar.g(6);
                                int i56 = g27 + 1;
                                m0[] m0VarArr = new m0[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean f10 = gVar.f();
                                    gVar.g(16);
                                    gVar.g(16);
                                    gVar.g(8);
                                    ?? obj2 = new Object();
                                    obj2.f6089a = f10;
                                    m0VarArr[i57] = obj2;
                                }
                                if (gVar.f()) {
                                    int i58 = 0;
                                    while (g27 > 0) {
                                        i58++;
                                        g27 >>>= 1;
                                    }
                                    e0Var = new e0(zVar, l0Var, bArr, m0VarArr, i58);
                                } else {
                                    throw x0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        e0Var = null;
        this.f51396n = e0Var;
        if (e0Var == null) {
            return true;
        }
        z zVar2 = (z) e0Var.f9530c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f6128g);
        arrayList.add((byte[]) e0Var.e);
        u0 r6 = c3.b.r(i0.v(((l0) e0Var.d).f6082a));
        w wVar = new w();
        wVar.f3532q = w0.n("audio/ogg");
        wVar.f3533r = w0.n("audio/vorbis");
        wVar.h = zVar2.d;
        wVar.f3524i = zVar2.f6126c;
        wVar.J = zVar2.f6124a;
        wVar.K = zVar2.f6125b;
        wVar.f3536u = arrayList;
        wVar.f3526k = r6;
        cVar.f18009b = new b2.x(wVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f51396n = null;
            this.f51399q = null;
            this.f51400r = null;
        }
        this.f51397o = 0;
        this.f51398p = false;
    }
}
