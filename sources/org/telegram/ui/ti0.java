package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ti0 implements Runnable {
    public final int f40860a;
    public final ui0 f40861b;

    public ti0(ui0 ui0Var, int i10) {
        this.f40860a = i10;
        this.f40861b = ui0Var;
    }

    @Override
    public final void run() {
        switch (this.f40860a) {
            case 0:
                this.f40861b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f40861b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
