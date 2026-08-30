package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class t91 extends f2.q {
    public int f38604b;
    public final l91 f38605c;
    public final f2.i0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f38606f = -1;
    public int f38607g = -1;
    public int h = -1;
    public int f38608i = -1;
    public int f38609j = -1;
    public int f38610k = -1;
    public int f38611l = -1;
    public int f38612m = -1;
    public int f38613n = -1;
    public int f38614o = -1;
    public int f38615p = -1;
    public int f38616q = -1;
    public int f38617r = -1;
    public int f38618s = -1;
    public int f38619t = -1;
    public int f38620u = -1;
    public int v = -1;
    public int f38621w = -1;
    public int f38622x = -1;
    public int f38623y = -1;

    public t91(l91 l91Var, f2.i0 i0Var) {
        this.f38605c = l91Var;
        this.d = i0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f38605c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        l91 l91Var = this.f38605c;
        if (i12 == 13 && l91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && l91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f38622x;
        if (i10 >= i13 && i10 <= this.f38623y) {
            if (i10 - i13 == i11 - l91Var.F) {
                return true;
            }
            return false;
        } else if (i10 == this.f38606f && i11 == l91Var.e) {
            return true;
        } else {
            if (i10 == this.f38607g && i11 == l91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == l91Var.f36013r) {
                return true;
            }
            if (i10 == this.f38608i && i11 == l91Var.f36014s) {
                return true;
            }
            if (i10 == this.f38609j && i11 == l91Var.v) {
                return true;
            }
            if (i10 == this.f38610k && i11 == l91Var.f36015w) {
                return true;
            }
            if (i10 == this.f38611l && i11 == l91Var.f36016x) {
                return true;
            }
            if (i10 == this.f38612m && i11 == l91Var.f36012n) {
                return true;
            }
            if (i10 == this.f38613n && i11 == l91Var.f36017y) {
                return true;
            }
            if (i10 == this.f38617r && i11 == l91Var.H) {
                return true;
            }
            if (i10 == this.f38618s && i11 == l91Var.I) {
                return true;
            }
            if (i10 == this.f38619t && i11 == l91Var.J) {
                return true;
            }
            if (i10 == this.f38620u && i11 == l91Var.K) {
                return true;
            }
            if (i10 == this.v && i11 == l91Var.L) {
                return true;
            }
            if (i10 == this.f38621w && i11 == l91Var.M) {
                return true;
            }
            if (i10 == this.f38614o && i11 == l91Var.B) {
                return true;
            }
            if (i10 == this.f38615p && i11 == l91Var.C) {
                return true;
            }
            if (i10 == this.f38616q && i11 == l91Var.D) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f38605c.Z;
    }

    @Override
    public final int e() {
        return this.f38604b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        l91 l91Var = this.f38605c;
        this.f38604b = l91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38604b; i12++) {
            sparseIntArray.put(i12, l91Var.j(i12));
        }
        this.f38606f = l91Var.e;
        this.f38607g = l91Var.h;
        this.h = l91Var.f36013r;
        this.f38608i = l91Var.f36014s;
        this.f38609j = l91Var.v;
        this.f38610k = l91Var.f36015w;
        this.f38611l = l91Var.f36016x;
        this.f38612m = l91Var.f36012n;
        this.f38613n = l91Var.f36017y;
        this.f38622x = l91Var.F;
        this.f38623y = l91Var.G;
        this.f38614o = l91Var.B;
        this.f38615p = l91Var.C;
        this.f38616q = l91Var.D;
        this.f38617r = l91Var.H;
        this.f38618s = l91Var.I;
        this.f38619t = l91Var.J;
        this.f38620u = l91Var.K;
        this.v = l91Var.L;
        this.f38621w = l91Var.M;
        l91Var.E();
        f2.i0 i0Var = this.d;
        int L0 = i0Var.L0();
        int N0 = i0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (l91Var.i(L0) != -1 && (m9 = i0Var.m(L0)) != null) {
                    j10 = l91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            } else {
                j10 = -1;
                i10 = 0;
                break;
            }
        }
        f2.q.c(this, true).b(l91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < l91Var.Z) {
                    if (l91Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                i0Var.h1(i11, i10);
            }
        }
    }
}
