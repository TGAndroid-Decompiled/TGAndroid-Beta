package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class u71 implements Utilities.Callback {
    public final int f38871a;
    public final SessionsActivity f38872b;

    public u71(SessionsActivity sessionsActivity, int i10) {
        this.f38871a = i10;
        this.f38872b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38871a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f38872b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f32281a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f32281a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f38872b, (Boolean) obj);
                return;
        }
    }
}
