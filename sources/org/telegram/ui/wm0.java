package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wm0 implements org.telegram.ui.Cells.p5 {
    public final l4 f52934a;

    public wm0(l4 l4Var) {
        this.f52934a = l4Var;
    }

    public final void a() {
        an anVar;
        TLRPC.Chat chat;
        ym0 ym0Var = (ym0) this.f52934a.f48827e;
        if (ym0Var.J && (anVar = ym0Var.V) != null && (chat = anVar.f45173e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && ym0Var.X != 2) {
            org.telegram.ui.Components.t4.r0(ym0Var, org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745303, null), null);
            if (ym0Var.X == 1) {
                ym0Var.X = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        ym0 ym0Var = (ym0) this.f52934a.f48827e;
        org.telegram.messenger.ve veVar = ym0Var.K;
        int i7 = -1;
        int i10 = 1;
        if (veVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26971e.get(intValue);
            boolean containsKey = ym0Var.f53566b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && ym0Var.I > 0 && ym0Var.f53566b.size() >= ym0Var.I) {
                a();
                return;
            }
            if (ym0Var.f53571e && !containsKey) {
                i7 = ym0Var.f53568c.size();
            }
            q5Var.b(i7, z10, true);
            ym0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.g0.v1(ym0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) ym0Var.f53573f.get(intValue);
            boolean containsKey2 = ym0Var.f53566b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && ym0Var.I > 0 && ym0Var.f53566b.size() >= ym0Var.I) {
                a();
                return;
            }
            if (ym0Var.f53571e && !containsKey2) {
                i7 = ym0Var.f53568c.size();
            }
            q5Var.b(i7, z10, true);
            ym0Var.d0(intValue, jfVar);
        }
        if (!z10) {
            i10 = 2;
        }
        ym0Var.n0(i10);
        ym0Var.f53590t0.y();
    }
}
