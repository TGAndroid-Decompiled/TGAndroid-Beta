package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tj implements Runnable {
    public final int f38532a;
    public final uj f38533b;

    public tj(uj ujVar, int i10) {
        this.f38532a = i10;
        this.f38533b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f38532a) {
            case 0:
                uj ujVar = this.f38533b;
                ujVar.W = null;
                zn znVar = ujVar.X;
                if (znVar.E9 != -1) {
                    znVar.getNotificationCenter().onAnimationFinish(znVar.E9);
                    znVar.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f38533b;
                ujVar2.W = null;
                zn znVar2 = ujVar2.X;
                if (znVar2.E9 != -1) {
                    znVar2.getNotificationCenter().onAnimationFinish(znVar2.E9);
                    znVar2.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
