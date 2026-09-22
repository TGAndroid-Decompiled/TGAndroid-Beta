package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rh0 extends s4.o {
    public int f37182b;
    public int f37183c;
    public int d;
    public int e;
    public int f37184f;
    public int f37185g;
    public int h;
    public final SparseIntArray f37186i = new SparseIntArray();
    public final SparseIntArray f37187j = new SparseIntArray();
    public final ArrayList f37188k = new ArrayList();
    public final ArrayList f37189l = new ArrayList();
    public final ai0 f37190m;

    public rh0(ai0 ai0Var) {
        this.f37190m = ai0Var;
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
        int i14 = this.f37183c;
        ai0 ai0Var = this.f37190m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f37184f)) && ((i11 >= (i13 = ai0Var.f32120y) && i11 < ai0Var.E) || (i11 >= ai0Var.H && i11 < ai0Var.I))) {
            if (i11 >= i13 && i11 < ai0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ai0Var.f32104i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ai0Var.f32105j0.get(i11 - ai0Var.H);
            }
            int i15 = this.f37183c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37188k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37189l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f37185g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ai0Var.U) && i11 < ai0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f37186i.get(i10, -1);
        int i18 = this.f37187j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f37190m.X;
    }

    @Override
    public final int e() {
        return this.f37182b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ai0 ai0Var = this.f37190m;
        g(1, ai0Var.f32113r, sparseIntArray);
        g(2, ai0Var.f32115s, sparseIntArray);
        g(3, ai0Var.v, sparseIntArray);
        g(4, ai0Var.f32118w, sparseIntArray);
        g(5, ai0Var.f32119x, sparseIntArray);
        g(6, ai0Var.L, sparseIntArray);
        g(7, ai0Var.N, sparseIntArray);
        g(8, ai0Var.O, sparseIntArray);
        g(9, ai0Var.Q, sparseIntArray);
        g(10, ai0Var.R, sparseIntArray);
        g(11, ai0Var.S, sparseIntArray);
        g(12, ai0Var.P, sparseIntArray);
        g(13, ai0Var.F, sparseIntArray);
    }
}
