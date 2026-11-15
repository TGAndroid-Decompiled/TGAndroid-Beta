package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends v4.o {
    public int f51922b;
    public int f51923c;
    public int d;
    public int f51924e;
    public int f51925f;
    public int f51926g;
    public int h;
    public final SparseIntArray f51927i = new SparseIntArray();
    public final SparseIntArray f51928j = new SparseIntArray();
    public final ArrayList f51929k = new ArrayList();
    public final ArrayList f51930l = new ArrayList();
    public final cf0 f51931m;

    public ue0(cf0 cf0Var) {
        this.f51931m = cf0Var;
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
        int i13 = this.f51923c;
        cf0 cf0Var = this.f51931m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f51924e && i7 < this.f51925f)) && ((i10 >= (i12 = cf0Var.E) && i10 < cf0Var.F) || (i10 >= cf0Var.I && i10 < cf0Var.J))) {
            if (i10 >= i12 && i10 < cf0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f46138j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f46139k0.get(i10 - cf0Var.I);
            }
            int i14 = this.f51923c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51929k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f51930l.get(i7 - this.f51924e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f51926g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = cf0Var.V) && i10 < cf0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f51927i.get(i7, -1);
        int i17 = this.f51928j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f51931m.Y;
    }

    @Override
    public final int e() {
        return this.f51922b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        cf0 cf0Var = this.f51931m;
        g(1, cf0Var.f46146r, sparseIntArray);
        g(2, cf0Var.f46148s, sparseIntArray);
        g(3, cf0Var.f46152w, sparseIntArray);
        g(4, cf0Var.f46153x, sparseIntArray);
        g(5, cf0Var.f46154y, sparseIntArray);
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
