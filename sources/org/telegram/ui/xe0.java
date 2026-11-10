package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends v4.o {
    public int f51703b;
    public int f51704c;
    public int d;
    public int f51705e;
    public int f51706f;
    public int f51707g;
    public int h;
    public final SparseIntArray f51708i = new SparseIntArray();
    public final SparseIntArray f51709j = new SparseIntArray();
    public final ArrayList f51710k = new ArrayList();
    public final ArrayList f51711l = new ArrayList();
    public final ff0 f51712m;

    public xe0(ff0 ff0Var) {
        this.f51712m = ff0Var;
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
        int i13 = this.f51704c;
        ff0 ff0Var = this.f51712m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f51705e && i7 < this.f51706f)) && ((i10 >= (i12 = ff0Var.D) && i10 < ff0Var.E) || (i10 >= ff0Var.H && i10 < ff0Var.I))) {
            if (i10 >= i12 && i10 < ff0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f45742i0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f45743j0.get(i10 - ff0Var.H);
            }
            int i14 = this.f51704c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51710k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51711l.get(i7 - this.f51705e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f51707g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ff0Var.U) && i10 < ff0Var.V) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f51708i.get(i7, -1);
        int i17 = this.f51709j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f51712m.X;
    }

    @Override
    public final int e() {
        return this.f51703b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ff0 ff0Var = this.f51712m;
        g(1, ff0Var.f45751r, sparseIntArray);
        g(2, ff0Var.f45753s, sparseIntArray);
        g(3, ff0Var.f45756w, sparseIntArray);
        g(4, ff0Var.f45757x, sparseIntArray);
        g(5, ff0Var.f45758y, sparseIntArray);
        g(6, ff0Var.L, sparseIntArray);
        g(7, ff0Var.N, sparseIntArray);
        g(8, ff0Var.O, sparseIntArray);
        g(9, ff0Var.Q, sparseIntArray);
        g(10, ff0Var.R, sparseIntArray);
        g(11, ff0Var.S, sparseIntArray);
        g(12, ff0Var.P, sparseIntArray);
        g(13, ff0Var.F, sparseIntArray);
    }
}
