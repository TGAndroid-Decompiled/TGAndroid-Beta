package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f44043a;
    public final yi0 f44044b;

    public xi0(yi0 yi0Var, int i10) {
        this.f44043a = i10;
        this.f44044b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f44043a) {
            case 0:
                this.f44044b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f44044b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
