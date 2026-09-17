package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f42436a;
    public final xi0 f42437b;

    public wi0(xi0 xi0Var, int i10) {
        this.f42436a = i10;
        this.f42437b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42436a) {
            case 0:
                this.f42437b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f42437b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
