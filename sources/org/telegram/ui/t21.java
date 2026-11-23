package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class t21 implements org.telegram.messenger.y10 {
    public final int f52190a;
    public final SessionsActivity f52191b;

    public t21(SessionsActivity sessionsActivity, int i7) {
        this.f52190a = i7;
        this.f52191b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52190a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f52191b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43822f = connectedbots.connected_bots;
                    if (sessionsActivity.f43818a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43818a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f52191b, (Boolean) obj);
                return;
        }
    }
}
