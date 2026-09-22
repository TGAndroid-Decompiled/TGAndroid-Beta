package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final bo f39247a;

    public wk(bo boVar) {
        this.f39247a = boVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            bo boVar = this.f39247a;
            if (boVar.H6 && longValue == boVar.T5) {
                return true;
            }
        }
        return false;
    }
}
