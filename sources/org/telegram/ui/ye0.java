package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ye0 extends v4.o {
    public int f54126b;
    public int f54127c;
    public int d;
    public int f54128e;
    public int f54129f;
    public int f54130g;
    public int h;
    public final SparseIntArray f54131i = new SparseIntArray();
    public final SparseIntArray f54132j = new SparseIntArray();
    public final ArrayList f54133k = new ArrayList();
    public final ArrayList f54134l = new ArrayList();
    public final gf0 f54135m;

    public ye0(gf0 gf0Var) {
        this.f54135m = gf0Var;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11;
        int i12;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i13 = this.f54127c;
        gf0 gf0Var = this.f54135m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f54128e && i7 < this.f54129f)) && ((i10 >= (i12 = gf0Var.E) && i10 < gf0Var.F) || (i10 >= gf0Var.I && i10 < gf0Var.J))) {
            if (i10 >= i12 && i10 < gf0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) gf0Var.f48012j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) gf0Var.f48013k0.get(i10 - gf0Var.I);
            }
            int i14 = this.f54127c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f54133k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f54134l.get(i7 - this.f54128e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f54130g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = gf0Var.V) && i10 < gf0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f54131i.get(i7, -1);
        int i17 = this.f54132j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f54135m.Y;
    }

    @Override
    public final int e() {
        return this.f54126b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        gf0 gf0Var = this.f54135m;
        g(1, gf0Var.f48020r, sparseIntArray);
        g(2, gf0Var.f48022s, sparseIntArray);
        g(3, gf0Var.f48026w, sparseIntArray);
        g(4, gf0Var.f48027x, sparseIntArray);
        g(5, gf0Var.f48028y, sparseIntArray);
        g(6, gf0Var.M, sparseIntArray);
        g(7, gf0Var.O, sparseIntArray);
        g(8, gf0Var.P, sparseIntArray);
        g(9, gf0Var.R, sparseIntArray);
        g(10, gf0Var.S, sparseIntArray);
        g(11, gf0Var.T, sparseIntArray);
        g(12, gf0Var.Q, sparseIntArray);
        g(13, gf0Var.G, sparseIntArray);
    }
}
