package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final y4 f43997a;

    public x4(y4 y4Var) {
        this.f43997a = y4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.f43997a;
        if (y4Var.f44288g && i10 == y4Var.f44286e) {
            y4Var.b(objArr);
        }
    }
}
