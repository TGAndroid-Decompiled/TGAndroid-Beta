package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xm0 implements org.telegram.ui.Cells.p5 {
    public final l4 f51692a;

    public xm0(l4 l4Var) {
        this.f51692a = l4Var;
    }

    public final void a() {
        cn cnVar;
        TLRPC.Chat chat;
        zm0 zm0Var = (zm0) this.f51692a.f47458e;
        if (zm0Var.I && (cnVar = zm0Var.U) != null && (chat = cnVar.f44432e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && zm0Var.W != 2) {
            org.telegram.ui.Components.v4.r0(zm0Var, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null);
            if (zm0Var.W == 1) {
                zm0Var.W = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z9;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        zm0 zm0Var = (zm0) this.f51692a.f47458e;
        org.telegram.messenger.we weVar = zm0Var.J;
        int i7 = -1;
        int i10 = 1;
        if (weVar != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(intValue);
            boolean containsKey = zm0Var.f52600b.containsKey(Integer.valueOf(gfVar.C));
            z9 = !containsKey;
            if (!containsKey && zm0Var.H > 0 && zm0Var.f52600b.size() >= zm0Var.H) {
                a();
                return;
            }
            if (zm0Var.f52605e && !containsKey) {
                i7 = zm0Var.f52602c.size();
            }
            q5Var.b(i7, z9, true);
            zm0Var.d0(intValue, gfVar);
        } else {
            org.telegram.messenger.g0.v1(zm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) zm0Var.f52607f.get(intValue);
            boolean containsKey2 = zm0Var.f52600b.containsKey(kfVar.B);
            z9 = !containsKey2;
            if (!containsKey2 && zm0Var.H > 0 && zm0Var.f52600b.size() >= zm0Var.H) {
                a();
                return;
            }
            if (zm0Var.f52605e && !containsKey2) {
                i7 = zm0Var.f52602c.size();
            }
            q5Var.b(i7, z9, true);
            zm0Var.d0(intValue, kfVar);
        }
        if (!z9) {
            i10 = 2;
        }
        zm0Var.n0(i10);
        zm0Var.f52623s0.A();
    }
}
