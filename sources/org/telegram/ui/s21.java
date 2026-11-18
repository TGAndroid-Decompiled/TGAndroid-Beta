package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class s21 implements org.telegram.messenger.x10 {
    public final int f51861a;
    public final SessionsActivity f51862b;

    public s21(SessionsActivity sessionsActivity, int i7) {
        this.f51861a = i7;
        this.f51862b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51861a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f51862b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43777f = connectedbots.connected_bots;
                    if (sessionsActivity.f43773a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43773a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f51862b, (Boolean) obj);
                return;
        }
    }
}
