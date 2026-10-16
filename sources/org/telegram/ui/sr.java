package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class sr extends s4.o {
    public int f39926b;
    public int e;
    public int f39928f;
    public int f39929g;
    public int h;
    public int f39930i;
    public int f39931j;
    public final yr f39935n;
    public final SparseIntArray f39927c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39932k = new ArrayList();
    public final ArrayList f39933l = new ArrayList();
    public final ArrayList f39934m = new ArrayList();

    public sr(yr yrVar) {
        this.f39935n = yrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39935n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39930i;
        yr yrVar = this.f39935n;
        if (i10 >= i12 && i10 < this.f39931j && i11 >= yrVar.X0 && i11 < yrVar.Y0) {
            return ((TLObject) this.f39933l.get(i10 - i12)).equals(yrVar.G.get(i11 - yrVar.X0));
        }
        int i13 = this.f39929g;
        if (i10 >= i13 && i10 < this.h && i11 >= yrVar.U0 && i11 < yrVar.V0) {
            return ((TLObject) this.f39934m.get(i10 - i13)).equals(yrVar.H.get(i11 - yrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f39928f && i11 >= yrVar.E0 && i11 < yrVar.F0) {
            return ((TLObject) this.f39932k.get(i10 - i14)).equals(yrVar.F.get(i11 - yrVar.E0));
        }
        if (this.f39927c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39935n.f41899d1;
    }

    @Override
    public final int e() {
        return this.f39926b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yr yrVar = this.f39935n;
        g(1, yrVar.f41936v0, sparseIntArray);
        g(2, yrVar.f41947z0, sparseIntArray);
        g(3, yrVar.A0, sparseIntArray);
        g(4, yrVar.C0, sparseIntArray);
        g(5, yrVar.D0, sparseIntArray);
        g(6, yrVar.G0, sparseIntArray);
        g(7, yrVar.H0, sparseIntArray);
        g(8, yrVar.f41930s0, sparseIntArray);
        g(9, yrVar.f41932t0, sparseIntArray);
        g(10, yrVar.f41934u0, sparseIntArray);
        g(11, yrVar.f41894b1, sparseIntArray);
        g(12, yrVar.f41897c1, sparseIntArray);
        g(13, yrVar.S, sparseIntArray);
        g(14, yrVar.T, sparseIntArray);
        g(15, yrVar.U, sparseIntArray);
        g(16, yrVar.f41900e0, sparseIntArray);
        g(17, yrVar.f41898d0, sparseIntArray);
        g(18, yrVar.f41903f0, sparseIntArray);
        g(19, yrVar.f41907h0, sparseIntArray);
        g(20, yrVar.m0, sparseIntArray);
        g(21, yrVar.f41909i0, sparseIntArray);
        g(22, yrVar.f41911j0, sparseIntArray);
        int i10 = 23;
        g(23, yrVar.f41913k0, sparseIntArray);
        if (yrVar.f41941x) {
            i10 = 24;
            g(24, yrVar.f41915l0, sparseIntArray);
        }
        g(i10 + 1, yrVar.f41905g0, sparseIntArray);
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
        g(i10 + 12, yrVar.f41891a1, sparseIntArray);
        g(i10 + 13, yrVar.f41904f1, sparseIntArray);
        g(i10 + 14, yrVar.f41906g1, sparseIntArray);
        g(i10 + 15, yrVar.f41908h1, sparseIntArray);
        g(i10 + 16, yrVar.f41910i1, sparseIntArray);
        g(i10 + 17, yrVar.f41912j1, sparseIntArray);
        g(i10 + 18, yrVar.f41918n0, sparseIntArray);
        g(i10 + 19, yrVar.f41920o0, sparseIntArray);
        g(i10 + 20, yrVar.f41922p0, sparseIntArray);
        g(i10 + 21, yrVar.f41924q0, sparseIntArray);
        g(i10 + 22, yrVar.f41927r0, sparseIntArray);
    }
}
