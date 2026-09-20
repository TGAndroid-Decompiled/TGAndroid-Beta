package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class uj implements Runnable {
    public final int f38111a;
    public final vj f38112b;

    public uj(vj vjVar, int i10) {
        this.f38111a = i10;
        this.f38112b = vjVar;
    }

    @Override
    public final void run() {
        switch (this.f38111a) {
            case 0:
                vj vjVar = this.f38112b;
                vjVar.W = null;
                zn znVar = vjVar.X;
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
                vj vjVar2 = this.f38112b;
                vjVar2.W = null;
                zn znVar2 = vjVar2.X;
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
