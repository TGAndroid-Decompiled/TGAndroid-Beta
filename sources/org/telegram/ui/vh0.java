package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vh0 extends s4.o {
    public int f41002b;
    public int f41003c;
    public int d;
    public int e;
    public int f41004f;
    public int f41005g;
    public int h;
    public final SparseIntArray f41006i = new SparseIntArray();
    public final SparseIntArray f41007j = new SparseIntArray();
    public final ArrayList f41008k = new ArrayList();
    public final ArrayList f41009l = new ArrayList();
    public final ei0 f41010m;

    public vh0(ei0 ei0Var) {
        this.f41010m = ei0Var;
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
        int i14 = this.f41003c;
        ei0 ei0Var = this.f41010m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f41004f)) && ((i11 >= (i13 = ei0Var.f35612y) && i11 < ei0Var.E) || (i11 >= ei0Var.H && i11 < ei0Var.I))) {
            if (i11 >= i13 && i11 < ei0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ei0Var.f35596i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ei0Var.f35597j0.get(i11 - ei0Var.H);
            }
            int i15 = this.f41003c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f41008k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f41009l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f41005g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ei0Var.U) && i11 < ei0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f41006i.get(i10, -1);
        int i18 = this.f41007j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f41010m.X;
    }

    @Override
    public final int e() {
        return this.f41002b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ei0 ei0Var = this.f41010m;
        g(1, ei0Var.f35605r, sparseIntArray);
        g(2, ei0Var.f35607s, sparseIntArray);
        g(3, ei0Var.v, sparseIntArray);
        g(4, ei0Var.f35610w, sparseIntArray);
        g(5, ei0Var.f35611x, sparseIntArray);
        g(6, ei0Var.L, sparseIntArray);
        g(7, ei0Var.N, sparseIntArray);
        g(8, ei0Var.O, sparseIntArray);
        g(9, ei0Var.Q, sparseIntArray);
        g(10, ei0Var.R, sparseIntArray);
        g(11, ei0Var.S, sparseIntArray);
        g(12, ei0Var.P, sparseIntArray);
        g(13, ei0Var.F, sparseIntArray);
    }
}
