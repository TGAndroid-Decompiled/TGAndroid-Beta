package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f42435a;
    public final xi0 f42436b;

    public wi0(xi0 xi0Var, int i10) {
        this.f42435a = i10;
        this.f42436b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42435a) {
            case 0:
                this.f42436b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f42436b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
