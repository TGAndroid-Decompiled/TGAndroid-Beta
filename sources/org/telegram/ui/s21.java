package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class s21 implements org.telegram.messenger.y10 {
    public final int f51863a;
    public final SessionsActivity f51864b;

    public s21(SessionsActivity sessionsActivity, int i7) {
        this.f51863a = i7;
        this.f51864b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51863a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f51864b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43787f = connectedbots.connected_bots;
                    if (sessionsActivity.f43783a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43783a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f51864b, (Boolean) obj);
                return;
        }
    }
}
