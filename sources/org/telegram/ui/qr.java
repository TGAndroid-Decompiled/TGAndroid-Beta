package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class qr extends s4.o {
    public int f36120b;
    public int e;
    public int f36122f;
    public int f36123g;
    public int h;
    public int f36124i;
    public int f36125j;
    public final wr f36129n;
    public final SparseIntArray f36121c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36126k = new ArrayList();
    public final ArrayList f36127l = new ArrayList();
    public final ArrayList f36128m = new ArrayList();

    public qr(wr wrVar) {
        this.f36129n = wrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36129n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36124i;
        wr wrVar = this.f36129n;
        if (i10 >= i12 && i10 < this.f36125j && i11 >= wrVar.X0 && i11 < wrVar.Y0) {
            return ((TLObject) this.f36127l.get(i10 - i12)).equals(wrVar.G.get(i11 - wrVar.X0));
        }
        int i13 = this.f36123g;
        if (i10 >= i13 && i10 < this.h && i11 >= wrVar.U0 && i11 < wrVar.V0) {
            return ((TLObject) this.f36128m.get(i10 - i13)).equals(wrVar.H.get(i11 - wrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36122f && i11 >= wrVar.E0 && i11 < wrVar.F0) {
            return ((TLObject) this.f36126k.get(i10 - i14)).equals(wrVar.F.get(i11 - wrVar.E0));
        }
        if (this.f36121c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36129n.f38327d1;
    }

    @Override
    public final int e() {
        return this.f36120b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wr wrVar = this.f36129n;
        g(1, wrVar.f38364v0, sparseIntArray);
        g(2, wrVar.f38375z0, sparseIntArray);
        g(3, wrVar.A0, sparseIntArray);
        g(4, wrVar.C0, sparseIntArray);
        g(5, wrVar.D0, sparseIntArray);
        g(6, wrVar.G0, sparseIntArray);
        g(7, wrVar.H0, sparseIntArray);
        g(8, wrVar.f38358s0, sparseIntArray);
        g(9, wrVar.f38360t0, sparseIntArray);
        g(10, wrVar.f38362u0, sparseIntArray);
        g(11, wrVar.f38322b1, sparseIntArray);
        g(12, wrVar.f38325c1, sparseIntArray);
        g(13, wrVar.S, sparseIntArray);
        g(14, wrVar.T, sparseIntArray);
        g(15, wrVar.U, sparseIntArray);
        g(16, wrVar.f38328e0, sparseIntArray);
        g(17, wrVar.f38326d0, sparseIntArray);
        g(18, wrVar.f38331f0, sparseIntArray);
        g(19, wrVar.f38335h0, sparseIntArray);
        g(20, wrVar.m0, sparseIntArray);
        g(21, wrVar.f38337i0, sparseIntArray);
        g(22, wrVar.f38339j0, sparseIntArray);
        int i10 = 23;
        g(23, wrVar.f38341k0, sparseIntArray);
        if (wrVar.f38369x) {
            i10 = 24;
            g(24, wrVar.f38343l0, sparseIntArray);
        }
        g(i10 + 1, wrVar.f38333g0, sparseIntArray);
        g(i10 + 2, wrVar.B0, sparseIntArray);
        g(i10 + 3, wrVar.T0, sparseIntArray);
        g(i10 + 4, wrVar.W0, sparseIntArray);
        g(i10 + 5, wrVar.Z0, sparseIntArray);
        g(i10 + 6, wrVar.N0, sparseIntArray);
        g(i10 + 7, wrVar.O0, sparseIntArray);
        g(i10 + 8, wrVar.P0, sparseIntArray);
        g(i10 + 9, wrVar.Q0, sparseIntArray);
        g(i10 + 10, wrVar.S0, sparseIntArray);
        g(i10 + 11, wrVar.R0, sparseIntArray);
        g(i10 + 12, wrVar.f38319a1, sparseIntArray);
        g(i10 + 13, wrVar.f38332f1, sparseIntArray);
        g(i10 + 14, wrVar.f38334g1, sparseIntArray);
        g(i10 + 15, wrVar.f38336h1, sparseIntArray);
        g(i10 + 16, wrVar.f38338i1, sparseIntArray);
        g(i10 + 17, wrVar.f38340j1, sparseIntArray);
        g(i10 + 18, wrVar.f38346n0, sparseIntArray);
        g(i10 + 19, wrVar.f38348o0, sparseIntArray);
        g(i10 + 20, wrVar.f38350p0, sparseIntArray);
        g(i10 + 21, wrVar.f38352q0, sparseIntArray);
        g(i10 + 22, wrVar.f38355r0, sparseIntArray);
    }
}
