package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class uj implements Runnable {
    public final int f38267a;
    public final vj f38268b;

    public uj(vj vjVar, int i10) {
        this.f38267a = i10;
        this.f38268b = vjVar;
    }

    @Override
    public final void run() {
        switch (this.f38267a) {
            case 0:
                vj vjVar = this.f38268b;
                vjVar.W = null;
                xn xnVar = vjVar.X;
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
                vj vjVar2 = this.f38268b;
                vjVar2.W = null;
                xn xnVar2 = vjVar2.X;
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
