package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f44089a;
    public final yi0 f44090b;

    public xi0(yi0 yi0Var, int i10) {
        this.f44089a = i10;
        this.f44090b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f44089a) {
            case 0:
                this.f44090b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f44090b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
