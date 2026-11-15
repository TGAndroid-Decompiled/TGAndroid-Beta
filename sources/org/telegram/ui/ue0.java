package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends v4.o {
    public int f51923b;
    public int f51924c;
    public int d;
    public int f51925e;
    public int f51926f;
    public int f51927g;
    public int h;
    public final SparseIntArray f51928i = new SparseIntArray();
    public final SparseIntArray f51929j = new SparseIntArray();
    public final ArrayList f51930k = new ArrayList();
    public final ArrayList f51931l = new ArrayList();
    public final cf0 f51932m;

    public ue0(cf0 cf0Var) {
        this.f51932m = cf0Var;
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
        int i13 = this.f51924c;
        cf0 cf0Var = this.f51932m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f51925e && i7 < this.f51926f)) && ((i10 >= (i12 = cf0Var.E) && i10 < cf0Var.F) || (i10 >= cf0Var.I && i10 < cf0Var.J))) {
            if (i10 >= i12 && i10 < cf0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f46127j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f46128k0.get(i10 - cf0Var.I);
            }
            int i14 = this.f51924c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51930k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51931l.get(i7 - this.f51925e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f51927g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = cf0Var.V) && i10 < cf0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f51928i.get(i7, -1);
        int i17 = this.f51929j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f51932m.Y;
    }

    @Override
    public final int e() {
        return this.f51923b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        cf0 cf0Var = this.f51932m;
        g(1, cf0Var.f46135r, sparseIntArray);
        g(2, cf0Var.f46137s, sparseIntArray);
        g(3, cf0Var.f46141w, sparseIntArray);
        g(4, cf0Var.f46142x, sparseIntArray);
        g(5, cf0Var.f46143y, sparseIntArray);
        g(6, cf0Var.M, sparseIntArray);
        g(7, cf0Var.O, sparseIntArray);
        g(8, cf0Var.P, sparseIntArray);
        g(9, cf0Var.R, sparseIntArray);
        g(10, cf0Var.S, sparseIntArray);
        g(11, cf0Var.T, sparseIntArray);
        g(12, cf0Var.Q, sparseIntArray);
        g(13, cf0Var.G, sparseIntArray);
    }
}
