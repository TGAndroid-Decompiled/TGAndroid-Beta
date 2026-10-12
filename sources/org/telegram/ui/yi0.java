package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class yi0 implements Runnable {
    public final int f44490a;
    public final zi0 f44491b;

    public yi0(zi0 zi0Var, int i10) {
        this.f44490a = i10;
        this.f44491b = zi0Var;
    }

    @Override
    public final void run() {
        switch (this.f44490a) {
            case 0:
                this.f44491b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f44491b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
