package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final qn f42894a;

    public wk(qn qnVar) {
        this.f42894a = qnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            qn qnVar = this.f42894a;
            if (qnVar.H6 && longValue == qnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
