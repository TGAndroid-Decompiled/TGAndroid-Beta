package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class xk implements NotificationCenter.PostponeNotificationCallback {
    public final sn f43613a;

    public xk(sn snVar) {
        this.f43613a = snVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            sn snVar = this.f43613a;
            if (snVar.T6 && longValue == snVar.f41519f6) {
                return true;
            }
        }
        return false;
    }
}
