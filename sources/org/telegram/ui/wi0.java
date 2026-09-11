package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f42408a;
    public final xi0 f42409b;

    public wi0(xi0 xi0Var, int i10) {
        this.f42408a = i10;
        this.f42409b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42408a) {
            case 0:
                this.f42409b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f42409b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
