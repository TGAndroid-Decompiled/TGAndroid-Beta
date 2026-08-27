package w3;

import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Collections;

public final class s implements h {

    public final String f49175a;

    public final d5.z f49176b;

    public final d5.y f49177c;
    public m3.w d;

    public String f49178e;

    public t0 f49179f;

    public int f49180g;
    public int h;

    public int f49181i;

    public int f49182j;

    public long f49183k;

    public boolean f49184l;

    public int f49185m;

    public int f49186n;

    public int f49187o;

    public boolean f49188p;

    public long f49189q;

    public int f49190r;

    public long f49191s;

    public int f49192t;

    public String f49193u;

    public s(String str) {
        this.f49175a = str;
        d5.z zVar = new d5.z(1024);
        this.f49176b = zVar;
        byte[] bArr = zVar.f4858a;
        this.f49177c = new d5.y(bArr, bArr.length);
        this.f49183k = -9223372036854775807L;
    }

    @Override
    public final void b(d5.z zVar) throws t1 {
        int i10;
        boolean zH;
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i11 = this.f49180g;
            if (i11 != 0) {
                if (i11 != 1) {
                    d5.z zVar2 = this.f49176b;
                    d5.y yVar = this.f49177c;
                    if (i11 == 2) {
                        int iR = ((this.f49182j & (-225)) << 8) | zVar.r();
                        this.f49181i = iR;
                        if (iR > zVar2.f4858a.length) {
                            zVar2.z(iR);
                            byte[] bArr = zVar2.f4858a;
                            yVar.getClass();
                            yVar.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.f49180g = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(zVar.a(), this.f49181i - this.h);
                        zVar.c(this.h, iMin, yVar.f4853b);
                        int i12 = this.h + iMin;
                        this.h = i12;
                        if (i12 == this.f49181i) {
                            yVar.p(0);
                            if (yVar.h()) {
                                if (this.f49184l) {
                                }
                                this.f49180g = 0;
                            } else {
                                this.f49184l = true;
                                int i13 = yVar.i(1);
                                int i14 = i13 == 1 ? yVar.i(1) : 0;
                                this.f49185m = i14;
                                if (i14 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 1) {
                                    yVar.i((yVar.i(2) + 1) * 8);
                                }
                                if (!yVar.h()) {
                                    throw t1.a(null, null);
                                }
                                this.f49186n = yVar.i(6);
                                int i15 = yVar.i(4);
                                int i16 = yVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 0) {
                                    int iG = yVar.g();
                                    int iB = yVar.b();
                                    j3.a aVarH = j3.b.h(yVar, true);
                                    this.f49193u = aVarH.f12303c;
                                    this.f49190r = aVarH.f12301a;
                                    this.f49192t = aVarH.f12302b;
                                    int iB2 = iB - yVar.b();
                                    yVar.p(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    yVar.j(iB2, bArr2);
                                    s0 s0Var = new s0();
                                    s0Var.f8123a = this.f49178e;
                                    s0Var.f8135o = "audio/mp4a-latm";
                                    s0Var.h = this.f49193u;
                                    s0Var.B = this.f49192t;
                                    s0Var.C = this.f49190r;
                                    s0Var.f8137q = Collections.singletonList(bArr2);
                                    s0Var.f8125c = this.f49175a;
                                    t0 t0Var = new t0(s0Var);
                                    if (!t0Var.equals(this.f49179f)) {
                                        this.f49179f = t0Var;
                                        this.f49191s = 1024000000 / ((long) t0Var.P);
                                        this.d.c(t0Var);
                                    }
                                } else {
                                    int i17 = yVar.i((yVar.i(2) + 1) * 8);
                                    int iB3 = yVar.b();
                                    j3.a aVarH2 = j3.b.h(yVar, true);
                                    this.f49193u = aVarH2.f12303c;
                                    this.f49190r = aVarH2.f12301a;
                                    this.f49192t = aVarH2.f12302b;
                                    yVar.s(i17 - (iB3 - yVar.b()));
                                }
                                int i18 = yVar.i(3);
                                this.f49187o = i18;
                                if (i18 == 0) {
                                    yVar.s(8);
                                } else if (i18 == 1) {
                                    yVar.s(9);
                                } else if (i18 == 3 || i18 == 4 || i18 == 5) {
                                    yVar.s(6);
                                } else {
                                    if (i18 != 6 && i18 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    yVar.s(1);
                                }
                                boolean zH2 = yVar.h();
                                this.f49188p = zH2;
                                this.f49189q = 0L;
                                if (zH2) {
                                    if (i13 == 1) {
                                        this.f49189q = yVar.i((yVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = yVar.h();
                                            this.f49189q = (this.f49189q << 8) + ((long) yVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (yVar.h()) {
                                    yVar.s(8);
                                }
                            }
                            if (this.f49185m != 0) {
                                throw t1.a(null, null);
                            }
                            if (this.f49186n != 0) {
                                throw t1.a(null, null);
                            }
                            if (this.f49187o != 0) {
                                throw t1.a(null, null);
                            }
                            int i19 = 0;
                            do {
                                i10 = yVar.i(8);
                                i19 += i10;
                            } while (i10 == 255);
                            int iG2 = yVar.g();
                            if ((iG2 & 7) == 0) {
                                zVar2.C(iG2 >> 3);
                            } else {
                                yVar.j(i19 * 8, zVar2.f4858a);
                                zVar2.C(0);
                            }
                            this.d.a(i19, zVar2);
                            long j10 = this.f49183k;
                            if (j10 != -9223372036854775807L) {
                                this.d.e(j10, 1, i19, 0, null);
                                this.f49183k += this.f49191s;
                            }
                            if (this.f49188p) {
                                yVar.s((int) this.f49189q);
                            }
                            this.f49180g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iR2 = zVar.r();
                    if ((iR2 & 224) == 224) {
                        this.f49182j = iR2;
                        this.f49180g = 2;
                    } else if (iR2 != 86) {
                        this.f49180g = 0;
                    }
                }
            } else if (zVar.r() == 86) {
                this.f49180g = 1;
            }
        }
    }

    @Override
    public final void c() {
        this.f49180g = 0;
        this.f49183k = -9223372036854775807L;
        this.f49184l = false;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
        e0Var.b();
        this.f49178e = e0Var.f49053e;
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49183k = j10;
        }
    }

    @Override
    public final void d() {
    }
}
