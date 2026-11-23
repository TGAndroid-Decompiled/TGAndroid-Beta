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
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f54226c.size();
    }

    @Override
    public final int d(int i7) {
        return ((x5) this.d.f54226c.get(i7)).f56712a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String m10;
        y5 y5Var = this.d;
        ArrayList arrayList = y5Var.f54226c;
        if (((x5) arrayList.get(i7)).f56712a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) f1Var.f59245a;
            org.telegram.messenger.t2 t2Var = ((x5) arrayList.get(i7)).f53856c;
            TLObject g22 = y5Var.getMessagesController().g2(t2Var.f27031a);
            boolean z10 = false;
            String str = null;
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                if (user.self) {
                    m10 = org.telegram.messenger.gd.N0(2131745705, null);
                } else {
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
                str = m10;
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            }
            saVar.setSelfAsSavedMessages(true);
            String f10 = org.telegram.messenger.v2.f(t2Var.f27032b);
            if (i7 == arrayList.size() - 1 || ((x5) arrayList.get(i7 + 1)).f56712a == 2) {
                z10 = true;
            }
            saVar.d(g22, str, f10, z10);
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
                        m8Var2.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29672p7);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                } else {
                    m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                }
            } else {
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, saVar, null);
                view = saVar;
            }
            return i5.c.q(view, view, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var3.o(2131232104, org.telegram.messenger.gd.N0(2131747729, null), true);
        m8Var3.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var3, null);
        m8Var = m8Var3;
        view = m8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
