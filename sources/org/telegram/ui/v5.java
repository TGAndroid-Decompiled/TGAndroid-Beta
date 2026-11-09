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
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f51549c.size();
    }

    @Override
    public final int d(int i7) {
        return ((w5) this.d.f51549c.get(i7)).f54544a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String m10;
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.f51549c;
        if (((w5) arrayList.get(i7)).f54544a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) d1Var.f57056a;
            org.telegram.messenger.s2 s2Var = ((w5) arrayList.get(i7)).f50868c;
            TLObject e22 = x5Var.getMessagesController().e2(s2Var.f25407a);
            boolean z9 = false;
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                if (user.self) {
                    m10 = org.telegram.messenger.id.M0(2131745901, null);
                } else {
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.u2.f(s2Var.f25408b);
            if (i7 == arrayList.size() - 1 || ((w5) arrayList.get(i7 + 1)).f54544a == 2) {
                z9 = true;
            }
            paVar.d(e22, str, f10, z9);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.k(org.telegram.messenger.id.M0(2131747915, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.l6.f28086p7);
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                } else {
                    m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                }
            } else {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, paVar, null);
                view = paVar;
            }
            return jg.g.r(view, view, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var3.o(2131232099, org.telegram.messenger.id.M0(2131747923, null), true);
        m8Var3.g(org.telegram.ui.ActionBar.l6.f28200v6, org.telegram.ui.ActionBar.l6.f28181u6);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var3, null);
        m8Var = m8Var3;
        view = m8Var;
        return jg.g.r(view, view, -1, -2);
    }
}
