package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class t21 implements org.telegram.messenger.x10 {
    public final int f52186a;
    public final SessionsActivity f52187b;

    public t21(SessionsActivity sessionsActivity, int i7) {
        this.f52186a = i7;
        this.f52187b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52186a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f52187b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43818f = connectedbots.connected_bots;
                    if (sessionsActivity.f43814a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43814a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f52187b, (Boolean) obj);
                return;
        }
    }
}
