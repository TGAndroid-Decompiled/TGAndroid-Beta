package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class sj implements Runnable {
    public final int f37312a;
    public final tj f37313b;

    public sj(tj tjVar, int i10) {
        this.f37312a = i10;
        this.f37313b = tjVar;
    }

    @Override
    public final void run() {
        switch (this.f37312a) {
            case 0:
                tj tjVar = this.f37313b;
                tjVar.W = null;
                xn xnVar = tjVar.X;
                if (xnVar.H9 != -1) {
                    xnVar.getNotificationCenter().onAnimationFinish(xnVar.H9);
                    xnVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                tj tjVar2 = this.f37313b;
                tjVar2.W = null;
                xn xnVar2 = tjVar2.X;
                if (xnVar2.H9 != -1) {
                    xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.H9);
                    xnVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
