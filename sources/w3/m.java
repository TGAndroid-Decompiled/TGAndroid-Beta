package w3;

import f2.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;

public final class m implements h {

    public static final float[] f49099l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    public final a0 f49100a;

    public final d5.z f49101b;

    public final boolean[] f49102c = new boolean[4];
    public final k d;

    public final g0 f49103e;

    public l f49104f;

    public long f49105g;
    public String h;

    public m3.w f49106i;

    public boolean f49107j;

    public long f49108k;

    public m(a0 a0Var) {
        this.f49100a = a0Var;
        k kVar = new k();
        kVar.f49092e = new byte[128];
        this.d = kVar;
        this.f49108k = -9223372036854775807L;
        this.f49103e = new g0(178);
        this.f49101b = new d5.z();
    }

    @Override
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        d5.a.j(this.f49104f);
        d5.a.j(this.f49106i);
        int i14 = zVar.f4859b;
        int i15 = zVar.f4860c;
        byte[] bArr = zVar.f4858a;
        this.f49105g += (long) zVar.a();
        this.f49106i.a(zVar.a(), zVar);
        while (true) {
            int iR = d5.a.r(bArr, i14, i15, this.f49102c);
            k kVar = this.d;
            g0 g0Var = this.f49103e;
            if (iR == i15) {
                if (!this.f49107j) {
                    kVar.a(i14, i15, bArr);
                }
                this.f49104f.a(i14, i15, bArr);
                if (g0Var != null) {
                    g0Var.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = iR + 3;
            byte b10 = zVar.f4858a[i16];
            int i17 = b10 & 255;
            int i18 = iR - i14;
            if (this.f49107j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    kVar.a(i14, iR, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = kVar.f49090b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.f49089a = false;
                            kVar.f49091c = 0;
                            kVar.f49090b = 0;
                        } else {
                            kVar.f49090b = 2;
                        }
                    } else if (i20 != 2) {
                        i11 = i16;
                        if (i20 != 3) {
                            if (i20 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i17 == 179 || i17 == 181) {
                                kVar.f49091c -= i19;
                                kVar.f49089a = false;
                                m3.w wVar = this.f49106i;
                                int i21 = kVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(kVar.f49092e, kVar.f49091c);
                                d5.y yVar = new d5.y(bArrCopyOf, bArrCopyOf.length);
                                yVar.t(i21);
                                yVar.t(4);
                                yVar.r();
                                yVar.s(8);
                                if (yVar.h()) {
                                    yVar.s(4);
                                    yVar.s(3);
                                }
                                int i22 = yVar.i(4);
                                if (i22 == 15) {
                                    int i23 = yVar.i(8);
                                    int i24 = yVar.i(8);
                                    if (i24 == 0) {
                                        d5.a.K("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                    } else {
                                        f10 = i23 / i24;
                                    }
                                } else if (i22 < 7) {
                                    f10 = f49099l[i22];
                                } else {
                                    d5.a.K("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                }
                                if (yVar.h()) {
                                    yVar.s(2);
                                    yVar.s(1);
                                    if (yVar.h()) {
                                        yVar.s(15);
                                        yVar.r();
                                        yVar.s(15);
                                        yVar.r();
                                        yVar.s(15);
                                        yVar.r();
                                        yVar.s(3);
                                        yVar.s(11);
                                        yVar.r();
                                        yVar.s(15);
                                        yVar.r();
                                    }
                                }
                                if (yVar.i(2) != 0) {
                                    d5.a.K("H263Reader", "Unhandled video object layer shape");
                                }
                                yVar.r();
                                int i25 = yVar.i(16);
                                yVar.r();
                                if (yVar.h()) {
                                    if (i25 == 0) {
                                        d5.a.K("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i26 = 0;
                                        for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                            i26++;
                                        }
                                        yVar.s(i26);
                                    }
                                }
                                yVar.r();
                                int i28 = yVar.i(13);
                                yVar.r();
                                int i29 = yVar.i(13);
                                yVar.r();
                                yVar.r();
                                s0 s0Var = new s0();
                                s0Var.f8123a = str;
                                s0Var.f8135o = "video/mp4v-es";
                                s0Var.f8140t = i28;
                                s0Var.f8141u = i29;
                                s0Var.f8143x = f10;
                                s0Var.f8137q = Collections.singletonList(bArrCopyOf);
                                wVar.c(new t0(s0Var));
                                this.f49107j = true;
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            kVar.f49089a = false;
                            kVar.f49091c = 0;
                            kVar.f49090b = 0;
                        } else {
                            i13 = 0;
                            kVar.d = kVar.f49091c;
                            kVar.f49090b = 4;
                        }
                    } else {
                        i11 = i16;
                        i13 = 0;
                        if (i17 > 31) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.f49089a = false;
                            kVar.f49091c = 0;
                            kVar.f49090b = 0;
                        } else {
                            kVar.f49090b = 3;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i13 = 0;
                    if (i17 == 176) {
                        kVar.f49090b = 1;
                        kVar.f49089a = true;
                    }
                }
                kVar.a(i13, 3, k.f49088f);
            }
            this.f49104f.a(i14, iR, bArr);
            if (g0Var != null) {
                if (i18 > 0) {
                    g0Var.a(i14, iR, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (g0Var.e(i12)) {
                    int iJ = d5.a.J(g0Var.f5674e, (byte[]) g0Var.f5675f);
                    int i30 = d5.g0.f4795a;
                    byte[] bArr2 = (byte[]) g0Var.f5675f;
                    d5.z zVar2 = this.f49101b;
                    zVar2.A(iJ, bArr2);
                    this.f49100a.a(this.f49108k, zVar2);
                }
                if (i17 == 178) {
                    if (zVar.f4858a[iR + 2] == 1) {
                        g0Var.g(i17);
                    }
                }
            }
            int i31 = i10 - iR;
            long j10 = this.f49105g - ((long) i31);
            l lVar = this.f49104f;
            boolean z10 = this.f49107j;
            if (lVar.f49096e == 182 && z10 && lVar.f49094b) {
                long j11 = lVar.h;
                if (j11 != -9223372036854775807L) {
                    lVar.f49093a.e(j11, lVar.d ? 1 : 0, (int) (j10 - lVar.f49098g), i31, null);
                }
            }
            if (lVar.f49096e != 179) {
                lVar.f49098g = j10;
            }
            l lVar2 = this.f49104f;
            long j12 = this.f49108k;
            lVar2.f49096e = i17;
            lVar2.d = false;
            lVar2.f49094b = i17 == 182 || i17 == 179;
            lVar2.f49095c = i17 == 182;
            lVar2.f49097f = 0;
            lVar2.h = j12;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override
    public final void c() {
        d5.a.m(this.f49102c);
        k kVar = this.d;
        kVar.f49089a = false;
        kVar.f49091c = 0;
        kVar.f49090b = 0;
        l lVar = this.f49104f;
        if (lVar != null) {
            lVar.f49094b = false;
            lVar.f49095c = false;
            lVar.d = false;
            lVar.f49096e = -1;
        }
        g0 g0Var = this.f49103e;
        if (g0Var != null) {
            g0Var.f();
        }
        this.f49105g = 0L;
        this.f49108k = -9223372036854775807L;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.h = e0Var.f49053e;
        e0Var.b();
        m3.w wVarC = mVar.C(e0Var.d, 2);
        this.f49106i = wVarC;
        this.f49104f = new l(wVarC);
        this.f49100a.b(mVar, e0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49108k = j10;
        }
    }

    @Override
    public final void d() {
    }
}
