package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vm0 implements org.telegram.ui.Cells.p5 {
    public final l4 f50702a;

    public vm0(l4 l4Var) {
        this.f50702a = l4Var;
    }

    public final void a() {
        an anVar;
        TLRPC.Chat chat;
        xm0 xm0Var = (xm0) this.f50702a.f47410e;
        if (xm0Var.I && (anVar = xm0Var.U) != null && (chat = anVar.f43777e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && xm0Var.W != 2) {
            org.telegram.ui.Components.v4.r0(xm0Var, org.telegram.messenger.id.M0(2131745313, null), org.telegram.messenger.id.M0(2131745306, null), null);
            if (xm0Var.W == 1) {
                xm0Var.W = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z9;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        xm0 xm0Var = (xm0) this.f50702a.f47410e;
        org.telegram.messenger.we weVar = xm0Var.J;
        int i7 = -1;
        int i10 = 1;
        if (weVar != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(intValue);
            boolean containsKey = xm0Var.f51905b.containsKey(Integer.valueOf(gfVar.C));
            z9 = !containsKey;
            if (!containsKey && xm0Var.H > 0 && xm0Var.f51905b.size() >= xm0Var.H) {
                a();
                return;
            }
            if (xm0Var.f51910e && !containsKey) {
                i7 = xm0Var.f51907c.size();
            }
            q5Var.b(i7, z9, true);
            xm0Var.d0(intValue, gfVar);
        } else {
            org.telegram.messenger.g0.v1(xm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f51912f.get(intValue);
            boolean containsKey2 = xm0Var.f51905b.containsKey(kfVar.B);
            z9 = !containsKey2;
            if (!containsKey2 && xm0Var.H > 0 && xm0Var.f51905b.size() >= xm0Var.H) {
                a();
                return;
            }
            if (xm0Var.f51910e && !containsKey2) {
                i7 = xm0Var.f51907c.size();
            }
            q5Var.b(i7, z9, true);
            xm0Var.d0(intValue, kfVar);
        }
        if (!z9) {
            i10 = 2;
        }
        xm0Var.n0(i10);
        xm0Var.f51928s0.A();
    }
}
