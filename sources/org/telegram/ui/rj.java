package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class rj implements Runnable {
    public final int f40864a;
    public final sj f40865b;

    public rj(sj sjVar, int i10) {
        this.f40864a = i10;
        this.f40865b = sjVar;
    }

    @Override
    public final void run() {
        switch (this.f40864a) {
            case 0:
                sj sjVar = this.f40865b;
                sjVar.W = null;
                xn xnVar = sjVar.X;
                if (xnVar.E9 != -1) {
                    xnVar.getNotificationCenter().onAnimationFinish(xnVar.E9);
                    xnVar.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                sj sjVar2 = this.f40865b;
                sjVar2.W = null;
                xn xnVar2 = sjVar2.X;
                if (xnVar2.E9 != -1) {
                    xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.E9);
                    xnVar2.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
