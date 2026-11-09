package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.sr {
    public final int f49919a;
    public final boolean f49920b;
    public final Object f49921c;

    public si(int i7, Object obj, boolean z9) {
        this.f49919a = i7;
        this.f49921c = obj;
        this.f49920b = z9;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.gc gcVar;
        switch (this.f49919a) {
            case 0:
                cn cnVar = ((ui) this.f49921c).f50413b;
                if (i7 > 0 && cnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar);
                    if (this.f49920b) {
                        gcVar = org.telegram.ui.Components.gc.G;
                    } else {
                        gcVar = org.telegram.ui.Components.gc.I;
                    }
                    a02.m(gcVar, i7, 0, 0, cnVar.f44709za).j();
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f49921c;
                cn cnVar2 = tiVar.f50189b.f50413b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = cnVar2.f44432e;
                    TLRPC.User user = cnVar2.f44446f;
                    boolean z9 = this.f49920b;
                    org.telegram.ui.Components.v4.r(cnVar2, true, chat, user, false, false, false, z9, new w0(tiVar, z9));
                    return;
                }
                cnVar2.Sa(cnVar2.f44602r4, true);
                return;
        }
    }
}
