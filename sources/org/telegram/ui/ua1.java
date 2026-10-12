package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ua1 extends s4.o {
    public int f40614b;
    public final ma1 f40615c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f40616f = -1;
    public int f40617g = -1;
    public int h = -1;
    public int f40618i = -1;
    public int f40619j = -1;
    public int f40620k = -1;
    public int f40621l = -1;
    public int f40622m = -1;
    public int f40623n = -1;
    public int f40624o = -1;
    public int f40625p = -1;
    public int f40626q = -1;
    public int f40627r = -1;
    public int f40628s = -1;
    public int f40629t = -1;
    public int f40630u = -1;
    public int v = -1;
    public int f40631w = -1;
    public int f40632x = -1;
    public int f40633y = -1;

    public ua1(ma1 ma1Var, s4.b0 b0Var) {
        this.f40615c = ma1Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f40615c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ma1 ma1Var = this.f40615c;
        if (i12 == 13 && ma1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ma1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40632x;
        if (i10 >= i13 && i10 <= this.f40633y) {
            if (i10 - i13 == i11 - ma1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40616f && i11 == ma1Var.e) {
            return true;
        } else {
            if (i10 == this.f40617g && i11 == ma1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ma1Var.f38207r) {
                return true;
            }
            if (i10 == this.f40618i && i11 == ma1Var.f38208s) {
                return true;
            }
            if (i10 == this.f40619j && i11 == ma1Var.v) {
                return true;
            }
            if (i10 == this.f40620k && i11 == ma1Var.f38209w) {
                return true;
            }
            if (i10 == this.f40621l && i11 == ma1Var.f38210x) {
                return true;
            }
            if (i10 == this.f40622m && i11 == ma1Var.f38206n) {
                return true;
            }
            if (i10 == this.f40623n && i11 == ma1Var.f38211y) {
                return true;
            }
            if (i10 == this.f40627r && i11 == ma1Var.K) {
                return true;
            }
            if (i10 == this.f40628s && i11 == ma1Var.L) {
                return true;
            }
            if (i10 == this.f40629t && i11 == ma1Var.M) {
                return true;
            }
            if (i10 == this.f40630u && i11 == ma1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ma1Var.O) {
                return true;
            }
            if (i10 == this.f40631w && i11 == ma1Var.P) {
                return true;
            }
            if (i10 == this.f40624o && i11 == ma1Var.E) {
                return true;
            }
            if (i10 == this.f40625p && i11 == ma1Var.F) {
                return true;
            }
            if (i10 == this.f40626q && i11 == ma1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40615c.f38203c0;
    }

    @Override
    public final int e() {
        return this.f40614b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ma1 ma1Var = this.f40615c;
        this.f40614b = ma1Var.f38203c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40614b; i12++) {
            sparseIntArray.put(i12, ma1Var.j(i12));
        }
        this.f40616f = ma1Var.e;
        this.f40617g = ma1Var.h;
        this.h = ma1Var.f38207r;
        this.f40618i = ma1Var.f38208s;
        this.f40619j = ma1Var.v;
        this.f40620k = ma1Var.f38209w;
        this.f40621l = ma1Var.f38210x;
        this.f40622m = ma1Var.f38206n;
        this.f40623n = ma1Var.f38211y;
        this.f40632x = ma1Var.I;
        this.f40633y = ma1Var.J;
        this.f40624o = ma1Var.E;
        this.f40625p = ma1Var.F;
        this.f40626q = ma1Var.G;
        this.f40627r = ma1Var.K;
        this.f40628s = ma1Var.L;
        this.f40629t = ma1Var.M;
        this.f40630u = ma1Var.N;
        this.v = ma1Var.O;
        this.f40631w = ma1Var.P;
        ma1Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ma1Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = ma1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i10 = 0;
                j10 = -1;
                break;
            }
        }
        s4.o.c(this, true).c(ma1Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < ma1Var.f38203c0) {
                    if (ma1Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                b0Var.h1(i11, i10);
            }
        }
    }
}
