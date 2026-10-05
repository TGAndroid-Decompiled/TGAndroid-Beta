package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ti0 implements Runnable {
    public final int f40923a;
    public final ui0 f40924b;

    public ti0(ui0 ui0Var, int i10) {
        this.f40923a = i10;
        this.f40924b = ui0Var;
    }

    @Override
    public final void run() {
        switch (this.f40923a) {
            case 0:
                this.f40924b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f40924b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
