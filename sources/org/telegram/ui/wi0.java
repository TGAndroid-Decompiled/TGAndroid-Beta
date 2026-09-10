package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f38208a;
    public final xi0 f38209b;

    public wi0(xi0 xi0Var, int i10) {
        this.f38208a = i10;
        this.f38209b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f38208a) {
            case 0:
                this.f38209b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38209b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
