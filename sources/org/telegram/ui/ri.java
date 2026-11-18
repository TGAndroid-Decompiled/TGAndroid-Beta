package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.nr {
    public final int f51616a;
    public final boolean f51617b;
    public final Object f51618c;

    public ri(int i7, Object obj, boolean z10) {
        this.f51616a = i7;
        this.f51618c = obj;
        this.f51617b = z10;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.kc kcVar;
        switch (this.f51616a) {
            case 0:
                bn bnVar = ((ti) this.f51618c).f52293b;
                if (i7 > 0 && bnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                    if (this.f51617b) {
                        kcVar = org.telegram.ui.Components.kc.H;
                    } else {
                        kcVar = org.telegram.ui.Components.kc.J;
                    }
                    b02.m(kcVar, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            default:
                si siVar = (si) this.f51618c;
                bn bnVar2 = siVar.f51999b.f52293b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = bnVar2.f45987e;
                    TLRPC.User user = bnVar2.f46001f;
                    boolean z10 = this.f51617b;
                    org.telegram.ui.Components.b5.r(bnVar2, true, chat, user, false, false, false, z10, new w0(siVar, z10));
                    return;
                }
                bnVar2.Ta(bnVar2.f46173s4, true);
                return;
        }
    }
}
