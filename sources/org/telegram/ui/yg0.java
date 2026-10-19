package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg0 extends s4.o {
    public int f43476b;
    public int f43477c;
    public int d;
    public int e;
    public int f43478f;
    public int f43479g;
    public int h;
    public final SparseIntArray f43480i = new SparseIntArray();
    public final SparseIntArray f43481j = new SparseIntArray();
    public final ArrayList f43482k = new ArrayList();
    public final ArrayList f43483l = new ArrayList();
    public final hh0 f43484m;

    public yg0(hh0 hh0Var) {
        this.f43484m = hh0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i14 = this.f43477c;
        hh0 hh0Var = this.f43484m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f43478f)) && ((i11 >= (i13 = hh0Var.f37650y) && i11 < hh0Var.E) || (i11 >= hh0Var.H && i11 < hh0Var.I))) {
            if (i11 >= i13 && i11 < hh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f37634i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f37635j0.get(i11 - hh0Var.H);
            }
            int i15 = this.f43477c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43482k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43483l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f43479g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = hh0Var.U) && i11 < hh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f43480i.get(i10, -1);
        int i18 = this.f43481j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f43484m.X;
    }

    @Override
    public final int e() {
        return this.f43476b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hh0 hh0Var = this.f43484m;
        g(1, hh0Var.f37643r, sparseIntArray);
        g(2, hh0Var.f37645s, sparseIntArray);
        g(3, hh0Var.v, sparseIntArray);
        g(4, hh0Var.f37648w, sparseIntArray);
        g(5, hh0Var.f37649x, sparseIntArray);
        g(6, hh0Var.L, sparseIntArray);
        g(7, hh0Var.N, sparseIntArray);
        g(8, hh0Var.O, sparseIntArray);
        g(9, hh0Var.Q, sparseIntArray);
        g(10, hh0Var.R, sparseIntArray);
        g(11, hh0Var.S, sparseIntArray);
        g(12, hh0Var.P, sparseIntArray);
        g(13, hh0Var.F, sparseIntArray);
    }
}
