package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final z4 f44283a;

    public y4(z4 z4Var) {
        this.f44283a = z4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z4 z4Var = this.f44283a;
        if (z4Var.f44525g && i10 == z4Var.f44523e) {
            z4Var.b(objArr);
        }
    }
}
