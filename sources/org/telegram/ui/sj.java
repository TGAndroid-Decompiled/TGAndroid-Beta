package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class sj implements Runnable {
    public final int f43347a;
    public final tj f43348b;

    public sj(tj tjVar, int i10) {
        this.f43347a = i10;
        this.f43348b = tjVar;
    }

    @Override
    public final void run() {
        switch (this.f43347a) {
            case 0:
                tj tjVar = this.f43348b;
                tjVar.W = null;
                wn wnVar = tjVar.X;
                if (wnVar.X9 != -1) {
                    wnVar.getNotificationCenter().onAnimationFinish(wnVar.X9);
                    wnVar.X9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                tj tjVar2 = this.f43348b;
                tjVar2.W = null;
                wn wnVar2 = tjVar2.X;
                if (wnVar2.X9 != -1) {
                    wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.X9);
                    wnVar2.X9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
