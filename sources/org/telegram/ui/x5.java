package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 extends sg.b {
    public final z5 d;

    public x5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 1 || i3 == 2 || i3 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f52535c.size();
    }

    @Override
    public final int d(int i3) {
        return ((y5) this.d.f52535c.get(i3)).f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String m10;
        z5 z5Var = this.d;
        ArrayList arrayList = z5Var.f52535c;
        if (((y5) arrayList.get(i3)).f54715a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) d1Var.f55540a;
            org.telegram.messenger.s2 s2Var = ((y5) arrayList.get(i3)).f52193c;
            TLObject e22 = z5Var.getMessagesController().e2(s2Var.f25268a);
            boolean z10 = false;
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                if (user.self) {
                    m10 = org.telegram.messenger.bd.M0(2131745911, null);
                } else {
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.u2.f(s2Var.f25269b);
            if (i3 == arrayList.size() - 1 || ((y5) arrayList.get(i3 + 1)).f54715a == 2) {
                z10 = true;
            }
            paVar.d(e22, str, f10, z10);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.l8 l8Var;
        View view = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var2.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                        l8Var2.g(-1, org.telegram.ui.ActionBar.k6.f28102p7);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var2, null);
                        l8Var = l8Var2;
                    }
                } else {
                    l8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                }
            } else {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, paVar, null);
                view = paVar;
            }
            return k2.p1.p(view, view, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var3.o(2131232099, org.telegram.messenger.bd.M0(2131747931, null), true);
        l8Var3.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var3, null);
        l8Var = l8Var3;
        view = l8Var;
        return k2.p1.p(view, view, -1, -2);
    }
}
