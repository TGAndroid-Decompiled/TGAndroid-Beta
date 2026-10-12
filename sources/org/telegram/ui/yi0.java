package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class yi0 implements Runnable {
    public final int f44485a;
    public final zi0 f44486b;

    public yi0(zi0 zi0Var, int i10) {
        this.f44485a = i10;
        this.f44486b = zi0Var;
    }

    @Override
    public final void run() {
        switch (this.f44485a) {
            case 0:
                this.f44486b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f44486b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
