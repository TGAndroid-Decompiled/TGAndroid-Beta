package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xj implements Runnable {
    public final int f38764a;
    public final yj f38765b;

    public xj(yj yjVar, int i10) {
        this.f38764a = i10;
        this.f38765b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f38764a) {
            case 0:
                yj yjVar = this.f38765b;
                yjVar.W = null;
                eo eoVar = yjVar.X;
                if (eoVar.H9 != -1) {
                    eoVar.getNotificationCenter().onAnimationFinish(eoVar.H9);
                    eoVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f38765b;
                yjVar2.W = null;
                eo eoVar2 = yjVar2.X;
                if (eoVar2.H9 != -1) {
                    eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.H9);
                    eoVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
