package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wi0 implements Runnable {
    public final int f43789a;
    public final xi0 f43790b;

    public wi0(xi0 xi0Var, int i10) {
        this.f43789a = i10;
        this.f43790b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f43789a) {
            case 0:
                this.f43790b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f43790b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
