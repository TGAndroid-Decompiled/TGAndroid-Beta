package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final xn f38679a;

    public tk(xn xnVar) {
        this.f38679a = xnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            xn xnVar = this.f38679a;
            if (xnVar.E6 && longValue == xnVar.Q5) {
                return true;
            }
        }
        return false;
    }
}
