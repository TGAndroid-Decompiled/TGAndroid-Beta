package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f39177a;
    public final xi0 f39178b;

    public wi0(xi0 xi0Var, int i10) {
        this.f39177a = i10;
        this.f39178b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39177a) {
            case 0:
                this.f39178b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39178b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
