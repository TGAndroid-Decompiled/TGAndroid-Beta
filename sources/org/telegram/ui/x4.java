package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final y4 f44362a;

    public x4(y4 y4Var) {
        this.f44362a = y4Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        y4 y4Var = this.f44362a;
        if (y4Var.f44716g && i9 == y4Var.f44714e) {
            y4Var.b(objArr);
        }
    }
}
