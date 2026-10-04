package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ti0 implements Runnable {
    public final int f40861a;
    public final ui0 f40862b;

    public ti0(ui0 ui0Var, int i10) {
        this.f40861a = i10;
        this.f40862b = ui0Var;
    }

    @Override
    public final void run() {
        switch (this.f40861a) {
            case 0:
                this.f40862b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f40862b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
