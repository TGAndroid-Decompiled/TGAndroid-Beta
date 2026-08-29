package y3;

import j3.s0;
import j3.t0;
import java.util.Collections;
import java.util.List;
public final class g implements h {
    public final int f50290a;
    public boolean f50291b;
    public long f50292c;
    public int d;
    public int f50293e;
    public final Object f50294f;
    public Object f50295g;

    public g(List list) {
        this.f50290a = 0;
        this.f50294f = list;
        this.f50295g = new o3.w[list.size()];
        this.f50292c = -9223372036854775807L;
    }

    @Override
    public final void a() {
        switch (this.f50290a) {
            case 0:
                this.f50291b = false;
                this.f50292c = -9223372036854775807L;
                return;
            default:
                this.f50291b = false;
                this.f50292c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(f5.w wVar) {
        o3.w[] wVarArr;
        boolean z10;
        boolean z11;
        switch (this.f50290a) {
            case 0:
                if (this.f50291b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (wVar.r() != 32) {
                                this.f50291b = false;
                            }
                            this.d--;
                            z11 = this.f50291b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (wVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (wVar.r() != 0) {
                                this.f50291b = false;
                            }
                            this.d--;
                            z10 = this.f50291b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = wVar.f6641b;
                    int a2 = wVar.a();
                    for (o3.w wVar2 : (o3.w[]) this.f50295g) {
                        wVar.C(i10);
                        wVar2.e(a2, wVar);
                    }
                    this.f50293e += a2;
                    return;
                }
                return;
            default:
                f5.w wVar3 = (f5.w) this.f50294f;
                f5.a.j((o3.w) this.f50295g);
                if (this.f50291b) {
                    int a10 = wVar.a();
                    int i11 = this.f50293e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(wVar.f6640a, wVar.f6641b, wVar3.f6640a, this.f50293e, min);
                        if (this.f50293e + min == 10) {
                            wVar3.C(0);
                            if (73 == wVar3.r() && 68 == wVar3.r() && 51 == wVar3.r()) {
                                wVar3.D(3);
                                this.d = wVar3.q() + 10;
                            } else {
                                f5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f50291b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.f50293e);
                    ((o3.w) this.f50295g).e(min2, wVar);
                    this.f50293e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        int i10;
        switch (this.f50290a) {
            case 0:
                if (this.f50291b) {
                    if (this.f50292c != -9223372036854775807L) {
                        for (o3.w wVar : (o3.w[]) this.f50295g) {
                            wVar.c(this.f50292c, 1, this.f50293e, 0, null);
                        }
                    }
                    this.f50291b = false;
                    return;
                }
                return;
            default:
                f5.a.j((o3.w) this.f50295g);
                if (this.f50291b && (i10 = this.d) != 0 && this.f50293e == i10) {
                    long j10 = this.f50292c;
                    if (j10 != -9223372036854775807L) {
                        ((o3.w) this.f50295g).c(j10, 1, i10, 0, null);
                    }
                    this.f50291b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        switch (this.f50290a) {
            case 0:
                o3.w[] wVarArr = (o3.w[]) this.f50295g;
                for (int i10 = 0; i10 < wVarArr.length; i10++) {
                    c0 c0Var = (c0) ((List) this.f50294f).get(i10);
                    d0Var.a();
                    d0Var.b();
                    o3.w Z1 = mVar.Z1(d0Var.d, 3);
                    s0 s0Var = new s0();
                    d0Var.b();
                    s0Var.f10730a = d0Var.f50261e;
                    s0Var.f10742o = "application/dvbsubs";
                    s0Var.f10744q = Collections.singletonList(c0Var.f50247b);
                    s0Var.f10732c = c0Var.f50246a;
                    Z1.b(new t0(s0Var));
                    wVarArr[i10] = Z1;
                }
                return;
            default:
                d0Var.a();
                d0Var.b();
                o3.w Z12 = mVar.Z1(d0Var.d, 5);
                this.f50295g = Z12;
                s0 s0Var2 = new s0();
                d0Var.b();
                s0Var2.f10730a = d0Var.f50261e;
                s0Var2.f10742o = "application/id3";
                Z12.b(new t0(s0Var2));
                return;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f50290a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f50291b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f50292c = j10;
                    }
                    this.f50293e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f50291b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f50292c = j10;
                    }
                    this.d = 0;
                    this.f50293e = 0;
                    return;
                }
                return;
        }
    }

    public g() {
        this.f50290a = 1;
        this.f50294f = new f5.w(10);
        this.f50292c = -9223372036854775807L;
    }
}
