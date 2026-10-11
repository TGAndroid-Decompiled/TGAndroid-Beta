package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f43823a;
    public final xi0 f43824b;

    public wi0(xi0 xi0Var, int i10) {
        this.f43823a = i10;
        this.f43824b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f43823a) {
            case 0:
                this.f43824b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f43824b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
