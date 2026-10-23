package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zg0 extends s4.o {
    public int f43748b;
    public int f43749c;
    public int d;
    public int e;
    public int f43750f;
    public int f43751g;
    public int h;
    public final SparseIntArray f43752i = new SparseIntArray();
    public final SparseIntArray f43753j = new SparseIntArray();
    public final ArrayList f43754k = new ArrayList();
    public final ArrayList f43755l = new ArrayList();
    public final ih0 f43756m;

    public zg0(ih0 ih0Var) {
        this.f43756m = ih0Var;
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
        int i14 = this.f43749c;
        ih0 ih0Var = this.f43756m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f43750f)) && ((i11 >= (i13 = ih0Var.f38009y) && i11 < ih0Var.E) || (i11 >= ih0Var.H && i11 < ih0Var.I))) {
            if (i11 >= i13 && i11 < ih0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ih0Var.f37993i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ih0Var.f37994j0.get(i11 - ih0Var.H);
            }
            int i15 = this.f43749c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43754k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43755l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f43751g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ih0Var.U) && i11 < ih0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f43752i.get(i10, -1);
        int i18 = this.f43753j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f43756m.X;
    }

    @Override
    public final int e() {
        return this.f43748b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ih0 ih0Var = this.f43756m;
        g(1, ih0Var.f38002r, sparseIntArray);
        g(2, ih0Var.f38004s, sparseIntArray);
        g(3, ih0Var.v, sparseIntArray);
        g(4, ih0Var.f38007w, sparseIntArray);
        g(5, ih0Var.f38008x, sparseIntArray);
        g(6, ih0Var.L, sparseIntArray);
        g(7, ih0Var.N, sparseIntArray);
        g(8, ih0Var.O, sparseIntArray);
        g(9, ih0Var.Q, sparseIntArray);
        g(10, ih0Var.R, sparseIntArray);
        g(11, ih0Var.S, sparseIntArray);
        g(12, ih0Var.P, sparseIntArray);
        g(13, ih0Var.F, sparseIntArray);
    }
}
