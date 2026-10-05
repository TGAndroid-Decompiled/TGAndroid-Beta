package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class z4 implements NotificationCenter.NotificationCenterDelegate {
    public final a5 f43695a;

    public z4(a5 a5Var) {
        this.f43695a = a5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a5 a5Var = this.f43695a;
        if (a5Var.f34685g && i10 == a5Var.f34683e) {
            a5Var.b(objArr);
        }
    }
}
