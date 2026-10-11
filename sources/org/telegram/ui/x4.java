package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final y4 f43963a;

    public x4(y4 y4Var) {
        this.f43963a = y4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.f43963a;
        if (y4Var.f44254g && i10 == y4Var.f44252e) {
            y4Var.b(objArr);
        }
    }
}
