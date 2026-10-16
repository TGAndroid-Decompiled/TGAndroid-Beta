package x3;

import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.k0;
import c3.z;
import e0.g0;
import e2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;
public final class j extends i {
    public g0 f47829n;
    public int f47830o;
    public boolean f47831p;
    public z f47832q;
    public k0 f47833r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f47823g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47831p = z10;
        z zVar = this.f47832q;
        if (zVar != null) {
            i10 = zVar.e;
        }
        this.f47830o = i10;
    }

    @Override
    public final long b(x xVar) {
        int i10;
        int i11 = 0;
        byte b10 = xVar.f8414a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        g0 g0Var = this.f47829n;
        g0Var.getClass();
        int i12 = g0Var.f8220a;
        z zVar = (z) g0Var.f8221b;
        if (!((ai.a[]) g0Var.e)[(b10 >> 1) & (255 >>> (8 - i12))].f918a) {
            i10 = zVar.e;
        } else {
            i10 = zVar.f4318f;
        }
        if (this.f47831p) {
            i11 = (this.f47830o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = xVar.f8414a;
        int length = bArr.length;
        int i13 = xVar.f8416c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i13);
        }
        byte[] bArr2 = xVar.f8414a;
        int i14 = xVar.f8416c;
        bArr2[i14 - 4] = (byte) (j10 & 255);
        bArr2[i14 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f47831p = true;
        this.f47830o = i10;
        return j10;
    }

    @Override
    public final boolean c(x xVar, long j10, n3.b bVar) {
        g0 g0Var;
        int i10;
        int i11;
        long j11;
        if (this.f47829n != null) {
            ((b2.x) bVar.f15703b).getClass();
            return false;
        }
        z zVar = this.f47832q;
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
            ?? copyOf = Arrays.copyOf(xVar.f8414a, xVar.f8416c);
            ?? obj = new Object();
            obj.f4315a = A;
            obj.f4316b = s10;
            obj.f4317c = o10;
            obj.d = i13;
            obj.e = (int) Math.pow(2.0d, A2 & 15);
            obj.f4318f = pow;
            obj.f4319g = copyOf;
            this.f47832q = obj;
        } else {
            k0 k0Var = this.f47833r;
            if (k0Var == null) {
                this.f47833r = c3.b.u(xVar, true, true);
            } else {
                int i14 = xVar.f8416c;
                byte[] bArr = new byte[i14];
                System.arraycopy(xVar.f8414a, 0, bArr, 0, i14);
                int i15 = zVar.f4315a;
                int i16 = 5;
                c3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                a4.g gVar = new a4.g(xVar.f8414a);
                int i17 = 8;
                gVar.o(xVar.f8415b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 < A3) {
                        int i20 = i17;
                        if (gVar.g(24) == 5653314) {
                            int g10 = gVar.g(16);
                            int g11 = gVar.g(24);
                            if (!gVar.f()) {
                                boolean f7 = gVar.f();
                                for (int i21 = 0; i21 < g11; i21++) {
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
                                while (i22 < g11) {
                                    int i23 = 0;
                                    for (int i24 = g11 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    i22 += gVar.g(i23);
                                }
                            }
                            int g12 = gVar.g(4);
                            if (g12 <= 2) {
                                if (g12 == 1 || g12 == 2) {
                                    gVar.o(32);
                                    gVar.o(32);
                                    int g13 = gVar.g(4) + 1;
                                    gVar.o(1);
                                    if (g12 == 1) {
                                        if (g10 != 0) {
                                            j11 = (long) Math.floor(Math.pow(g11, 1.0d / g10));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = g11 * g10;
                                    }
                                    gVar.o((int) (j11 * g13));
                                }
                                i18++;
                                i17 = i20;
                                i16 = 5;
                            } else {
                                throw x0.a(null, "lookup type greater than 2 not decodable: " + g12);
                            }
                        } else {
                            throw x0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                    } else {
                        int i25 = i17;
                        int i26 = 6;
                        int g14 = gVar.g(6) + 1;
                        for (int i27 = 0; i27 < g14; i27++) {
                            if (gVar.g(16) != 0) {
                                throw x0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i28 = 1;
                        int g15 = gVar.g(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < g15) {
                                int g16 = gVar.g(i19);
                                if (g16 != 0) {
                                    if (g16 == i28) {
                                        int g17 = gVar.g(5);
                                        int[] iArr = new int[g17];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < g17; i32++) {
                                            int g18 = gVar.g(i12);
                                            iArr[i32] = g18;
                                            if (g18 > i31) {
                                                i31 = g18;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = gVar.g(i30) + 1;
                                            int g19 = gVar.g(2);
                                            int i35 = i25;
                                            if (g19 > 0) {
                                                gVar.o(i35);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << g19); i37 = 1) {
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
                                        int g20 = gVar.g(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < g17; i40++) {
                                            i38 += iArr4[iArr[i40]];
                                            while (i39 < i38) {
                                                gVar.o(g20);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw x0.a(null, "floor type greater than 1 not decodable: " + g16);
                                    }
                                } else {
                                    int i41 = i25;
                                    gVar.o(i41);
                                    gVar.o(16);
                                    gVar.o(16);
                                    gVar.o(6);
                                    gVar.o(i41);
                                    int g21 = gVar.g(4) + 1;
                                    int i42 = 0;
                                    while (i42 < g21) {
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
                                int g22 = gVar.g(i26) + 1;
                                int i43 = 0;
                                while (i43 < g22) {
                                    if (gVar.g(16) <= 2) {
                                        gVar.o(24);
                                        gVar.o(24);
                                        gVar.o(24);
                                        int g23 = gVar.g(i26) + 1;
                                        int i44 = 8;
                                        gVar.o(8);
                                        int[] iArr5 = new int[g23];
                                        for (int i45 = 0; i45 < g23; i45++) {
                                            int g24 = gVar.g(3);
                                            if (gVar.f()) {
                                                i11 = gVar.g(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr5[i45] = (i11 * 8) + g24;
                                        }
                                        int i46 = 0;
                                        while (i46 < g23) {
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
                                int g25 = gVar.g(i26) + 1;
                                for (int i48 = 0; i48 < g25; i48++) {
                                    int g26 = gVar.g(16);
                                    if (g26 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + g26);
                                    } else {
                                        if (gVar.f()) {
                                            i10 = gVar.g(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (gVar.f()) {
                                            int g27 = gVar.g(8) + 1;
                                            for (int i49 = 0; i49 < g27; i49++) {
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
                                int g28 = gVar.g(6);
                                int i56 = g28 + 1;
                                ai.a[] aVarArr = new ai.a[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean f10 = gVar.f();
                                    gVar.g(16);
                                    gVar.g(16);
                                    gVar.g(8);
                                    ?? obj2 = new Object();
                                    obj2.f918a = f10;
                                    aVarArr[i57] = obj2;
                                }
                                if (gVar.f()) {
                                    int i58 = 0;
                                    while (g28 > 0) {
                                        i58++;
                                        g28 >>>= 1;
                                    }
                                    g0Var = new g0(zVar, k0Var, bArr, aVarArr, i58);
                                } else {
                                    throw x0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        g0Var = null;
        this.f47829n = g0Var;
        if (g0Var == null) {
            return true;
        }
        z zVar2 = (z) g0Var.f8221b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f4319g);
        arrayList.add((byte[]) g0Var.d);
        u0 r10 = c3.b.r(n0.v(((k0) g0Var.f8222c).f4270a));
        w wVar = new w();
        wVar.f2469q = w0.n("audio/ogg");
        wVar.f2470r = w0.n("audio/vorbis");
        wVar.h = zVar2.d;
        wVar.f2461i = zVar2.f4317c;
        wVar.J = zVar2.f4315a;
        wVar.K = zVar2.f4316b;
        wVar.f2473u = arrayList;
        wVar.f2463k = r10;
        bVar.f15703b = new b2.x(wVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f47829n = null;
            this.f47832q = null;
            this.f47833r = null;
        }
        this.f47830o = 0;
        this.f47831p = false;
    }
}
