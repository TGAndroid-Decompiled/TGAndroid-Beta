package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ua1 extends s4.o {
    public int f40340b;
    public final ma1 f40341c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f40342f = -1;
    public int f40343g = -1;
    public int h = -1;
    public int f40344i = -1;
    public int f40345j = -1;
    public int f40346k = -1;
    public int f40347l = -1;
    public int f40348m = -1;
    public int f40349n = -1;
    public int f40350o = -1;
    public int f40351p = -1;
    public int f40352q = -1;
    public int f40353r = -1;
    public int f40354s = -1;
    public int f40355t = -1;
    public int f40356u = -1;
    public int v = -1;
    public int f40357w = -1;
    public int f40358x = -1;
    public int f40359y = -1;

    public ua1(ma1 ma1Var, s4.b0 b0Var) {
        this.f40341c = ma1Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f40341c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ma1 ma1Var = this.f40341c;
        if (i12 == 13 && ma1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ma1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40358x;
        if (i10 >= i13 && i10 <= this.f40359y) {
            if (i10 - i13 == i11 - ma1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40342f && i11 == ma1Var.e) {
            return true;
        } else {
            if (i10 == this.f40343g && i11 == ma1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ma1Var.f37953r) {
                return true;
            }
            if (i10 == this.f40344i && i11 == ma1Var.f37954s) {
                return true;
            }
            if (i10 == this.f40345j && i11 == ma1Var.v) {
                return true;
            }
            if (i10 == this.f40346k && i11 == ma1Var.f37955w) {
                return true;
            }
            if (i10 == this.f40347l && i11 == ma1Var.f37956x) {
                return true;
            }
            if (i10 == this.f40348m && i11 == ma1Var.f37952n) {
                return true;
            }
            if (i10 == this.f40349n && i11 == ma1Var.f37957y) {
                return true;
            }
            if (i10 == this.f40353r && i11 == ma1Var.K) {
                return true;
            }
            if (i10 == this.f40354s && i11 == ma1Var.L) {
                return true;
            }
            if (i10 == this.f40355t && i11 == ma1Var.M) {
                return true;
            }
            if (i10 == this.f40356u && i11 == ma1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ma1Var.O) {
                return true;
            }
            if (i10 == this.f40357w && i11 == ma1Var.P) {
                return true;
            }
            if (i10 == this.f40350o && i11 == ma1Var.E) {
                return true;
            }
            if (i10 == this.f40351p && i11 == ma1Var.F) {
                return true;
            }
            if (i10 == this.f40352q && i11 == ma1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40341c.f37949c0;
    }

    @Override
    public final int e() {
        return this.f40340b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ma1 ma1Var = this.f40341c;
        this.f40340b = ma1Var.f37949c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40340b; i12++) {
            sparseIntArray.put(i12, ma1Var.j(i12));
        }
        this.f40342f = ma1Var.e;
        this.f40343g = ma1Var.h;
        this.h = ma1Var.f37953r;
        this.f40344i = ma1Var.f37954s;
        this.f40345j = ma1Var.v;
        this.f40346k = ma1Var.f37955w;
        this.f40347l = ma1Var.f37956x;
        this.f40348m = ma1Var.f37952n;
        this.f40349n = ma1Var.f37957y;
        this.f40358x = ma1Var.I;
        this.f40359y = ma1Var.J;
        this.f40350o = ma1Var.E;
        this.f40351p = ma1Var.F;
        this.f40352q = ma1Var.G;
        this.f40353r = ma1Var.K;
        this.f40354s = ma1Var.L;
        this.f40355t = ma1Var.M;
        this.f40356u = ma1Var.N;
        this.v = ma1Var.O;
        this.f40357w = ma1Var.P;
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
                if (i11 < ma1Var.f37949c0) {
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
