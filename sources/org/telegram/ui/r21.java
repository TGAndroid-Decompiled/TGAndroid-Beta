package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class r21 implements org.telegram.messenger.c20 {
    public final int f49359a;
    public final SessionsActivity f49360b;

    public r21(SessionsActivity sessionsActivity, int i7) {
        this.f49359a = i7;
        this.f49360b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49359a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49360b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41955f = connectedbots.connected_bots;
                    if (sessionsActivity.f41951a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41951a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f49360b, (Boolean) obj);
                return;
        }
    }
}
