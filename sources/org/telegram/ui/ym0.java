package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ym0 implements org.telegram.ui.Cells.p5 {
    public final l4 f52069a;

    public ym0(l4 l4Var) {
        this.f52069a = l4Var;
    }

    public final void a() {
        cn cnVar;
        TLRPC.Chat chat;
        an0 an0Var = (an0) this.f52069a.f47512e;
        if (an0Var.I && (cnVar = an0Var.U) != null && (chat = cnVar.f44473e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && an0Var.W != 2) {
            org.telegram.ui.Components.u4.r0(an0Var, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null);
            if (an0Var.W == 1) {
                an0Var.W = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z9;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        an0 an0Var = (an0) this.f52069a.f47512e;
        org.telegram.messenger.we weVar = an0Var.J;
        int i7 = -1;
        int i10 = 1;
        if (weVar != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26304e.get(intValue);
            boolean containsKey = an0Var.f43750b.containsKey(Integer.valueOf(gfVar.C));
            z9 = !containsKey;
            if (!containsKey && an0Var.H > 0 && an0Var.f43750b.size() >= an0Var.H) {
                a();
                return;
            }
            if (an0Var.f43755e && !containsKey) {
                i7 = an0Var.f43752c.size();
            }
            q5Var.b(i7, z9, true);
            an0Var.d0(intValue, gfVar);
        } else {
            org.telegram.messenger.g0.v1(an0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) an0Var.f43757f.get(intValue);
            boolean containsKey2 = an0Var.f43750b.containsKey(kfVar.B);
            z9 = !containsKey2;
            if (!containsKey2 && an0Var.H > 0 && an0Var.f43750b.size() >= an0Var.H) {
                a();
                return;
            }
            if (an0Var.f43755e && !containsKey2) {
                i7 = an0Var.f43752c.size();
            }
            q5Var.b(i7, z9, true);
            an0Var.d0(intValue, kfVar);
        }
        if (!z9) {
            i10 = 2;
        }
        an0Var.n0(i10);
        an0Var.f43773s0.A();
    }
}
