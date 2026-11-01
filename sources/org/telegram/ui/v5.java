package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v5 extends hg.c {
    public final x5 d;

    public v5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43245c.size();
    }

    @Override
    public final int d(int i10) {
        return ((w5) this.d.f43245c.get(i10)).f7681a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String m10;
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.f43245c;
        if (((w5) arrayList.get(i10)).f7681a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) c1Var.f47909a;
            org.telegram.messenger.w2 w2Var = ((w5) arrayList.get(i10)).f42673c;
            TLObject d22 = x5Var.getMessagesController().d2(w2Var.f18968a);
            boolean z10 = false;
            String str = null;
            if (d22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) d22;
                if (user.self) {
                    m10 = org.telegram.messenger.dd.L0(2131745918, null);
                } else {
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (d22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) d22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            String f7 = org.telegram.messenger.y2.f(w2Var.f18969b);
            if (i10 == arrayList.size() - 1 || ((w5) arrayList.get(i10 + 1)).f7681a == 2) {
                z10 = true;
            }
            paVar.d(d22, str, f7, z10);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var2.k(org.telegram.messenger.dd.L0(2131747931, null), false);
                        p8Var2.g(-1, org.telegram.ui.ActionBar.t6.f21154p7);
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var2, null);
                        p8Var = p8Var2;
                    }
                } else {
                    p8Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                }
            } else {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, paVar, null);
                view = paVar;
            }
            return sc.e.o(view, view, -1, -2);
        }
        org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
        p8Var3.o(2131232098, org.telegram.messenger.dd.L0(2131747939, null), true);
        p8Var3.g(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var3, null);
        p8Var = p8Var3;
        view = p8Var;
        return sc.e.o(view, view, -1, -2);
    }
}
