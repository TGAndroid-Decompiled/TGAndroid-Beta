package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zg0 extends s4.o {
    public int f43744b;
    public int f43745c;
    public int d;
    public int e;
    public int f43746f;
    public int f43747g;
    public int h;
    public final SparseIntArray f43748i = new SparseIntArray();
    public final SparseIntArray f43749j = new SparseIntArray();
    public final ArrayList f43750k = new ArrayList();
    public final ArrayList f43751l = new ArrayList();
    public final ih0 f43752m;

    public zg0(ih0 ih0Var) {
        this.f43752m = ih0Var;
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
        int i14 = this.f43745c;
        ih0 ih0Var = this.f43752m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f43746f)) && ((i11 >= (i13 = ih0Var.f38004y) && i11 < ih0Var.E) || (i11 >= ih0Var.H && i11 < ih0Var.I))) {
            if (i11 >= i13 && i11 < ih0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ih0Var.f37988i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ih0Var.f37989j0.get(i11 - ih0Var.H);
            }
            int i15 = this.f43745c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43750k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f43751l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f43747g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ih0Var.U) && i11 < ih0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f43748i.get(i10, -1);
        int i18 = this.f43749j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f43752m.X;
    }

    @Override
    public final int e() {
        return this.f43744b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ih0 ih0Var = this.f43752m;
        g(1, ih0Var.f37997r, sparseIntArray);
        g(2, ih0Var.f37999s, sparseIntArray);
        g(3, ih0Var.v, sparseIntArray);
        g(4, ih0Var.f38002w, sparseIntArray);
        g(5, ih0Var.f38003x, sparseIntArray);
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
