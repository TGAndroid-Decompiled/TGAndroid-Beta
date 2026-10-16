package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uh0 extends s4.o {
    public int f40404b;
    public int f40405c;
    public int d;
    public int e;
    public int f40406f;
    public int f40407g;
    public int h;
    public final SparseIntArray f40408i = new SparseIntArray();
    public final SparseIntArray f40409j = new SparseIntArray();
    public final ArrayList f40410k = new ArrayList();
    public final ArrayList f40411l = new ArrayList();
    public final di0 f40412m;

    public uh0(di0 di0Var) {
        this.f40412m = di0Var;
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
        int i14 = this.f40405c;
        di0 di0Var = this.f40412m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f40406f)) && ((i11 >= (i13 = di0Var.f35058y) && i11 < di0Var.E) || (i11 >= di0Var.H && i11 < di0Var.I))) {
            if (i11 >= i13 && i11 < di0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) di0Var.f35042i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) di0Var.f35043j0.get(i11 - di0Var.H);
            }
            int i15 = this.f40405c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f40410k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f40411l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f40407g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = di0Var.U) && i11 < di0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f40408i.get(i10, -1);
        int i18 = this.f40409j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f40412m.X;
    }

    @Override
    public final int e() {
        return this.f40404b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        di0 di0Var = this.f40412m;
        g(1, di0Var.f35051r, sparseIntArray);
        g(2, di0Var.f35053s, sparseIntArray);
        g(3, di0Var.v, sparseIntArray);
        g(4, di0Var.f35056w, sparseIntArray);
        g(5, di0Var.f35057x, sparseIntArray);
        g(6, di0Var.L, sparseIntArray);
        g(7, di0Var.N, sparseIntArray);
        g(8, di0Var.O, sparseIntArray);
        g(9, di0Var.Q, sparseIntArray);
        g(10, di0Var.R, sparseIntArray);
        g(11, di0Var.S, sparseIntArray);
        g(12, di0Var.P, sparseIntArray);
        g(13, di0Var.F, sparseIntArray);
    }
}
