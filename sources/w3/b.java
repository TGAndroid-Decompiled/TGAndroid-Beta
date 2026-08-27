package w3;

import d5.g0;
import h3.s0;
import h3.t0;

public final class b implements h {

    public final int f48986a;

    public final d5.y f48987b;

    public final d5.z f48988c;
    public final String d;

    public String f48989e;

    public m3.w f48990f;

    public int f48991g;
    public int h;

    public boolean f48992i;

    public long f48993j;

    public t0 f48994k;

    public int f48995l;

    public long f48996m;

    public b(String str, int i10) {
        this.f48986a = i10;
        switch (i10) {
            case 1:
                d5.y yVar = new d5.y(new byte[16], 16);
                this.f48987b = yVar;
                this.f48988c = new d5.z(yVar.f4853b);
                this.f48991g = 0;
                this.h = 0;
                this.f48992i = false;
                this.f48996m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                d5.y yVar2 = new d5.y(new byte[128], 128);
                this.f48987b = yVar2;
                this.f48988c = new d5.z(yVar2.f4853b);
                this.f48991g = 0;
                this.f48996m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    @Override
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        switch (this.f48986a) {
            case 0:
                d5.a.j(this.f48990f);
                while (zVar.a() > 0) {
                    int i27 = this.f48991g;
                    d5.z zVar2 = this.f48988c;
                    if (i27 == 0) {
                        while (zVar.a() > 0) {
                            if (this.f48992i) {
                                int iR = zVar.r();
                                if (iR == 119) {
                                    this.f48992i = false;
                                    this.f48991g = 1;
                                    byte[] bArr = zVar2.f4858a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.h = 2;
                                }
                                this.f48992i = iR == 11;
                            } else {
                                this.f48992i = zVar.r() == 11;
                            }
                            break;
                        }
                    } else if (i27 == 1) {
                        byte[] bArr2 = zVar2.f4858a;
                        int iMin = Math.min(zVar.a(), 128 - this.h);
                        zVar.c(this.h, iMin, bArr2);
                        int i28 = this.h + iMin;
                        this.h = i28;
                        if (i28 == 128) {
                            d5.y yVar = this.f48987b;
                            yVar.p(0);
                            int[] iArr = j3.b.f12308f;
                            int[] iArr2 = j3.b.d;
                            int iG = yVar.g();
                            yVar.s(40);
                            boolean z10 = yVar.i(5) > 10;
                            yVar.p(iG);
                            if (z10) {
                                yVar.s(16);
                                int i29 = yVar.i(2);
                                if (i29 == 0) {
                                    b10 = 0;
                                } else if (i29 != 1) {
                                    b10 = i29 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b10 = 1;
                                }
                                yVar.s(3);
                                i12 = (yVar.i(11) + 1) * 2;
                                int i30 = yVar.i(2);
                                if (i30 == 3) {
                                    i14 = j3.b.f12307e[yVar.i(2)];
                                    i17 = 6;
                                    i16 = 3;
                                } else {
                                    int i31 = yVar.i(2);
                                    int i32 = j3.b.f12306c[i31];
                                    i14 = iArr2[i30];
                                    i16 = i31;
                                    i17 = i32;
                                }
                                i15 = i17 * 256;
                                int i33 = (i12 * i14) / (i17 * 32);
                                int i34 = yVar.i(3);
                                boolean zH = yVar.h();
                                i11 = iArr[i34] + (zH ? 1 : 0);
                                yVar.s(10);
                                if (yVar.h()) {
                                    yVar.s(8);
                                }
                                if (i34 == 0) {
                                    yVar.s(5);
                                    if (yVar.h()) {
                                        yVar.s(8);
                                    }
                                }
                                if (b10 == 1 && yVar.h()) {
                                    yVar.s(16);
                                }
                                if (yVar.h()) {
                                    if (i34 > 2) {
                                        yVar.s(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        yVar.s(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        yVar.s(i22);
                                    }
                                    if (zH && yVar.h()) {
                                        yVar.s(5);
                                    }
                                    if (b10 != 0) {
                                        i18 = i16;
                                    } else {
                                        if (yVar.h()) {
                                            i23 = 6;
                                            yVar.s(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i34 == 0 && yVar.h()) {
                                            yVar.s(i23);
                                        }
                                        if (yVar.h()) {
                                            yVar.s(i23);
                                        }
                                        int i35 = yVar.i(2);
                                        if (i35 == 1) {
                                            yVar.s(5);
                                        } else if (i35 == 2) {
                                            yVar.s(12);
                                        } else {
                                            if (i35 == 3) {
                                                int i36 = yVar.i(5);
                                                if (yVar.h()) {
                                                    yVar.s(5);
                                                    if (yVar.h()) {
                                                        i25 = 4;
                                                        yVar.s(4);
                                                    } else {
                                                        i25 = 4;
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        if (yVar.h()) {
                                                            yVar.s(i25);
                                                        }
                                                        if (yVar.h()) {
                                                            yVar.s(i25);
                                                        }
                                                    }
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(5);
                                                    if (yVar.h()) {
                                                        yVar.s(7);
                                                        if (yVar.h()) {
                                                            yVar.s(8);
                                                        }
                                                    }
                                                }
                                                i24 = 2;
                                                yVar.s((i36 + 2) * 8);
                                                yVar.c();
                                            }
                                            if (i34 < i24) {
                                                if (yVar.h()) {
                                                    yVar.s(14);
                                                }
                                                if (i34 == 0 && yVar.h()) {
                                                    yVar.s(14);
                                                }
                                            }
                                            if (yVar.h()) {
                                                i18 = i16;
                                                if (i18 == 0) {
                                                    yVar.s(5);
                                                } else {
                                                    for (i26 = 0; i26 < i17; i26++) {
                                                        if (yVar.h()) {
                                                            yVar.s(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i18 = i16;
                                            }
                                        }
                                        i24 = 2;
                                        if (i34 < i24) {
                                            if (yVar.h()) {
                                                yVar.s(14);
                                            }
                                            if (i34 == 0) {
                                                yVar.s(14);
                                            }
                                        }
                                        if (yVar.h()) {
                                            i18 = i16;
                                            if (i18 == 0) {
                                                yVar.s(5);
                                            } else {
                                                while (i26 < i17) {
                                                    if (yVar.h()) {
                                                        yVar.s(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i18 = i16;
                                        }
                                    }
                                } else {
                                    i18 = i16;
                                }
                                if (yVar.h()) {
                                    yVar.s(5);
                                    if (i34 == 2) {
                                        yVar.s(4);
                                    }
                                    if (i34 >= 6) {
                                        yVar.s(2);
                                    }
                                    if (yVar.h()) {
                                        i21 = 8;
                                        yVar.s(8);
                                    } else {
                                        i21 = 8;
                                    }
                                    if (i34 == 0 && yVar.h()) {
                                        yVar.s(i21);
                                    }
                                    i19 = 3;
                                    if (i30 < 3) {
                                        yVar.r();
                                    }
                                } else {
                                    i19 = 3;
                                }
                                if (b10 == 0 && i18 != i19) {
                                    yVar.r();
                                }
                                if (b10 == 2 && (i18 == i19 || yVar.h())) {
                                    i20 = 6;
                                    yVar.s(6);
                                } else {
                                    i20 = 6;
                                }
                                str = (yVar.h() && yVar.i(i20) == 1 && yVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i13 = i33;
                            } else {
                                yVar.s(32);
                                int i37 = yVar.i(2);
                                String str2 = i37 == 3 ? null : "audio/ac3";
                                int i38 = yVar.i(6);
                                int i39 = j3.b.f12309g[i38 / 2] * 1000;
                                int iB = j3.b.b(i37, i38);
                                yVar.s(8);
                                int i40 = yVar.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    yVar.s(2);
                                }
                                if ((i40 & 4) != 0) {
                                    yVar.s(i10);
                                }
                                if (i40 == i10) {
                                    yVar.s(i10);
                                }
                                int i41 = i37 < 3 ? iArr2[i37] : -1;
                                i11 = iArr[i40] + (yVar.h() ? 1 : 0);
                                str = str2;
                                i12 = iB;
                                i13 = i39;
                                i14 = i41;
                                i15 = 1536;
                            }
                            t0 t0Var = this.f48994k;
                            if (t0Var == null || i11 != t0Var.O || i14 != t0Var.P || !g0.a(str, t0Var.B)) {
                                s0 s0Var = new s0();
                                s0Var.f8123a = this.f48989e;
                                s0Var.f8135o = str;
                                s0Var.B = i11;
                                s0Var.C = i14;
                                s0Var.f8125c = this.d;
                                s0Var.f8128g = i13;
                                if ("audio/ac3".equals(str)) {
                                    s0Var.f8127f = i13;
                                }
                                t0 t0Var2 = new t0(s0Var);
                                this.f48994k = t0Var2;
                                this.f48990f.c(t0Var2);
                            }
                            this.f48995l = i12;
                            this.f48993j = (((long) i15) * 1000000) / ((long) this.f48994k.P);
                            zVar2.C(0);
                            this.f48990f.a(128, zVar2);
                            this.f48991g = 2;
                        }
                    } else if (i27 == 2) {
                        int iMin2 = Math.min(zVar.a(), this.f48995l - this.h);
                        this.f48990f.a(iMin2, zVar);
                        int i42 = this.h + iMin2;
                        this.h = i42;
                        int i43 = this.f48995l;
                        if (i42 == i43) {
                            long j10 = this.f48996m;
                            if (j10 != -9223372036854775807L) {
                                this.f48990f.e(j10, 1, i43, 0, null);
                                this.f48996m += this.f48993j;
                            }
                            this.f48991g = 0;
                        }
                    }
                }
                break;
            default:
                d5.a.j(this.f48990f);
                while (zVar.a() > 0) {
                    int i44 = this.f48991g;
                    d5.z zVar3 = this.f48988c;
                    if (i44 == 0) {
                        while (zVar.a() > 0) {
                            if (this.f48992i) {
                                int iR2 = zVar.r();
                                this.f48992i = iR2 == 172;
                                if (iR2 == 64 || iR2 == 65) {
                                    boolean z11 = iR2 == 65;
                                    this.f48991g = 1;
                                    byte[] bArr3 = zVar3.f4858a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z11 ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.f48992i = zVar.r() == 172;
                            }
                            break;
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = zVar3.f4858a;
                        int iMin3 = Math.min(zVar.a(), 16 - this.h);
                        zVar.c(this.h, iMin3, bArr4);
                        int i45 = this.h + iMin3;
                        this.h = i45;
                        if (i45 == 16) {
                            d5.y yVar2 = this.f48987b;
                            yVar2.p(0);
                            b8.b bVarG = j3.b.g(yVar2);
                            int i46 = bVarG.f2041a;
                            t0 t0Var3 = this.f48994k;
                            if (t0Var3 == null || 2 != t0Var3.O || i46 != t0Var3.P || !"audio/ac4".equals(t0Var3.B)) {
                                s0 s0Var2 = new s0();
                                s0Var2.f8123a = this.f48989e;
                                s0Var2.f8135o = "audio/ac4";
                                s0Var2.B = 2;
                                s0Var2.C = i46;
                                s0Var2.f8125c = this.d;
                                t0 t0Var4 = new t0(s0Var2);
                                this.f48994k = t0Var4;
                                this.f48990f.c(t0Var4);
                            }
                            this.f48995l = bVarG.f2042b;
                            this.f48993j = (((long) bVarG.f2043c) * 1000000) / ((long) this.f48994k.P);
                            zVar3.C(0);
                            this.f48990f.a(16, zVar3);
                            this.f48991g = 2;
                        }
                    } else if (i44 == 2) {
                        int iMin4 = Math.min(zVar.a(), this.f48995l - this.h);
                        this.f48990f.a(iMin4, zVar);
                        int i47 = this.h + iMin4;
                        this.h = i47;
                        int i48 = this.f48995l;
                        if (i47 == i48) {
                            long j11 = this.f48996m;
                            if (j11 != -9223372036854775807L) {
                                this.f48990f.e(j11, 1, i48, 0, null);
                                this.f48996m += this.f48993j;
                            }
                            this.f48991g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void c() {
        switch (this.f48986a) {
            case 0:
                this.f48991g = 0;
                this.h = 0;
                this.f48992i = false;
                this.f48996m = -9223372036854775807L;
                break;
            default:
                this.f48991g = 0;
                this.h = 0;
                this.f48992i = false;
                this.f48996m = -9223372036854775807L;
                break;
        }
    }

    @Override
    public final void d() {
        int i10 = this.f48986a;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        switch (this.f48986a) {
            case 0:
                e0Var.a();
                e0Var.b();
                this.f48989e = e0Var.f49053e;
                e0Var.b();
                this.f48990f = mVar.C(e0Var.d, 1);
                break;
            default:
                e0Var.a();
                e0Var.b();
                this.f48989e = e0Var.f49053e;
                e0Var.b();
                this.f48990f = mVar.C(e0Var.d, 1);
                break;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f48986a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.f48996m = j10;
                }
                break;
            default:
                if (j10 != -9223372036854775807L) {
                    this.f48996m = j10;
                }
                break;
        }
    }

    private final void a() {
    }

    private final void g() {
    }
}
