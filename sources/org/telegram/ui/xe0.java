package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends v4.o {
    public int f53826b;
    public int f53827c;
    public int d;
    public int f53828e;
    public int f53829f;
    public int f53830g;
    public int h;
    public final SparseIntArray f53831i = new SparseIntArray();
    public final SparseIntArray f53832j = new SparseIntArray();
    public final ArrayList f53833k = new ArrayList();
    public final ArrayList f53834l = new ArrayList();
    public final ff0 f53835m;

    public xe0(ff0 ff0Var) {
        this.f53835m = ff0Var;
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
        int i13 = this.f53827c;
        ff0 ff0Var = this.f53835m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f53828e && i7 < this.f53829f)) && ((i10 >= (i12 = ff0Var.E) && i10 < ff0Var.F) || (i10 >= ff0Var.I && i10 < ff0Var.J))) {
            if (i10 >= i12 && i10 < ff0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f47678j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ff0Var.f47679k0.get(i10 - ff0Var.I);
            }
            int i14 = this.f53827c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53833k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53834l.get(i7 - this.f53828e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f53830g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ff0Var.V) && i10 < ff0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f53831i.get(i7, -1);
        int i17 = this.f53832j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53835m.Y;
    }

    @Override
    public final int e() {
        return this.f53826b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ff0 ff0Var = this.f53835m;
        g(1, ff0Var.f47686r, sparseIntArray);
        g(2, ff0Var.f47688s, sparseIntArray);
        g(3, ff0Var.f47692w, sparseIntArray);
        g(4, ff0Var.f47693x, sparseIntArray);
        g(5, ff0Var.f47694y, sparseIntArray);
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
