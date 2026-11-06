package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends v4.o {
    public int f50387b;
    public int f50388c;
    public int d;
    public int f50389e;
    public int f50390f;
    public int f50391g;
    public int h;
    public final SparseIntArray f50392i = new SparseIntArray();
    public final SparseIntArray f50393j = new SparseIntArray();
    public final ArrayList f50394k = new ArrayList();
    public final ArrayList f50395l = new ArrayList();
    public final cf0 f50396m;

    public ue0(cf0 cf0Var) {
        this.f50396m = cf0Var;
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
        int i13 = this.f50388c;
        cf0 cf0Var = this.f50396m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.f50389e && i7 < this.f50390f)) && ((i10 >= (i12 = cf0Var.D) && i10 < cf0Var.E) || (i10 >= cf0Var.H && i10 < cf0Var.I))) {
            if (i10 >= i12 && i10 < cf0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f44785i0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) cf0Var.f44786j0.get(i10 - cf0Var.H);
            }
            int i14 = this.f50388c;
            if (i7 >= i14 && i7 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f50394k.get(i7 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f50395l.get(i7 - this.f50389e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f50391g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = cf0Var.U) && i10 < cf0Var.V) {
            if (i7 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f50392i.get(i7, -1);
        int i17 = this.f50393j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f50396m.X;
    }

    @Override
    public final int e() {
        return this.f50387b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        cf0 cf0Var = this.f50396m;
        g(1, cf0Var.f44794r, sparseIntArray);
        g(2, cf0Var.f44796s, sparseIntArray);
        g(3, cf0Var.f44799w, sparseIntArray);
        g(4, cf0Var.f44800x, sparseIntArray);
        g(5, cf0Var.f44801y, sparseIntArray);
        g(6, cf0Var.L, sparseIntArray);
        g(7, cf0Var.N, sparseIntArray);
        g(8, cf0Var.O, sparseIntArray);
        g(9, cf0Var.Q, sparseIntArray);
        g(10, cf0Var.R, sparseIntArray);
        g(11, cf0Var.S, sparseIntArray);
        g(12, cf0Var.P, sparseIntArray);
        g(13, cf0Var.F, sparseIntArray);
    }
}
