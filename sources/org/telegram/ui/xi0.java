package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xi0 implements Runnable {
    public final int f39594a;
    public final yi0 f39595b;

    public xi0(yi0 yi0Var, int i10) {
        this.f39594a = i10;
        this.f39595b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39594a) {
            case 0:
                this.f39595b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39595b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
