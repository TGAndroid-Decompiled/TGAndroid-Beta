package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class r41 extends v4.o {
    public int f49227b;
    public final i41 f49228c;
    public final v4.b0 d;
    public final SparseIntArray f49229e = new SparseIntArray();
    public int f49230f = -1;
    public int f49231g = -1;
    public int h = -1;
    public int f49232i = -1;
    public int f49233j = -1;
    public int f49234k = -1;
    public int f49235l = -1;
    public int f49236m = -1;
    public int f49237n = -1;
    public int f49238o = -1;
    public int f49239p = -1;
    public int f49240q = -1;
    public int f49241r = -1;
    public int f49242s = -1;
    public int f49243t = -1;
    public int f49244u = -1;
    public int v = -1;
    public int f49245w = -1;
    public int f49246x = -1;
    public int f49247y = -1;

    public r41(i41 i41Var, v4.b0 b0Var) {
        this.f49228c = i41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f49229e.get(i7) == this.f49228c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f49229e;
        int i11 = sparseIntArray.get(i7);
        i41 i41Var = this.f49228c;
        if (i11 == 13 && i41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && i41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f49246x;
        if (i7 >= i12 && i7 <= this.f49247y) {
            if (i7 - i12 == i10 - i41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f49230f && i10 == i41Var.f46489e) {
            return true;
        } else {
            if (i7 == this.f49231g && i10 == i41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == i41Var.f46492r) {
                return true;
            }
            if (i7 == this.f49232i && i10 == i41Var.f46493s) {
                return true;
            }
            if (i7 == this.f49233j && i10 == i41Var.f46494w) {
                return true;
            }
            if (i7 == this.f49234k && i10 == i41Var.f46495x) {
                return true;
            }
            if (i7 == this.f49235l && i10 == i41Var.f46496y) {
                return true;
            }
            if (i7 == this.f49236m && i10 == i41Var.f46491n) {
                return true;
            }
            if (i7 == this.f49237n && i10 == i41Var.D) {
                return true;
            }
            if (i7 == this.f49241r && i10 == i41Var.K) {
                return true;
            }
            if (i7 == this.f49242s && i10 == i41Var.L) {
                return true;
            }
            if (i7 == this.f49243t && i10 == i41Var.M) {
                return true;
            }
            if (i7 == this.f49244u && i10 == i41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == i41Var.O) {
                return true;
            }
            if (i7 == this.f49245w && i10 == i41Var.P) {
                return true;
            }
            if (i7 == this.f49238o && i10 == i41Var.E) {
                return true;
            }
            if (i7 == this.f49239p && i10 == i41Var.F) {
                return true;
            }
            if (i7 == this.f49240q && i10 == i41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f49228c.f46487c0;
    }

    @Override
    public final int e() {
        return this.f49227b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f49229e;
        sparseIntArray.clear();
        i41 i41Var = this.f49228c;
        this.f49227b = i41Var.f46487c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f49227b; i11++) {
            sparseIntArray.put(i11, i41Var.d(i11));
        }
        this.f49230f = i41Var.f46489e;
        this.f49231g = i41Var.h;
        this.h = i41Var.f46492r;
        this.f49232i = i41Var.f46493s;
        this.f49233j = i41Var.f46494w;
        this.f49234k = i41Var.f46495x;
        this.f49235l = i41Var.f46496y;
        this.f49236m = i41Var.f46491n;
        this.f49237n = i41Var.D;
        this.f49246x = i41Var.I;
        this.f49247y = i41Var.J;
        this.f49238o = i41Var.E;
        this.f49239p = i41Var.F;
        this.f49240q = i41Var.G;
        this.f49241r = i41Var.K;
        this.f49242s = i41Var.L;
        this.f49243t = i41Var.M;
        this.f49244u = i41Var.N;
        this.v = i41Var.O;
        this.f49245w = i41Var.P;
        i41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (i41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = i41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i7 = 0;
                j3 = -1;
                break;
            }
        }
        v4.o.c(this, true).c(i41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < i41Var.f46487c0) {
                    if (i41Var.c(i10) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
