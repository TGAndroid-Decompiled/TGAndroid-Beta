package w3;

import d5.g0;
import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Arrays;
import java.util.Collections;

public final class e implements h {
    public static final byte[] v = {73, 68, 51};

    public final boolean f49031a;
    public final String d;

    public String f49034e;

    public m3.w f49035f;

    public m3.w f49036g;

    public boolean f49039k;

    public boolean f49040l;

    public int f49043o;

    public boolean f49044p;

    public int f49046r;

    public m3.w f49048t;

    public long f49049u;

    public final d5.y f49032b = new d5.y(new byte[7], 7);

    public final d5.z f49033c = new d5.z(Arrays.copyOf(v, 10));
    public int h = 0;

    public int f49037i = 0;

    public int f49038j = 256;

    public int f49041m = -1;

    public int f49042n = -1;

    public long f49045q = -9223372036854775807L;

    public long f49047s = -9223372036854775807L;

    public e(String str, boolean z10) {
        this.f49031a = z10;
        this.d = str;
    }

    @Override
    public final void b(d5.z zVar) throws t1 {
        int i10;
        int i11;
        int i12;
        this.f49035f.getClass();
        int i13 = g0.f4795a;
        while (zVar.a() > 0) {
            int i14 = this.h;
            d5.z zVar2 = this.f49033c;
            int i15 = 0;
            d5.y yVar = this.f49032b;
            int i16 = 4;
            int i17 = 1;
            if (i14 == 0) {
                byte[] bArr = zVar.f4858a;
                int i18 = zVar.f4859b;
                int i19 = zVar.f4860c;
                while (true) {
                    if (i18 < i19) {
                        int i20 = i18 + 1;
                        byte b10 = bArr[i18];
                        int i21 = b10 & 255;
                        if (this.f49038j == 512 && ((65280 | (((byte) i21) & 255)) & 65526) == 65520) {
                            if (!this.f49040l) {
                                int i22 = i18 - 1;
                                zVar.C(i18);
                                byte[] bArr2 = yVar.f4853b;
                                if (zVar.a() >= i17) {
                                    zVar.c(i15, i17, bArr2);
                                    yVar.p(i16);
                                    int i23 = yVar.i(i17);
                                    int i24 = this.f49041m;
                                    if (i24 == -1 || i23 == i24) {
                                        if (this.f49042n != -1) {
                                            byte[] bArr3 = yVar.f4853b;
                                            if (zVar.a() >= i17) {
                                                zVar.c(i15, i17, bArr3);
                                                yVar.p(2);
                                                i10 = 4;
                                                if (yVar.i(4) == this.f49042n) {
                                                    zVar.C(i20);
                                                }
                                            }
                                        } else {
                                            i10 = 4;
                                        }
                                        byte[] bArr4 = yVar.f4853b;
                                        if (zVar.a() >= i10) {
                                            zVar.c(i15, i10, bArr4);
                                            yVar.p(14);
                                            int i25 = yVar.i(13);
                                            if (i25 >= 7) {
                                                byte[] bArr5 = zVar.f4858a;
                                                int i26 = zVar.f4860c;
                                                int i27 = i22 + i25;
                                                if (i27 < i26) {
                                                    byte b11 = bArr5[i27];
                                                    if (b11 == -1) {
                                                        int i28 = i27 + 1;
                                                        if (i28 != i26) {
                                                            byte b12 = bArr5[i28];
                                                            if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i23) {
                                                            }
                                                        }
                                                    } else if (b11 == 73 && ((i11 = i27 + 1) == i26 || (bArr5[i11] == 68 && ((i12 = i27 + 2) == i26 || bArr5[i12] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.f49043o = (b10 & 8) >> 3;
                            this.f49039k = (b10 & 1) == 0;
                            if (this.f49040l) {
                                this.h = 3;
                                this.f49037i = 0;
                            } else {
                                this.h = 1;
                                this.f49037i = 0;
                            }
                            zVar.C(i20);
                        }
                        int i29 = this.f49038j;
                        int i30 = i21 | i29;
                        if (i30 == 329) {
                            this.f49038j = 768;
                        } else if (i30 == 511) {
                            this.f49038j = 512;
                        } else if (i30 == 836) {
                            this.f49038j = 1024;
                        } else if (i30 != 1075) {
                            if (i29 != 256) {
                                this.f49038j = 256;
                            }
                            i15 = 0;
                            i16 = 4;
                            i17 = 1;
                        } else {
                            this.h = 2;
                            this.f49037i = 3;
                            this.f49046r = 0;
                            zVar2.C(0);
                            zVar.C(i20);
                        }
                        i18 = i20;
                        i15 = 0;
                        i16 = 4;
                        i17 = 1;
                    } else {
                        zVar.C(i18);
                    }
                }
            } else if (i14 != 1) {
                if (i14 == 2) {
                    byte[] bArr6 = zVar2.f4858a;
                    int iMin = Math.min(zVar.a(), 10 - this.f49037i);
                    zVar.c(this.f49037i, iMin, bArr6);
                    int i31 = this.f49037i + iMin;
                    this.f49037i = i31;
                    if (i31 == 10) {
                        this.f49036g.a(10, zVar2);
                        zVar2.C(6);
                        m3.w wVar = this.f49036g;
                        int iQ = zVar2.q() + 10;
                        this.h = 4;
                        this.f49037i = 10;
                        this.f49048t = wVar;
                        this.f49049u = 0L;
                        this.f49046r = iQ;
                    }
                } else if (i14 == 3) {
                    int i32 = this.f49039k ? 7 : 5;
                    byte[] bArr7 = yVar.f4853b;
                    int iMin2 = Math.min(zVar.a(), i32 - this.f49037i);
                    zVar.c(this.f49037i, iMin2, bArr7);
                    int i33 = this.f49037i + iMin2;
                    this.f49037i = i33;
                    if (i33 == i32) {
                        yVar.p(0);
                        if (this.f49044p) {
                            yVar.s(10);
                        } else {
                            int i34 = yVar.i(2) + 1;
                            if (i34 != 2) {
                                d5.a.K("AdtsReader", "Detected audio object type: " + i34 + ", but assuming AAC LC.");
                                i34 = 2;
                            }
                            yVar.s(5);
                            int i35 = yVar.i(3);
                            int i36 = this.f49042n;
                            byte[] bArr8 = {(byte) (((i34 << 3) & 248) | ((i36 >> 1) & 7)), (byte) (((i35 << 3) & 120) | ((i36 << 7) & 128))};
                            j3.a aVarH = j3.b.h(new d5.y(bArr8, 2), false);
                            s0 s0Var = new s0();
                            s0Var.f8123a = this.f49034e;
                            s0Var.f8135o = "audio/mp4a-latm";
                            s0Var.h = aVarH.f12303c;
                            s0Var.B = aVarH.f12302b;
                            s0Var.C = aVarH.f12301a;
                            s0Var.f8137q = Collections.singletonList(bArr8);
                            s0Var.f8125c = this.d;
                            t0 t0Var = new t0(s0Var);
                            this.f49045q = 1024000000 / ((long) t0Var.P);
                            this.f49035f.c(t0Var);
                            this.f49044p = true;
                        }
                        yVar.s(4);
                        int i37 = yVar.i(13);
                        int i38 = i37 - 7;
                        if (this.f49039k) {
                            i38 = i37 - 9;
                        }
                        m3.w wVar2 = this.f49035f;
                        long j10 = this.f49045q;
                        this.h = 4;
                        this.f49037i = 0;
                        this.f49048t = wVar2;
                        this.f49049u = j10;
                        this.f49046r = i38;
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(zVar.a(), this.f49046r - this.f49037i);
                    this.f49048t.a(iMin3, zVar);
                    int i39 = this.f49037i + iMin3;
                    this.f49037i = i39;
                    int i40 = this.f49046r;
                    if (i39 == i40) {
                        long j11 = this.f49047s;
                        if (j11 != -9223372036854775807L) {
                            this.f49048t.e(j11, 1, i40, 0, null);
                            this.f49047s += this.f49049u;
                        }
                        this.h = 0;
                        this.f49037i = 0;
                        this.f49038j = 256;
                    }
                }
            } else if (zVar.a() != 0) {
                yVar.f4853b[0] = zVar.f4858a[zVar.f4859b];
                yVar.p(2);
                int i41 = yVar.i(4);
                int i42 = this.f49042n;
                if (i42 == -1 || i41 == i42) {
                    if (!this.f49040l) {
                        this.f49040l = true;
                        this.f49041m = this.f49043o;
                        this.f49042n = i41;
                    }
                    this.h = 3;
                    this.f49037i = 0;
                } else {
                    this.f49040l = false;
                    this.h = 0;
                    this.f49037i = 0;
                    this.f49038j = 256;
                }
            }
        }
    }

    @Override
    public final void c() {
        this.f49047s = -9223372036854775807L;
        this.f49040l = false;
        this.h = 0;
        this.f49037i = 0;
        this.f49038j = 256;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49034e = e0Var.f49053e;
        e0Var.b();
        m3.w wVarC = mVar.C(e0Var.d, 1);
        this.f49035f = wVarC;
        this.f49048t = wVarC;
        if (!this.f49031a) {
            this.f49036g = new m3.j();
            return;
        }
        e0Var.a();
        e0Var.b();
        m3.w wVarC2 = mVar.C(e0Var.d, 5);
        this.f49036g = wVarC2;
        s0 s0Var = new s0();
        e0Var.b();
        s0Var.f8123a = e0Var.f49053e;
        s0Var.f8135o = "application/id3";
        wVarC2.c(new t0(s0Var));
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49047s = j10;
        }
    }

    @Override
    public final void d() {
    }
}
