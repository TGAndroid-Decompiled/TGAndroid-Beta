package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class we0 extends v4.o {
    public int f51049b;
    public int f51050c;
    public int d;
    public int f51051e;
    public int f51052f;
    public int f51053g;
    public int h;
    public final SparseIntArray f51054i = new SparseIntArray();
    public final SparseIntArray f51055j = new SparseIntArray();
    public final ArrayList f51056k = new ArrayList();
    public final ArrayList f51057l = new ArrayList();
    public final ef0 f51058m;

    public we0(ef0 ef0Var) {
        this.f51058m = ef0Var;
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
        int i13 = this.f51050c;
        ef0 ef0Var = this.f51058m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f51051e && i7 < this.f51052f)) && ((i10 >= (i12 = ef0Var.D) && i10 < ef0Var.E) || (i10 >= ef0Var.H && i10 < ef0Var.I))) {
            if (i10 >= i12 && i10 < ef0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.f45418i0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.f45419j0.get(i10 - ef0Var.H);
            }
            int i14 = this.f51050c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51056k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51057l.get(i7 - this.f51051e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f51053g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ef0Var.U) && i10 < ef0Var.V) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f51054i.get(i7, -1);
        int i17 = this.f51055j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f51058m.X;
    }

    @Override
    public final int e() {
        return this.f51049b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ef0 ef0Var = this.f51058m;
        g(1, ef0Var.f45427r, sparseIntArray);
        g(2, ef0Var.f45429s, sparseIntArray);
        g(3, ef0Var.f45432w, sparseIntArray);
        g(4, ef0Var.f45433x, sparseIntArray);
        g(5, ef0Var.f45434y, sparseIntArray);
        g(6, ef0Var.L, sparseIntArray);
        g(7, ef0Var.N, sparseIntArray);
        g(8, ef0Var.O, sparseIntArray);
        g(9, ef0Var.Q, sparseIntArray);
        g(10, ef0Var.R, sparseIntArray);
        g(11, ef0Var.S, sparseIntArray);
        g(12, ef0Var.P, sparseIntArray);
        g(13, ef0Var.F, sparseIntArray);
    }
}
