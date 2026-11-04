package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qm0 implements org.telegram.ui.Cells.p5 {
    public final n4 f48915a;

    public qm0(n4 n4Var) {
        this.f48915a = n4Var;
    }

    public final void a() {
        wm wmVar;
        TLRPC.Chat chat;
        sm0 sm0Var = (sm0) this.f48915a.f47865e;
        if (sm0Var.J && (wmVar = sm0Var.V) != null && (chat = wmVar.f51292e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && sm0Var.X != 2) {
            org.telegram.ui.Components.t4.t0(sm0Var, org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745313, null), null);
            if (sm0Var.X == 1) {
                sm0Var.X = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        sm0 sm0Var = (sm0) this.f48915a.f47865e;
        org.telegram.messenger.pe peVar = sm0Var.K;
        int i3 = -1;
        int i10 = 1;
        if (peVar != null) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.f24738e.get(intValue);
            boolean containsKey = sm0Var.f49540b.containsKey(Integer.valueOf(yeVar.C));
            z10 = !containsKey;
            if (!containsKey && sm0Var.I > 0 && sm0Var.f49540b.size() >= sm0Var.I) {
                a();
                return;
            }
            if (sm0Var.f49545e && !containsKey) {
                i3 = sm0Var.f49542c.size();
            }
            q5Var.b(i3, z10, true);
            sm0Var.d0(intValue, yeVar);
        } else {
            org.telegram.messenger.g0.v1(sm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f49547f.get(intValue);
            boolean containsKey2 = sm0Var.f49540b.containsKey(bfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && sm0Var.I > 0 && sm0Var.f49540b.size() >= sm0Var.I) {
                a();
                return;
            }
            if (sm0Var.f49545e && !containsKey2) {
                i3 = sm0Var.f49542c.size();
            }
            q5Var.b(i3, z10, true);
            sm0Var.d0(intValue, bfVar);
        }
        if (!z10) {
            i10 = 2;
        }
        sm0Var.n0(i10);
        sm0Var.f49564t0.m();
    }
}
