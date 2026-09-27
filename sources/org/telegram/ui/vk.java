package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class vk implements NotificationCenter.PostponeNotificationCallback {
    public final xn f38624a;

    public vk(xn xnVar) {
        this.f38624a = xnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            xn xnVar = this.f38624a;
            if (xnVar.H6 && longValue == xnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
