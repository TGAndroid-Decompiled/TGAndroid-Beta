package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final sn f43418a;

    public yk(sn snVar) {
        this.f43418a = snVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            sn snVar = this.f43418a;
            if (snVar.H6 && longValue == snVar.T5) {
                return true;
            }
        }
        return false;
    }
}
