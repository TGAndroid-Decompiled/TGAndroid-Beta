package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final yn f40868a;

    public tk(yn ynVar) {
        this.f40868a = ynVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            yn ynVar = this.f40868a;
            if (ynVar.F6 && longValue == ynVar.R5) {
                return true;
            }
        }
        return false;
    }
}
