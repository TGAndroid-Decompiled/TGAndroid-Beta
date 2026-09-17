package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final co f42452a;

    public wk(co coVar) {
        this.f42452a = coVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            co coVar = this.f42452a;
            if (coVar.H6 && longValue == coVar.T5) {
                return true;
            }
        }
        return false;
    }
}
