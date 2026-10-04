package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tj implements Runnable {
    public final int f40864a;
    public final uj f40865b;

    public tj(uj ujVar, int i10) {
        this.f40864a = i10;
        this.f40865b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f40864a) {
            case 0:
                uj ujVar = this.f40865b;
                ujVar.W = null;
                yn ynVar = ujVar.X;
                if (ynVar.F9 != -1) {
                    ynVar.getNotificationCenter().onAnimationFinish(ynVar.F9);
                    ynVar.F9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f40865b;
                ujVar2.W = null;
                yn ynVar2 = ujVar2.X;
                if (ynVar2.F9 != -1) {
                    ynVar2.getNotificationCenter().onAnimationFinish(ynVar2.F9);
                    ynVar2.F9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
