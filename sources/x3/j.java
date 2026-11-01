package x3;

import a4.l;
import b2.u0;
import b2.v0;
import b2.w;
import b2.w0;
import c3.m0;
import c3.z;
import e2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;
public final class j extends i {
    public cc.f f53013n;
    public int f53014o;
    public boolean f53015p;
    public z f53016q;
    public l f53017r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f53007g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f53015p = z10;
        z zVar = this.f53016q;
        if (zVar != null) {
            i10 = zVar.e;
        }
        this.f53014o = i10;
    }

    @Override
    public final long b(x xVar) {
        int i10;
        int i11 = 0;
        byte b10 = xVar.f6207a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        cc.f fVar = this.f53013n;
        fVar.getClass();
        int i12 = fVar.f4116b;
        z zVar = (z) fVar.f4117c;
        if (!((m0[]) fVar.f4118f)[(b10 >> 1) & (255 >>> (8 - i12))].f3684a) {
            i10 = zVar.e;
        } else {
            i10 = zVar.f3722f;
        }
        if (this.f53015p) {
            i11 = (this.f53014o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = xVar.f6207a;
        int length = bArr.length;
        int i13 = xVar.f6209c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i13);
        }
        byte[] bArr2 = xVar.f6207a;
        int i14 = xVar.f6209c;
        bArr2[i14 - 4] = (byte) (j10 & 255);
        bArr2[i14 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f53015p = true;
        this.f53014o = i10;
        return j10;
    }

    @Override
    public final boolean c(x xVar, long j10, m5.e eVar) {
        cc.f fVar;
        int i10;
        int i11;
        long j11;
        if (this.f53013n != null) {
            ((b2.x) eVar.f13014b).getClass();
            return false;
        }
        z zVar = this.f53016q;
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
            ?? copyOf = Arrays.copyOf(xVar.f6207a, xVar.f6209c);
            ?? obj = new Object();
            obj.f3719a = A;
            obj.f3720b = s10;
            obj.f3721c = o10;
            obj.d = i13;
            obj.e = (int) Math.pow(2.0d, A2 & 15);
            obj.f3722f = pow;
            obj.f3723g = copyOf;
            this.f53016q = obj;
        } else {
            l lVar = this.f53017r;
            if (lVar == null) {
                this.f53017r = c3.b.u(xVar, true, true);
            } else {
                int i14 = xVar.f6209c;
                byte[] bArr = new byte[i14];
                System.arraycopy(xVar.f6207a, 0, bArr, 0, i14);
                int i15 = zVar.f3719a;
                int i16 = 5;
                c3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                a4.g gVar = new a4.g(xVar.f6207a);
                int i17 = 8;
                gVar.f0(xVar.f6208b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 < A3) {
                        int i20 = i17;
                        if (gVar.i(24) == 5653314) {
                            int i21 = gVar.i(16);
                            int i22 = gVar.i(24);
                            if (!gVar.h()) {
                                boolean h = gVar.h();
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if (h) {
                                        if (gVar.h()) {
                                            gVar.f0(i16);
                                        }
                                    } else {
                                        gVar.f0(i16);
                                    }
                                }
                            } else {
                                gVar.f0(i16);
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
                                    gVar.f0(32);
                                    gVar.f0(32);
                                    int i28 = gVar.i(4) + 1;
                                    gVar.f0(1);
                                    if (i27 == 1) {
                                        if (i21 != 0) {
                                            j11 = (long) Math.floor(Math.pow(i22, 1.0d / i21));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = i22 * i21;
                                    }
                                    gVar.f0((int) (j11 * i28));
                                }
                                i18++;
                                i17 = i20;
                                i16 = 5;
                            } else {
                                throw w0.a(null, "lookup type greater than 2 not decodable: " + i27);
                            }
                        } else {
                            throw w0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                    } else {
                        int i29 = i17;
                        int i30 = 6;
                        int i31 = gVar.i(6) + 1;
                        for (int i32 = 0; i32 < i31; i32++) {
                            if (gVar.i(16) != 0) {
                                throw w0.a(null, "placeholder of time domain transforms not zeroed out");
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
                                                gVar.f0(i45);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i46 = 0;
                                            for (int i47 = 1; i46 < (i47 << i44); i47 = 1) {
                                                gVar.f0(i45);
                                                i46++;
                                                i45 = 8;
                                            }
                                            i43++;
                                            iArr2 = iArr3;
                                            i29 = 8;
                                            i36 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        gVar.f0(2);
                                        int i48 = gVar.i(4);
                                        int i49 = 0;
                                        int i50 = 0;
                                        for (int i51 = 0; i51 < i38; i51++) {
                                            i49 += iArr4[iArr[i51]];
                                            while (i50 < i49) {
                                                gVar.f0(i48);
                                                i50++;
                                            }
                                        }
                                    } else {
                                        throw w0.a(null, "floor type greater than 1 not decodable: " + i37);
                                    }
                                } else {
                                    int i52 = i29;
                                    gVar.f0(i52);
                                    gVar.f0(16);
                                    gVar.f0(16);
                                    gVar.f0(6);
                                    gVar.f0(i52);
                                    int i53 = gVar.i(4) + 1;
                                    int i54 = 0;
                                    while (i54 < i53) {
                                        gVar.f0(i52);
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
                                        gVar.f0(24);
                                        gVar.f0(24);
                                        gVar.f0(24);
                                        int i57 = gVar.i(i30) + 1;
                                        int i58 = 8;
                                        gVar.f0(8);
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
                                                    gVar.f0(i58);
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
                                        throw w0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i63 = gVar.i(i30) + 1;
                                for (int i64 = 0; i64 < i63; i64++) {
                                    int i65 = gVar.i(16);
                                    if (i65 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + i65);
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
                                                gVar.f0(i69);
                                                int i71 = 0;
                                                while (i68 > 0) {
                                                    i71++;
                                                    i68 >>>= 1;
                                                }
                                                gVar.f0(i71);
                                            }
                                        }
                                        if (gVar.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i72 = 0; i72 < i15; i72++) {
                                                    gVar.f0(4);
                                                }
                                            }
                                            for (int i73 = 0; i73 < i10; i73++) {
                                                gVar.f0(8);
                                                gVar.f0(8);
                                                gVar.f0(8);
                                            }
                                        } else {
                                            throw w0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int i74 = gVar.i(6);
                                int i75 = i74 + 1;
                                m0[] m0VarArr = new m0[i75];
                                for (int i76 = 0; i76 < i75; i76++) {
                                    boolean h10 = gVar.h();
                                    gVar.i(16);
                                    gVar.i(16);
                                    gVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f3684a = h10;
                                    m0VarArr[i76] = obj2;
                                }
                                if (gVar.h()) {
                                    int i77 = 0;
                                    while (i74 > 0) {
                                        i77++;
                                        i74 >>>= 1;
                                    }
                                    fVar = new cc.f(zVar, lVar, bArr, m0VarArr, i77);
                                } else {
                                    throw w0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        fVar = null;
        this.f53013n = fVar;
        if (fVar == null) {
            return true;
        }
        z zVar2 = (z) fVar.f4117c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f3723g);
        arrayList.add((byte[]) fVar.e);
        u0 r10 = c3.b.r(n0.v((String[]) ((l) fVar.d).f279b));
        w wVar = new w();
        wVar.f2369q = v0.n("audio/ogg");
        wVar.f2370r = v0.n("audio/vorbis");
        wVar.h = zVar2.d;
        wVar.f2361i = zVar2.f3721c;
        wVar.J = zVar2.f3719a;
        wVar.K = zVar2.f3720b;
        wVar.f2373u = arrayList;
        wVar.f2363k = r10;
        eVar.f13014b = new b2.x(wVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f53013n = null;
            this.f53016q = null;
            this.f53017r = null;
        }
        this.f53014o = 0;
        this.f53015p = false;
    }
}
