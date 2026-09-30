package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final wn f38140a;

    public tk(wn wnVar) {
        this.f38140a = wnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            wn wnVar = this.f38140a;
            if (wnVar.H6 && longValue == wnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
