package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.or {
    public final int f51584a;
    public final boolean f51585b;
    public final Object f51586c;

    public ri(int i7, Object obj, boolean z10) {
        this.f51584a = i7;
        this.f51586c = obj;
        this.f51585b = z10;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.kc kcVar;
        switch (this.f51584a) {
            case 0:
                bn bnVar = ((ti) this.f51586c).f52338b;
                if (i7 > 0 && bnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                    if (this.f51585b) {
                        kcVar = org.telegram.ui.Components.kc.H;
                    } else {
                        kcVar = org.telegram.ui.Components.kc.J;
                    }
                    b02.m(kcVar, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            default:
                si siVar = (si) this.f51586c;
                bn bnVar2 = siVar.f52050b.f52338b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = bnVar2.f46005e;
                    TLRPC.User user = bnVar2.f46019f;
                    boolean z10 = this.f51585b;
                    org.telegram.ui.Components.c5.r(bnVar2, true, chat, user, false, false, false, z10, new w0(siVar, z10));
                    return;
                }
                bnVar2.Ta(bnVar2.f46191s4, true);
                return;
        }
    }
}
