package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final z4 f43008a;

    public y4(z4 z4Var) {
        this.f43008a = z4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z4 z4Var = this.f43008a;
        if (z4Var.f43315g && i10 == z4Var.f43313e) {
            z4Var.b(objArr);
        }
    }
}
