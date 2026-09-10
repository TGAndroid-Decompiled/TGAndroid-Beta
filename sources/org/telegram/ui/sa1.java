package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class sa1 extends s4.o {
    public int f36616b;
    public final ka1 f36617c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36618f = -1;
    public int f36619g = -1;
    public int h = -1;
    public int f36620i = -1;
    public int f36621j = -1;
    public int f36622k = -1;
    public int f36623l = -1;
    public int f36624m = -1;
    public int f36625n = -1;
    public int f36626o = -1;
    public int f36627p = -1;
    public int f36628q = -1;
    public int f36629r = -1;
    public int f36630s = -1;
    public int f36631t = -1;
    public int f36632u = -1;
    public int v = -1;
    public int f36633w = -1;
    public int f36634x = -1;
    public int f36635y = -1;

    public sa1(ka1 ka1Var, s4.c0 c0Var) {
        this.f36617c = ka1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36617c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ka1 ka1Var = this.f36617c;
        if (i12 == 13 && ka1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ka1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36634x;
        if (i10 >= i13 && i10 <= this.f36635y) {
            if (i10 - i13 == i11 - ka1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36618f && i11 == ka1Var.e) {
            return true;
        } else {
            if (i10 == this.f36619g && i11 == ka1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ka1Var.f34319r) {
                return true;
            }
            if (i10 == this.f36620i && i11 == ka1Var.f34320s) {
                return true;
            }
            if (i10 == this.f36621j && i11 == ka1Var.v) {
                return true;
            }
            if (i10 == this.f36622k && i11 == ka1Var.f34321w) {
                return true;
            }
            if (i10 == this.f36623l && i11 == ka1Var.f34322x) {
                return true;
            }
            if (i10 == this.f36624m && i11 == ka1Var.f34318n) {
                return true;
            }
            if (i10 == this.f36625n && i11 == ka1Var.f34323y) {
                return true;
            }
            if (i10 == this.f36629r && i11 == ka1Var.K) {
                return true;
            }
            if (i10 == this.f36630s && i11 == ka1Var.L) {
                return true;
            }
            if (i10 == this.f36631t && i11 == ka1Var.M) {
                return true;
            }
            if (i10 == this.f36632u && i11 == ka1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ka1Var.O) {
                return true;
            }
            if (i10 == this.f36633w && i11 == ka1Var.P) {
                return true;
            }
            if (i10 == this.f36626o && i11 == ka1Var.E) {
                return true;
            }
            if (i10 == this.f36627p && i11 == ka1Var.F) {
                return true;
            }
            if (i10 == this.f36628q && i11 == ka1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36617c.f34315c0;
    }

    @Override
    public final int e() {
        return this.f36616b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ka1 ka1Var = this.f36617c;
        this.f36616b = ka1Var.f34315c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36616b; i12++) {
            sparseIntArray.put(i12, ka1Var.j(i12));
        }
        this.f36618f = ka1Var.e;
        this.f36619g = ka1Var.h;
        this.h = ka1Var.f34319r;
        this.f36620i = ka1Var.f34320s;
        this.f36621j = ka1Var.v;
        this.f36622k = ka1Var.f34321w;
        this.f36623l = ka1Var.f34322x;
        this.f36624m = ka1Var.f34318n;
        this.f36625n = ka1Var.f34323y;
        this.f36634x = ka1Var.I;
        this.f36635y = ka1Var.J;
        this.f36626o = ka1Var.E;
        this.f36627p = ka1Var.F;
        this.f36628q = ka1Var.G;
        this.f36629r = ka1Var.K;
        this.f36630s = ka1Var.L;
        this.f36631t = ka1Var.M;
        this.f36632u = ka1Var.N;
        this.v = ka1Var.O;
        this.f36633w = ka1Var.P;
        ka1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ka1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ka1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                j3 = -1;
                i10 = 0;
                break;
            }
        }
        s4.o.c(this, true).b(ka1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ka1Var.f34315c0) {
                    if (ka1Var.i(i11) == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                c0Var.h1(i11, i10);
            }
        }
    }
}
