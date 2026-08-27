package w3;

import f2.g0;
import h3.s0;
import h3.t0;
import java.util.Collections;

public final class r implements h {

    public final a0 f49163a;

    public String f49164b;

    public m3.w f49165c;
    public q d;

    public boolean f49166e;

    public long f49172l;

    public final boolean[] f49167f = new boolean[3];

    public final g0 f49168g = new g0(32);
    public final g0 h = new g0(33);

    public final g0 f49169i = new g0(34);

    public final g0 f49170j = new g0(39);

    public final g0 f49171k = new g0(40);

    public long f49173m = -9223372036854775807L;

    public final d5.z f49174n = new d5.z();

    public r(a0 a0Var) {
        this.f49163a = a0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        q qVar = this.d;
        if (qVar.f49156f) {
            int i12 = qVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                qVar.f49157g = (bArr[i13] & 128) != 0;
                qVar.f49156f = false;
            } else {
                qVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f49166e) {
            this.f49168g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f49169i.a(i10, i11, bArr);
        }
        this.f49170j.a(i10, i11, bArr);
        this.f49171k.a(i10, i11, bArr);
    }

    @Override
    public final void b(d5.z zVar) {
        g0 g0Var;
        boolean z10;
        boolean z11;
        int i10;
        float f10;
        d5.a.j(this.f49165c);
        int i11 = d5.g0.f4795a;
        while (zVar.a() > 0) {
            int i12 = zVar.f4859b;
            int i13 = zVar.f4860c;
            byte[] bArr = zVar.f4858a;
            this.f49172l += (long) zVar.a();
            this.f49165c.a(zVar.a(), zVar);
            while (i12 < i13) {
                int iR = d5.a.r(bArr, i12, i13, this.f49167f);
                if (iR == i13) {
                    a(i12, i13, bArr);
                    return;
                }
                int i14 = iR + 3;
                int i15 = (bArr[i14] & 126) >> 1;
                int i16 = iR - i12;
                if (i16 > 0) {
                    a(i12, iR, bArr);
                }
                int i17 = i13 - iR;
                long j10 = this.f49172l - ((long) i17);
                int i18 = i16 < 0 ? -i16 : 0;
                long j11 = this.f49173m;
                m3.w[] wVarArr = this.f49163a.f48985c;
                q qVar = this.d;
                boolean z12 = this.f49166e;
                if (qVar.f49159j && qVar.f49157g) {
                    qVar.f49162m = qVar.f49154c;
                    qVar.f49159j = false;
                } else if (qVar.h || qVar.f49157g) {
                    if (z12 && qVar.f49158i) {
                        long j12 = qVar.f49153b;
                        int i19 = i17 + ((int) (j10 - j12));
                        long j13 = qVar.f49161l;
                        if (j13 != -9223372036854775807L) {
                            qVar.f49152a.e(j13, qVar.f49162m ? 1 : 0, (int) (j12 - qVar.f49160k), i19, null);
                        }
                    }
                    qVar.f49160k = qVar.f49153b;
                    qVar.f49161l = qVar.f49155e;
                    qVar.f49162m = qVar.f49154c;
                    qVar.f49158i = true;
                }
                boolean z13 = this.f49166e;
                g0 g0Var2 = this.f49168g;
                g0 g0Var3 = this.h;
                g0 g0Var4 = this.f49169i;
                if (!z13) {
                    g0Var2.e(i18);
                    g0Var3.e(i18);
                    g0Var4.e(i18);
                    if (g0Var2.d && g0Var3.d && g0Var4.d) {
                        m3.w wVar = this.f49165c;
                        String str = this.f49164b;
                        int i20 = g0Var2.f5674e;
                        byte[] bArr2 = new byte[g0Var3.f5674e + i20 + g0Var4.f5674e];
                        System.arraycopy((byte[]) g0Var2.f5675f, 0, bArr2, 0, i20);
                        System.arraycopy((byte[]) g0Var3.f5675f, 0, bArr2, g0Var2.f5674e, g0Var3.f5674e);
                        System.arraycopy((byte[]) g0Var4.f5675f, 0, bArr2, g0Var2.f5674e + g0Var3.f5674e, g0Var4.f5674e);
                        d5.y yVar = new d5.y((byte[]) g0Var3.f5675f, 0, g0Var3.f5674e);
                        yVar.s(44);
                        int i21 = yVar.i(3);
                        yVar.r();
                        int i22 = yVar.i(2);
                        boolean zH = yVar.h();
                        int i23 = yVar.i(5);
                        int i24 = 0;
                        for (int i25 = 0; i25 < 32; i25++) {
                            if (yVar.h()) {
                                i24 |= 1 << i25;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i26 = 0; i26 < 6; i26++) {
                            iArr[i26] = yVar.i(8);
                        }
                        int i27 = yVar.i(8);
                        int i28 = 0;
                        for (int i29 = 0; i29 < i21; i29++) {
                            if (yVar.h()) {
                                i28 += 89;
                            }
                            if (yVar.h()) {
                                i28 += 8;
                            }
                        }
                        yVar.s(i28);
                        if (i21 > 0) {
                            yVar.s((8 - i21) * 2);
                        }
                        yVar.l();
                        int iL = yVar.l();
                        if (iL == 3) {
                            yVar.r();
                        }
                        int iL2 = yVar.l();
                        int iL3 = yVar.l();
                        if (yVar.h()) {
                            int iL4 = yVar.l();
                            int iL5 = yVar.l();
                            int iL6 = yVar.l();
                            int iL7 = yVar.l();
                            iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
                            iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
                        }
                        yVar.l();
                        yVar.l();
                        int iL8 = yVar.l();
                        for (int i30 = yVar.h() ? 0 : i21; i30 <= i21; i30++) {
                            yVar.l();
                            yVar.l();
                            yVar.l();
                        }
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        if (yVar.h() && yVar.h()) {
                            int i31 = 0;
                            for (int i32 = 4; i31 < i32; i32 = 4) {
                                int i33 = iL8;
                                for (int i34 = 0; i34 < 6; i34 += i31 == 3 ? 3 : 1) {
                                    if (yVar.h()) {
                                        int iMin = Math.min(64, 1 << ((i31 << 1) + 4));
                                        if (i31 > 1) {
                                            yVar.m();
                                        }
                                        for (int i35 = 0; i35 < iMin; i35++) {
                                            yVar.m();
                                        }
                                    } else {
                                        yVar.l();
                                    }
                                }
                                i31++;
                                iL8 = i33;
                            }
                        }
                        int i36 = iL8;
                        yVar.s(2);
                        if (yVar.h()) {
                            yVar.s(8);
                            yVar.l();
                            yVar.l();
                            yVar.r();
                        }
                        int i37 = 0;
                        int i38 = 0;
                        boolean zH2 = false;
                        for (int iL9 = yVar.l(); i37 < iL9; iL9 = iL9) {
                            if (i37 != 0) {
                                zH2 = yVar.h();
                            }
                            if (zH2) {
                                yVar.r();
                                yVar.l();
                                for (int i39 = 0; i39 <= i38; i39++) {
                                    if (yVar.h()) {
                                        yVar.r();
                                    }
                                }
                            } else {
                                int iL10 = yVar.l();
                                int iL11 = yVar.l();
                                int i40 = iL10 + iL11;
                                for (int i41 = 0; i41 < iL10; i41++) {
                                    yVar.l();
                                    yVar.r();
                                }
                                for (int i42 = 0; i42 < iL11; i42++) {
                                    yVar.l();
                                    yVar.r();
                                }
                                i38 = i40;
                            }
                            i37++;
                        }
                        if (yVar.h()) {
                            for (int i43 = 0; i43 < yVar.l(); i43++) {
                                yVar.s(i36 + 5);
                            }
                        }
                        yVar.s(2);
                        if (yVar.h()) {
                            if (yVar.h()) {
                                int i44 = yVar.i(8);
                                if (i44 == 255) {
                                    int i45 = yVar.i(16);
                                    int i46 = yVar.i(16);
                                    if (i45 == 0 || i46 == 0) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = i45 / i46;
                                    }
                                } else {
                                    float[] fArr = d5.a.f4766e;
                                    if (i44 < 17) {
                                        f10 = fArr[i44];
                                    } else {
                                        com.google.android.recaptcha.internal.a.s(i44, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                        f10 = 1.0f;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            if (yVar.h()) {
                                yVar.r();
                            }
                            if (yVar.h()) {
                                yVar.s(4);
                                if (yVar.h()) {
                                    yVar.s(24);
                                }
                            }
                            if (yVar.h()) {
                                yVar.l();
                                yVar.l();
                            }
                            yVar.r();
                            if (yVar.h()) {
                                iL3 *= 2;
                            }
                            i10 = iL3;
                        } else {
                            i10 = iL3;
                            f10 = 1.0f;
                        }
                        String strD = d5.a.d(i22, i23, i24, i27, zH, iArr);
                        s0 s0Var = new s0();
                        s0Var.f8123a = str;
                        s0Var.f8135o = "video/hevc";
                        s0Var.h = strD;
                        s0Var.f8140t = iL2;
                        s0Var.f8141u = i10;
                        s0Var.f8143x = f10;
                        s0Var.f8137q = Collections.singletonList(bArr2);
                        wVar.c(new t0(s0Var));
                        this.f49166e = true;
                    }
                }
                g0 g0Var5 = this.f49170j;
                boolean zE = g0Var5.e(i18);
                d5.z zVar2 = this.f49174n;
                if (zE) {
                    zVar2.A(d5.a.J(g0Var5.f5674e, (byte[]) g0Var5.f5675f), (byte[]) g0Var5.f5675f);
                    zVar2.D(5);
                    h7.p.a(j11, zVar2, wVarArr);
                }
                g0 g0Var6 = this.f49171k;
                if (g0Var6.e(i18)) {
                    zVar2.A(d5.a.J(g0Var6.f5674e, (byte[]) g0Var6.f5675f), (byte[]) g0Var6.f5675f);
                    zVar2.D(5);
                    h7.p.a(j11, zVar2, wVarArr);
                }
                long j14 = this.f49173m;
                q qVar2 = this.d;
                boolean z14 = this.f49166e;
                qVar2.f49157g = false;
                qVar2.h = false;
                qVar2.f49155e = j14;
                qVar2.d = 0;
                qVar2.f49153b = j10;
                if (i15 < 32 || i15 == 40) {
                    g0Var = g0Var2;
                    z10 = false;
                } else {
                    if (!qVar2.f49158i || qVar2.f49159j) {
                        g0Var = g0Var2;
                        z10 = false;
                    } else {
                        if (z14) {
                            long j15 = qVar2.f49161l;
                            if (j15 == -9223372036854775807L) {
                                g0Var = g0Var2;
                            } else {
                                g0Var = g0Var2;
                                qVar2.f49152a.e(j15, qVar2.f49162m ? 1 : 0, (int) (j10 - qVar2.f49160k), i17, null);
                            }
                        } else {
                            g0Var = g0Var2;
                        }
                        z10 = false;
                        qVar2.f49158i = false;
                    }
                    if ((32 <= i15 && i15 <= 35) || i15 == 39) {
                        qVar2.h = !qVar2.f49159j;
                        qVar2.f49159j = true;
                    }
                    if (i15 >= 16 || i15 > 21) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    qVar2.f49154c = z11;
                    if (z11 || i15 <= 9) {
                        z10 = true;
                    }
                    qVar2.f49156f = z10;
                    if (!this.f49166e) {
                        g0Var.g(i15);
                        g0Var3.g(i15);
                        g0Var4.g(i15);
                    }
                    g0Var5.g(i15);
                    g0Var6.g(i15);
                    i13 = i13;
                    bArr = bArr;
                    i12 = i14;
                }
                if (i15 >= 16) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                qVar2.f49154c = z11;
                if (z11) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                qVar2.f49156f = z10;
                if (!this.f49166e) {
                    g0Var.g(i15);
                    g0Var3.g(i15);
                    g0Var4.g(i15);
                }
                g0Var5.g(i15);
                g0Var6.g(i15);
                i13 = i13;
                bArr = bArr;
                i12 = i14;
            }
        }
    }

    @Override
    public final void c() {
        this.f49172l = 0L;
        this.f49173m = -9223372036854775807L;
        d5.a.m(this.f49167f);
        this.f49168g.f();
        this.h.f();
        this.f49169i.f();
        this.f49170j.f();
        this.f49171k.f();
        q qVar = this.d;
        if (qVar != null) {
            qVar.f49156f = false;
            qVar.f49157g = false;
            qVar.h = false;
            qVar.f49158i = false;
            qVar.f49159j = false;
        }
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49164b = e0Var.f49053e;
        e0Var.b();
        m3.w wVarC = mVar.C(e0Var.d, 2);
        this.f49165c = wVarC;
        this.d = new q(wVarC);
        this.f49163a.b(mVar, e0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49173m = j10;
        }
    }

    @Override
    public final void d() {
    }
}
