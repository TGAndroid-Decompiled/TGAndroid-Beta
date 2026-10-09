package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final z4 f44239a;

    public y4(z4 z4Var) {
        this.f44239a = z4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z4 z4Var = this.f44239a;
        if (z4Var.f44481g && i10 == z4Var.f44479e) {
            z4Var.b(objArr);
        }
    }
}
