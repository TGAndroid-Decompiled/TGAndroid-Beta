package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class z4 implements NotificationCenter.NotificationCenterDelegate {
    public final a5 f43704a;

    public z4(a5 a5Var) {
        this.f43704a = a5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a5 a5Var = this.f43704a;
        if (a5Var.f34675g && i10 == a5Var.f34673e) {
            a5Var.b(objArr);
        }
    }
}
