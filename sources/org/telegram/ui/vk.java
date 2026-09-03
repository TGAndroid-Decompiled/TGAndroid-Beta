package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class vk implements NotificationCenter.PostponeNotificationCallback {
    public final zn f39125a;

    public vk(zn znVar) {
        this.f39125a = znVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            zn znVar = this.f39125a;
            if (znVar.E6 && longValue == znVar.Q5) {
                return true;
            }
        }
        return false;
    }
}
