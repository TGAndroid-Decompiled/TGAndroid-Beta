package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class r21 implements org.telegram.messenger.c20 {
    public final int f49362a;
    public final SessionsActivity f49363b;

    public r21(SessionsActivity sessionsActivity, int i7) {
        this.f49362a = i7;
        this.f49363b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49362a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49363b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41959f = connectedbots.connected_bots;
                    if (sessionsActivity.f41955a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41955a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f49363b, (Boolean) obj);
                return;
        }
    }
}
