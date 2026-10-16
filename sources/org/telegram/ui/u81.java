package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class u81 implements Utilities.Callback {
    public final int f40292a;
    public final SessionsActivity f40293b;

    public u81(SessionsActivity sessionsActivity, int i10) {
        this.f40292a = i10;
        this.f40293b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40292a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f40293b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f32489a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f32489a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f40293b, (Boolean) obj);
                return;
        }
    }
}
