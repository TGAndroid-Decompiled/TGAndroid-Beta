package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg0 extends f2.q {
    public int f44869b;
    public int f44870c;
    public int d;
    public int f44871e;
    public int f44872f;
    public int f44873g;
    public int h;
    public final SparseIntArray f44874i = new SparseIntArray();
    public final SparseIntArray f44875j = new SparseIntArray();
    public final ArrayList f44876k = new ArrayList();
    public final ArrayList f44877l = new ArrayList();
    public final hh0 f44878m;

    public yg0(hh0 hh0Var) {
        this.f44878m = hh0Var;
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
        int i14 = this.f44870c;
        hh0 hh0Var = this.f44878m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f44871e && i10 < this.f44872f)) && ((i11 >= (i13 = hh0Var.f38937y) && i11 < hh0Var.A) || (i11 >= hh0Var.D && i11 < hh0Var.E))) {
            if (i11 >= i13 && i11 < hh0Var.A) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f38920e0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f38922f0.get(i11 - hh0Var.D);
            }
            int i15 = this.f44870c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f44876k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f44877l.get(i10 - this.f44871e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f44873g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = hh0Var.Q) && i11 < hh0Var.R) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f44874i.get(i10, -1);
        int i18 = this.f44875j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f44878m.T;
    }

    @Override
    public final int e() {
        return this.f44869b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hh0 hh0Var = this.f44878m;
        g(1, hh0Var.f38933r, sparseIntArray);
        g(2, hh0Var.f38934s, sparseIntArray);
        g(3, hh0Var.v, sparseIntArray);
        g(4, hh0Var.f38935w, sparseIntArray);
        g(5, hh0Var.f38936x, sparseIntArray);
        g(6, hh0Var.H, sparseIntArray);
        g(7, hh0Var.J, sparseIntArray);
        g(8, hh0Var.K, sparseIntArray);
        g(9, hh0Var.M, sparseIntArray);
        g(10, hh0Var.N, sparseIntArray);
        g(11, hh0Var.O, sparseIntArray);
        g(12, hh0Var.L, sparseIntArray);
        g(13, hh0Var.B, sparseIntArray);
    }
}
