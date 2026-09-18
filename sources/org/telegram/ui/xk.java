package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class xk implements NotificationCenter.PostponeNotificationCallback {
    public final bo f39664a;

    public xk(bo boVar) {
        this.f39664a = boVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            bo boVar = this.f39664a;
            if (boVar.H6 && longValue == boVar.T5) {
                return true;
            }
        }
        return false;
    }
}
