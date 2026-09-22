package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f39617a;
    public final yi0 f39618b;

    public xi0(yi0 yi0Var, int i10) {
        this.f39617a = i10;
        this.f39618b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39617a) {
            case 0:
                this.f39618b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39618b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
