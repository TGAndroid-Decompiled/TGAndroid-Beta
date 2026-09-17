package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f39652a;
    public final yi0 f39653b;

    public xi0(yi0 yi0Var, int i10) {
        this.f39652a = i10;
        this.f39653b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39652a) {
            case 0:
                this.f39653b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39653b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
