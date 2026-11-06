package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class r21 implements org.telegram.messenger.c20 {
    public final int f49360a;
    public final SessionsActivity f49361b;

    public r21(SessionsActivity sessionsActivity, int i7) {
        this.f49360a = i7;
        this.f49361b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49360a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49361b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41956f = connectedbots.connected_bots;
                    if (sessionsActivity.f41952a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41952a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f49361b, (Boolean) obj);
                return;
        }
    }
}
