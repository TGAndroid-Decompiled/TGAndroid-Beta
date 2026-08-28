package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg0 extends f2.s {
    public int f44859b;
    public int f44860c;
    public int d;
    public int f44861e;
    public int f44862f;
    public int f44863g;
    public int h;
    public final SparseIntArray f44864i = new SparseIntArray();
    public final SparseIntArray f44865j = new SparseIntArray();
    public final ArrayList f44866k = new ArrayList();
    public final ArrayList f44867l = new ArrayList();
    public final hh0 f44868m;

    public yg0(hh0 hh0Var) {
        this.f44868m = hh0Var;
    }

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override
    public final boolean b(int i9, int i10) {
        int i11;
        int i12;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i13 = this.f44860c;
        hh0 hh0Var = this.f44868m;
        if (((i9 >= i13 && i9 < this.d) || (i9 >= this.f44861e && i9 < this.f44862f)) && ((i10 >= (i12 = hh0Var.f38816y) && i10 < hh0Var.A) || (i10 >= hh0Var.D && i10 < hh0Var.E))) {
            if (i10 >= i12 && i10 < hh0Var.A) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f38799e0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f38801f0.get(i10 - hh0Var.D);
            }
            int i14 = this.f44860c;
            if (i9 >= i14 && i9 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f44866k.get(i9 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f44867l.get(i9 - this.f44861e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f44863g;
        if (i9 >= i15 && i9 < this.h && i10 >= (i11 = hh0Var.Q) && i10 < hh0Var.R) {
            if (i9 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f44864i.get(i9, -1);
        int i17 = this.f44865j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f44868m.T;
    }

    @Override
    public final int e() {
        return this.f44859b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hh0 hh0Var = this.f44868m;
        g(1, hh0Var.f38812r, sparseIntArray);
        g(2, hh0Var.f38813s, sparseIntArray);
        g(3, hh0Var.v, sparseIntArray);
        g(4, hh0Var.f38814w, sparseIntArray);
        g(5, hh0Var.f38815x, sparseIntArray);
        g(6, hh0Var.H, sparseIntArray);
        g(7, hh0Var.J, sparseIntArray);
        g(8, hh0Var.K, sparseIntArray);
        g(9, hh0Var.M, sparseIntArray);
        g(10, hh0Var.N, sparseIntArray);
        g(11, hh0Var.O, sparseIntArray);
        g(12, hh0Var.L, sparseIntArray);
        g(13, hh0Var.B, sparseIntArray);
    }
}
