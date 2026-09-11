package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vj implements Runnable {
    public final int f41582a;
    public final wj f41583b;

    public vj(wj wjVar, int i10) {
        this.f41582a = i10;
        this.f41583b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f41582a) {
            case 0:
                wj wjVar = this.f41583b;
                wjVar.W = null;
                co coVar = wjVar.X;
                if (coVar.H9 != -1) {
                    coVar.getNotificationCenter().onAnimationFinish(coVar.H9);
                    coVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f41583b;
                wjVar2.W = null;
                co coVar2 = wjVar2.X;
                if (coVar2.H9 != -1) {
                    coVar2.getNotificationCenter().onAnimationFinish(coVar2.H9);
                    coVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
