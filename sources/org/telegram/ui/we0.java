package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class we0 extends v4.p {
    public int f53308b;
    public int f53309c;
    public int d;
    public int f53310e;
    public int f53311f;
    public int f53312g;
    public int h;
    public final SparseIntArray f53313i = new SparseIntArray();
    public final SparseIntArray f53314j = new SparseIntArray();
    public final ArrayList f53315k = new ArrayList();
    public final ArrayList f53316l = new ArrayList();
    public final ef0 f53317m;

    public we0(ef0 ef0Var) {
        this.f53317m = ef0Var;
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
        int i13 = this.f53309c;
        ef0 ef0Var = this.f53317m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f53310e && i7 < this.f53311f)) && ((i10 >= (i12 = ef0Var.E) && i10 < ef0Var.F) || (i10 >= ef0Var.I && i10 < ef0Var.J))) {
            if (i10 >= i12 && i10 < ef0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.f47530j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.f47531k0.get(i10 - ef0Var.I);
            }
            int i14 = this.f53309c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53315k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f53316l.get(i7 - this.f53310e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f53312g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ef0Var.V) && i10 < ef0Var.W) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f53313i.get(i7, -1);
        int i17 = this.f53314j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53317m.Y;
    }

    @Override
    public final int e() {
        return this.f53308b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ef0 ef0Var = this.f53317m;
        g(1, ef0Var.f47538r, sparseIntArray);
        g(2, ef0Var.f47540s, sparseIntArray);
        g(3, ef0Var.f47544w, sparseIntArray);
        g(4, ef0Var.f47545x, sparseIntArray);
        g(5, ef0Var.f47546y, sparseIntArray);
        g(6, ef0Var.M, sparseIntArray);
        g(7, ef0Var.O, sparseIntArray);
        g(8, ef0Var.P, sparseIntArray);
        g(9, ef0Var.R, sparseIntArray);
        g(10, ef0Var.S, sparseIntArray);
        g(11, ef0Var.T, sparseIntArray);
        g(12, ef0Var.Q, sparseIntArray);
        g(13, ef0Var.G, sparseIntArray);
    }
}
