package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.sr {
    public final int f49856a;
    public final boolean f49857b;
    public final Object f49858c;

    public si(int i7, Object obj, boolean z9) {
        this.f49856a = i7;
        this.f49858c = obj;
        this.f49857b = z9;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.fc fcVar;
        switch (this.f49856a) {
            case 0:
                cn cnVar = ((ui) this.f49858c).f50508b;
                if (i7 > 0 && cnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(cnVar);
                    if (this.f49857b) {
                        fcVar = org.telegram.ui.Components.fc.G;
                    } else {
                        fcVar = org.telegram.ui.Components.fc.I;
                    }
                    a02.m(fcVar, i7, 0, 0, cnVar.f44750za).j();
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f49858c;
                cn cnVar2 = tiVar.f50288b.f50508b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = cnVar2.f44473e;
                    TLRPC.User user = cnVar2.f44487f;
                    boolean z9 = this.f49857b;
                    org.telegram.ui.Components.u4.r(cnVar2, true, chat, user, false, false, false, z9, new w0(tiVar, z9));
                    return;
                }
                cnVar2.Sa(cnVar2.f44643r4, true);
                return;
        }
    }
}
