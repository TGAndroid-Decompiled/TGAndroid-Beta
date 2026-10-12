package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class u81 implements Utilities.Callback {
    public final int f40566a;
    public final SessionsActivity f40567b;

    public u81(SessionsActivity sessionsActivity, int i10) {
        this.f40566a = i10;
        this.f40567b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40566a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f40567b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f32787a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f32787a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f40567b, (Boolean) obj);
                return;
        }
    }
}
