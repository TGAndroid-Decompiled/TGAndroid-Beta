package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.nr {
    public final int f51726a;
    public final boolean f51727b;
    public final Object f51728c;

    public ri(int i7, Object obj, boolean z10) {
        this.f51726a = i7;
        this.f51728c = obj;
        this.f51727b = z10;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.jc jcVar;
        switch (this.f51726a) {
            case 0:
                bn bnVar = ((ti) this.f51728c).f52410b;
                if (i7 > 0 && bnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(bnVar);
                    if (this.f51727b) {
                        jcVar = org.telegram.ui.Components.jc.H;
                    } else {
                        jcVar = org.telegram.ui.Components.jc.J;
                    }
                    b02.m(jcVar, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            default:
                si siVar = (si) this.f51728c;
                bn bnVar2 = siVar.f52092b.f52410b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = bnVar2.f46173e;
                    TLRPC.User user = bnVar2.f46187f;
                    boolean z10 = this.f51727b;
                    org.telegram.ui.Components.b5.r(bnVar2, true, chat, user, false, false, false, z10, new w0(siVar, z10));
                    return;
                }
                bnVar2.Ta(bnVar2.f46359s4, true);
                return;
        }
    }
}
