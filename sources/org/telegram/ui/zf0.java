package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zf0 extends s4.n {
    public int f43991b;
    public int f43992c;
    public int d;
    public int e;
    public int f43993f;
    public int f43994g;
    public int h;
    public final SparseIntArray f43995i = new SparseIntArray();
    public final SparseIntArray f43996j = new SparseIntArray();
    public final ArrayList f43997k = new ArrayList();
    public final ArrayList f43998l = new ArrayList();
    public final ig0 f43999m;

    public zf0(ig0 ig0Var) {
        this.f43999m = ig0Var;
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
        int i14 = this.f43992c;
        ig0 ig0Var = this.f43999m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f43993f)) && ((i11 >= (i13 = ig0Var.D) && i11 < ig0Var.E) || (i11 >= ig0Var.H && i11 < ig0Var.I))) {
            if (i11 >= i13 && i11 < ig0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ig0Var.f38038i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ig0Var.f38039j0.get(i11 - ig0Var.H);
            }
            int i15 = this.f43992c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43997k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43998l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f43994g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ig0Var.U) && i11 < ig0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f43995i.get(i10, -1);
        int i18 = this.f43996j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f43999m.X;
    }

    @Override
    public final int e() {
        return this.f43991b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ig0 ig0Var = this.f43999m;
        g(1, ig0Var.f38047r, sparseIntArray);
        g(2, ig0Var.f38049s, sparseIntArray);
        g(3, ig0Var.f38052w, sparseIntArray);
        g(4, ig0Var.f38053x, sparseIntArray);
        g(5, ig0Var.f38054y, sparseIntArray);
        g(6, ig0Var.L, sparseIntArray);
        g(7, ig0Var.N, sparseIntArray);
        g(8, ig0Var.O, sparseIntArray);
        g(9, ig0Var.Q, sparseIntArray);
        g(10, ig0Var.R, sparseIntArray);
        g(11, ig0Var.S, sparseIntArray);
        g(12, ig0Var.P, sparseIntArray);
        g(13, ig0Var.F, sparseIntArray);
    }
}
