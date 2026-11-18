package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v5 extends rg.b {
    public final x5 d;

    public v5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f53638c.size();
    }

    @Override
    public final int d(int i7) {
        return ((w5) this.d.f53638c.get(i7)).f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String m10;
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.f53638c;
        if (((w5) arrayList.get(i7)).f56589a == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) f1Var.f59122a;
            org.telegram.messenger.t2 t2Var = ((w5) arrayList.get(i7)).f52938c;
            TLObject g22 = x5Var.getMessagesController().g2(t2Var.f26934a);
            boolean z10 = false;
            String str = null;
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                if (user.self) {
                    m10 = org.telegram.messenger.gd.M0(2131745706, null);
                } else {
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            }
            qaVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.v2.f(t2Var.f26935b);
            if (i7 == arrayList.size() - 1 || ((w5) arrayList.get(i7 + 1)).f56589a == 2) {
                z10 = true;
            }
            qaVar.d(g22, str, f10, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29617p7);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                } else {
                    m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                }
            } else {
                View qaVar = new org.telegram.ui.Cells.qa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, qaVar, null);
                view = qaVar;
            }
            return i5.c.q(view, view, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var3.o(2131232101, org.telegram.messenger.gd.M0(2131747730, null), true);
        m8Var3.g(org.telegram.ui.ActionBar.n6.f29731v6, org.telegram.ui.ActionBar.n6.f29712u6);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var3, null);
        m8Var = m8Var3;
        view = m8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
