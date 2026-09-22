package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vj implements Runnable {
    public final int f38572a;
    public final wj f38573b;

    public vj(wj wjVar, int i10) {
        this.f38572a = i10;
        this.f38573b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f38572a) {
            case 0:
                wj wjVar = this.f38573b;
                wjVar.W = null;
                bo boVar = wjVar.X;
                if (boVar.H9 != -1) {
                    boVar.getNotificationCenter().onAnimationFinish(boVar.H9);
                    boVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f38573b;
                wjVar2.W = null;
                bo boVar2 = wjVar2.X;
                if (boVar2.H9 != -1) {
                    boVar2.getNotificationCenter().onAnimationFinish(boVar2.H9);
                    boVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
