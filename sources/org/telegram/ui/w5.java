package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w5 extends rg.b {
    public final y5 d;

    public w5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f53419c.size();
    }

    @Override
    public final int d(int i7) {
        return ((x5) this.d.f53419c.get(i7)).f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String m10;
        y5 y5Var = this.d;
        ArrayList arrayList = y5Var.f53419c;
        if (((x5) arrayList.get(i7)).f56015a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) e1Var.f58535a;
            org.telegram.messenger.s2 s2Var = ((x5) arrayList.get(i7)).f53096c;
            TLObject e22 = y5Var.getMessagesController().e2(s2Var.f26401a);
            boolean z10 = false;
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                if (user.self) {
                    m10 = org.telegram.messenger.hd.M0(2131745901, null);
                } else {
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.u2.f(s2Var.f26402b);
            if (i7 == arrayList.size() - 1 || ((x5) arrayList.get(i7 + 1)).f56015a == 2) {
                z10 = true;
            }
            paVar.d(e22, str, f10, z10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.l8 l8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var2.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                        l8Var2.g(-1, org.telegram.ui.ActionBar.j6.f29070p7);
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var2, null);
                        l8Var = l8Var2;
                    }
                } else {
                    l8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
                }
            } else {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, paVar, null);
                view = paVar;
            }
            return i5.c.q(view, view, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var3.o(2131232100, org.telegram.messenger.hd.M0(2131747923, null), true);
        l8Var3.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var3, null);
        l8Var = l8Var3;
        view = l8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
