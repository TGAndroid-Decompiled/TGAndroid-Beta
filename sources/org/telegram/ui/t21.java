package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class t21 implements org.telegram.messenger.c20 {
    public final int f50043a;
    public final SessionsActivity f50044b;

    public t21(SessionsActivity sessionsActivity, int i7) {
        this.f50043a = i7;
        this.f50044b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50043a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f50044b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41966f = connectedbots.connected_bots;
                    if (sessionsActivity.f41962a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41962a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f50044b, (Boolean) obj);
                return;
        }
    }
}
