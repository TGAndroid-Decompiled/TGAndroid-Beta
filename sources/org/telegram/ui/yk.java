package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final un f46072a;

    public yk(un unVar) {
        this.f46072a = unVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            un unVar = this.f46072a;
            if (unVar.T6 && longValue == unVar.f44249f6) {
                return true;
            }
        }
        return false;
    }
}
