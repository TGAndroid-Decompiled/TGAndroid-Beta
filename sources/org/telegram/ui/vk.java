package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class vk implements NotificationCenter.PostponeNotificationCallback {
    public final zn f38572a;

    public vk(zn znVar) {
        this.f38572a = znVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            zn znVar = this.f38572a;
            if (znVar.H6 && longValue == znVar.T5) {
                return true;
            }
        }
        return false;
    }
}
