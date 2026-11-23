package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class r21 implements org.telegram.messenger.w10 {
    public final int f51595a;
    public final SessionsActivity f51596b;

    public r21(SessionsActivity sessionsActivity, int i7) {
        this.f51595a = i7;
        this.f51596b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51595a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f51596b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43903f = connectedbots.connected_bots;
                    if (sessionsActivity.f43899a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43899a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f51596b, (Boolean) obj);
                return;
        }
    }
}
