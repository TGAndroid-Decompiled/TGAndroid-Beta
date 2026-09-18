package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f39657a;
    public final yi0 f39658b;

    public xi0(yi0 yi0Var, int i10) {
        this.f39657a = i10;
        this.f39658b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39657a) {
            case 0:
                this.f39658b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39658b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
