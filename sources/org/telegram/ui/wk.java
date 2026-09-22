package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final zn f39197a;

    public wk(zn znVar) {
        this.f39197a = znVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            zn znVar = this.f39197a;
            if (znVar.H6 && longValue == znVar.T5) {
                return true;
            }
        }
        return false;
    }
}
