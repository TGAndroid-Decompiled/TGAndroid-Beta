package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class sj implements Runnable {
    public final int f37805a;
    public final tj f37806b;

    public sj(tj tjVar, int i10) {
        this.f37805a = i10;
        this.f37806b = tjVar;
    }

    @Override
    public final void run() {
        switch (this.f37805a) {
            case 0:
                tj tjVar = this.f37806b;
                tjVar.W = null;
                wn wnVar = tjVar.X;
                if (wnVar.H9 != -1) {
                    wnVar.getNotificationCenter().onAnimationFinish(wnVar.H9);
                    wnVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                tj tjVar2 = this.f37806b;
                tjVar2.W = null;
                wn wnVar2 = tjVar2.X;
                if (wnVar2.H9 != -1) {
                    wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.H9);
                    wnVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
