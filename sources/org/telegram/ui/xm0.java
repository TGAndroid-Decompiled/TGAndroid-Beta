package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xm0 implements org.telegram.ui.Cells.p5 {
    public final l4 f53267a;

    public xm0(l4 l4Var) {
        this.f53267a = l4Var;
    }

    public final void a() {
        an anVar;
        TLRPC.Chat chat;
        zm0 zm0Var = (zm0) this.f53267a.f48823e;
        if (zm0Var.J && (anVar = zm0Var.V) != null && (chat = anVar.f45172e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && zm0Var.X != 2) {
            org.telegram.ui.Components.t4.r0(zm0Var, org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745303, null), null);
            if (zm0Var.X == 1) {
                zm0Var.X = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        zm0 zm0Var = (zm0) this.f53267a.f48823e;
        org.telegram.messenger.ve veVar = zm0Var.K;
        int i7 = -1;
        int i10 = 1;
        if (veVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26972e.get(intValue);
            boolean containsKey = zm0Var.f53957b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && zm0Var.I > 0 && zm0Var.f53957b.size() >= zm0Var.I) {
                a();
                return;
            }
            if (zm0Var.f53962e && !containsKey) {
                i7 = zm0Var.f53959c.size();
            }
            q5Var.b(i7, z10, true);
            zm0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.g0.v1(zm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) zm0Var.f53964f.get(intValue);
            boolean containsKey2 = zm0Var.f53957b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && zm0Var.I > 0 && zm0Var.f53957b.size() >= zm0Var.I) {
                a();
                return;
            }
            if (zm0Var.f53962e && !containsKey2) {
                i7 = zm0Var.f53959c.size();
            }
            q5Var.b(i7, z10, true);
            zm0Var.d0(intValue, jfVar);
        }
        if (!z10) {
            i10 = 2;
        }
        zm0Var.n0(i10);
        zm0Var.f53981t0.y();
    }
}
