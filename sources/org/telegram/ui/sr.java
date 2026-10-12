package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class sr extends s4.o {
    public int f40193b;
    public int e;
    public int f40195f;
    public int f40196g;
    public int h;
    public int f40197i;
    public int f40198j;
    public final yr f40202n;
    public final SparseIntArray f40194c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f40199k = new ArrayList();
    public final ArrayList f40200l = new ArrayList();
    public final ArrayList f40201m = new ArrayList();

    public sr(yr yrVar) {
        this.f40202n = yrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f40202n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f40197i;
        yr yrVar = this.f40202n;
        if (i10 >= i12 && i10 < this.f40198j && i11 >= yrVar.X0 && i11 < yrVar.Y0) {
            return ((TLObject) this.f40200l.get(i10 - i12)).equals(yrVar.G.get(i11 - yrVar.X0));
        }
        int i13 = this.f40196g;
        if (i10 >= i13 && i10 < this.h && i11 >= yrVar.U0 && i11 < yrVar.V0) {
            return ((TLObject) this.f40201m.get(i10 - i13)).equals(yrVar.H.get(i11 - yrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f40195f && i11 >= yrVar.E0 && i11 < yrVar.F0) {
            return ((TLObject) this.f40199k.get(i10 - i14)).equals(yrVar.F.get(i11 - yrVar.E0));
        }
        if (this.f40194c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f40202n.f42222d1;
    }

    @Override
    public final int e() {
        return this.f40193b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yr yrVar = this.f40202n;
        g(1, yrVar.f42259v0, sparseIntArray);
        g(2, yrVar.f42270z0, sparseIntArray);
        g(3, yrVar.A0, sparseIntArray);
        g(4, yrVar.C0, sparseIntArray);
        g(5, yrVar.D0, sparseIntArray);
        g(6, yrVar.G0, sparseIntArray);
        g(7, yrVar.H0, sparseIntArray);
        g(8, yrVar.f42253s0, sparseIntArray);
        g(9, yrVar.f42255t0, sparseIntArray);
        g(10, yrVar.f42257u0, sparseIntArray);
        g(11, yrVar.f42217b1, sparseIntArray);
        g(12, yrVar.f42220c1, sparseIntArray);
        g(13, yrVar.S, sparseIntArray);
        g(14, yrVar.T, sparseIntArray);
        g(15, yrVar.U, sparseIntArray);
        g(16, yrVar.f42223e0, sparseIntArray);
        g(17, yrVar.f42221d0, sparseIntArray);
        g(18, yrVar.f42226f0, sparseIntArray);
        g(19, yrVar.f42230h0, sparseIntArray);
        g(20, yrVar.m0, sparseIntArray);
        g(21, yrVar.f42232i0, sparseIntArray);
        g(22, yrVar.f42234j0, sparseIntArray);
        int i10 = 23;
        g(23, yrVar.f42236k0, sparseIntArray);
        if (yrVar.f42264x) {
            i10 = 24;
            g(24, yrVar.f42238l0, sparseIntArray);
        }
        g(i10 + 1, yrVar.f42228g0, sparseIntArray);
        g(i10 + 2, yrVar.B0, sparseIntArray);
        g(i10 + 3, yrVar.T0, sparseIntArray);
        g(i10 + 4, yrVar.W0, sparseIntArray);
        g(i10 + 5, yrVar.Z0, sparseIntArray);
        g(i10 + 6, yrVar.N0, sparseIntArray);
        g(i10 + 7, yrVar.O0, sparseIntArray);
        g(i10 + 8, yrVar.P0, sparseIntArray);
        g(i10 + 9, yrVar.Q0, sparseIntArray);
        g(i10 + 10, yrVar.S0, sparseIntArray);
        g(i10 + 11, yrVar.R0, sparseIntArray);
        g(i10 + 12, yrVar.f42214a1, sparseIntArray);
        g(i10 + 13, yrVar.f42227f1, sparseIntArray);
        g(i10 + 14, yrVar.f42229g1, sparseIntArray);
        g(i10 + 15, yrVar.f42231h1, sparseIntArray);
        g(i10 + 16, yrVar.f42233i1, sparseIntArray);
        g(i10 + 17, yrVar.f42235j1, sparseIntArray);
        g(i10 + 18, yrVar.f42241n0, sparseIntArray);
        g(i10 + 19, yrVar.f42243o0, sparseIntArray);
        g(i10 + 20, yrVar.f42245p0, sparseIntArray);
        g(i10 + 21, yrVar.f42247q0, sparseIntArray);
        g(i10 + 22, yrVar.f42250r0, sparseIntArray);
    }
}
