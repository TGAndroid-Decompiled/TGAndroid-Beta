package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class r21 implements org.telegram.messenger.c20 {
    public final int f49340a;
    public final SessionsActivity f49341b;

    public r21(SessionsActivity sessionsActivity, int i7) {
        this.f49340a = i7;
        this.f49341b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49340a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49341b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41931f = connectedbots.connected_bots;
                    if (sessionsActivity.f41927a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41927a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f49341b, (Boolean) obj);
                return;
        }
    }
}
