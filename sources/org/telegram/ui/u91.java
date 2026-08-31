package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class u91 extends f2.q {
    public int f41848b;
    public final m91 f41849c;
    public final f2.j0 d;
    public final SparseIntArray f41850e = new SparseIntArray();
    public int f41851f = -1;
    public int f41852g = -1;
    public int h = -1;
    public int f41853i = -1;
    public int f41854j = -1;
    public int f41855k = -1;
    public int f41856l = -1;
    public int f41857m = -1;
    public int f41858n = -1;
    public int f41859o = -1;
    public int f41860p = -1;
    public int f41861q = -1;
    public int f41862r = -1;
    public int f41863s = -1;
    public int f41864t = -1;
    public int f41865u = -1;
    public int v = -1;
    public int f41866w = -1;
    public int f41867x = -1;
    public int f41868y = -1;

    public u91(m91 m91Var, f2.j0 j0Var) {
        this.f41849c = m91Var;
        this.d = j0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f41850e.get(i10) == this.f41849c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f41850e;
        int i12 = sparseIntArray.get(i10);
        m91 m91Var = this.f41849c;
        if (i12 == 13 && m91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && m91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f41867x;
        if (i10 >= i13 && i10 <= this.f41868y) {
            if (i10 - i13 == i11 - m91Var.F) {
                return true;
            }
            return false;
        } else if (i10 == this.f41851f && i11 == m91Var.f39017e) {
            return true;
        } else {
            if (i10 == this.f41852g && i11 == m91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == m91Var.f39020r) {
                return true;
            }
            if (i10 == this.f41853i && i11 == m91Var.f39021s) {
                return true;
            }
            if (i10 == this.f41854j && i11 == m91Var.v) {
                return true;
            }
            if (i10 == this.f41855k && i11 == m91Var.f39022w) {
                return true;
            }
            if (i10 == this.f41856l && i11 == m91Var.f39023x) {
                return true;
            }
            if (i10 == this.f41857m && i11 == m91Var.f39019n) {
                return true;
            }
            if (i10 == this.f41858n && i11 == m91Var.f39024y) {
                return true;
            }
            if (i10 == this.f41862r && i11 == m91Var.H) {
                return true;
            }
            if (i10 == this.f41863s && i11 == m91Var.I) {
                return true;
            }
            if (i10 == this.f41864t && i11 == m91Var.J) {
                return true;
            }
            if (i10 == this.f41865u && i11 == m91Var.K) {
                return true;
            }
            if (i10 == this.v && i11 == m91Var.L) {
                return true;
            }
            if (i10 == this.f41866w && i11 == m91Var.M) {
                return true;
            }
            if (i10 == this.f41859o && i11 == m91Var.B) {
                return true;
            }
            if (i10 == this.f41860p && i11 == m91Var.C) {
                return true;
            }
            if (i10 == this.f41861q && i11 == m91Var.D) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f41849c.Z;
    }

    @Override
    public final int e() {
        return this.f41848b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.f41850e;
        sparseIntArray.clear();
        m91 m91Var = this.f41849c;
        this.f41848b = m91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f41848b; i12++) {
            sparseIntArray.put(i12, m91Var.j(i12));
        }
        this.f41851f = m91Var.f39017e;
        this.f41852g = m91Var.h;
        this.h = m91Var.f39020r;
        this.f41853i = m91Var.f39021s;
        this.f41854j = m91Var.v;
        this.f41855k = m91Var.f39022w;
        this.f41856l = m91Var.f39023x;
        this.f41857m = m91Var.f39019n;
        this.f41858n = m91Var.f39024y;
        this.f41867x = m91Var.F;
        this.f41868y = m91Var.G;
        this.f41859o = m91Var.B;
        this.f41860p = m91Var.C;
        this.f41861q = m91Var.D;
        this.f41862r = m91Var.H;
        this.f41863s = m91Var.I;
        this.f41864t = m91Var.J;
        this.f41865u = m91Var.K;
        this.v = m91Var.L;
        this.f41866w = m91Var.M;
        m91Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (m91Var.i(L0) != -1 && (m9 = j0Var.m(L0)) != null) {
                    j10 = m91Var.i(L0);
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
        f2.q.c(this, true).b(m91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < m91Var.Z) {
                    if (m91Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                j0Var.h1(i11, i10);
            }
        }
    }
}
