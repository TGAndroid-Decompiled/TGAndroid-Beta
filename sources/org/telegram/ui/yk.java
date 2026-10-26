package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final un f46075a;

    public yk(un unVar) {
        this.f46075a = unVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            un unVar = this.f46075a;
            if (unVar.T6 && longValue == unVar.f44252f6) {
                return true;
            }
        }
        return false;
    }
}
