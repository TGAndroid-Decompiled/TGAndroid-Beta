package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class v71 implements Utilities.Callback {
    public final int f42150a;
    public final SessionsActivity f42151b;

    public v71(SessionsActivity sessionsActivity, int i10) {
        this.f42150a = i10;
        this.f42151b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42150a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f42151b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34817a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34817a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f42151b, (Boolean) obj);
                return;
        }
    }
}
