package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class u21 implements org.telegram.messenger.c20 {
    public final int f50387a;
    public final SessionsActivity f50388b;

    public u21(SessionsActivity sessionsActivity, int i7) {
        this.f50387a = i7;
        this.f50388b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50387a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f50388b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41957f = connectedbots.connected_bots;
                    if (sessionsActivity.f41953a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41953a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f50388b, (Boolean) obj);
                return;
        }
    }
}
