package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vj implements Runnable {
    public final int f38591a;
    public final wj f38592b;

    public vj(wj wjVar, int i10) {
        this.f38591a = i10;
        this.f38592b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f38591a) {
            case 0:
                wj wjVar = this.f38592b;
                wjVar.W = null;
                zn znVar = wjVar.X;
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
                wj wjVar2 = this.f38592b;
                wjVar2.W = null;
                zn znVar2 = wjVar2.X;
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
