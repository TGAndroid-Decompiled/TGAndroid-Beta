package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends v4.o {
    public int f53867b;
    public int f53868c;
    public int d;
    public int f53869e;
    public int f53870f;
    public int f53871g;
    public int h;
    public final SparseIntArray f53872i = new SparseIntArray();
    public final SparseIntArray f53873j = new SparseIntArray();
    public final ArrayList f53874k = new ArrayList();
    public final ArrayList f53875l = new ArrayList();
    public final ff0 f53876m;

    public xe0(ff0 ff0Var) {
        this.f53876m = ff0Var;
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
        int i13 = this.f53868c;
        ff0 ff0Var = this.f53876m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f53869e && i7 < this.f53870f)) && ((i10 >= (i12 = ff0Var.E) && i10 < ff0Var.F) || (i10 >= ff0Var.I && i10 < ff0Var.J))) {
            if (i10 >= i12 && i10 < ff0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f47703j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f47704k0.get(i10 - ff0Var.I);
            }
            int i14 = this.f53868c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53874k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53875l.get(i7 - this.f53869e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f53871g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ff0Var.V) && i10 < ff0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f53872i.get(i7, -1);
        int i17 = this.f53873j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53876m.Y;
    }

    @Override
    public final int e() {
        return this.f53867b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ff0 ff0Var = this.f53876m;
        g(1, ff0Var.f47711r, sparseIntArray);
        g(2, ff0Var.f47713s, sparseIntArray);
        g(3, ff0Var.f47717w, sparseIntArray);
        g(4, ff0Var.f47718x, sparseIntArray);
        g(5, ff0Var.f47719y, sparseIntArray);
        g(6, ff0Var.M, sparseIntArray);
        g(7, ff0Var.O, sparseIntArray);
        g(8, ff0Var.P, sparseIntArray);
        g(9, ff0Var.R, sparseIntArray);
        g(10, ff0Var.S, sparseIntArray);
        g(11, ff0Var.T, sparseIntArray);
        g(12, ff0Var.Q, sparseIntArray);
        g(13, ff0Var.G, sparseIntArray);
    }
}
