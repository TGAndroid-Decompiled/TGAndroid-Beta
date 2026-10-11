package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xj implements Runnable {
    public final int f44092a;
    public final yj f44093b;

    public xj(yj yjVar, int i10) {
        this.f44092a = i10;
        this.f44093b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f44092a) {
            case 0:
                yj yjVar = this.f44093b;
                yjVar.W = null;
                zn znVar = yjVar.X;
                if (znVar.H9 != -1) {
                    znVar.getNotificationCenter().onAnimationFinish(znVar.H9);
                    znVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f44093b;
                yjVar2.W = null;
                zn znVar2 = yjVar2.X;
                if (znVar2.H9 != -1) {
                    znVar2.getNotificationCenter().onAnimationFinish(znVar2.H9);
                    znVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
