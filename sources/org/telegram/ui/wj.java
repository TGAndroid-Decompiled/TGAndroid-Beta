package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wj implements Runnable {
    public final int f39062a;
    public final xj f39063b;

    public wj(xj xjVar, int i10) {
        this.f39062a = i10;
        this.f39063b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f39062a) {
            case 0:
                xj xjVar = this.f39063b;
                xjVar.W = null;
                bo boVar = xjVar.X;
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
                xj xjVar2 = this.f39063b;
                xjVar2.W = null;
                bo boVar2 = xjVar2.X;
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
