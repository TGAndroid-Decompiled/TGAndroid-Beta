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
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f53556c.size();
    }

    @Override
    public final int d(int i7) {
        return ((w5) this.d.f53556c.get(i7)).f56599a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String m10;
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.f53556c;
        if (((w5) arrayList.get(i7)).f56599a == 2) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) e1Var.f59111a;
            org.telegram.messenger.t2 t2Var = ((w5) arrayList.get(i7)).f52941c;
            TLObject g22 = x5Var.getMessagesController().g2(t2Var.f26911a);
            boolean z10 = false;
            String str = null;
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                if (user.self) {
                    m10 = org.telegram.messenger.hd.N0(2131745705, null);
                } else {
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            }
            raVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.v2.f(t2Var.f26912b);
            if (i7 == arrayList.size() - 1 || ((w5) arrayList.get(i7 + 1)).f56599a == 2) {
                z10 = true;
            }
            raVar.d(g22, str, f10, z10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var2.k(org.telegram.messenger.hd.N0(2131747721, null), false);
                        n8Var2.g(-1, org.telegram.ui.ActionBar.m6.f29568p7);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var2, null);
                        n8Var = n8Var2;
                    }
                } else {
                    n8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                }
            } else {
                View raVar = new org.telegram.ui.Cells.ra(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, raVar, null);
                view = raVar;
            }
            return i5.c.q(view, view, -1, -2);
        }
        org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
        n8Var3.o(2131232101, org.telegram.messenger.hd.N0(2131747729, null), true);
        n8Var3.g(org.telegram.ui.ActionBar.m6.f29682v6, org.telegram.ui.ActionBar.m6.f29663u6);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var3, null);
        n8Var = n8Var3;
        view = n8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
