package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class si0 implements Runnable {
    public final int f37479a;
    public final ti0 f37480b;

    public si0(ti0 ti0Var, int i10) {
        this.f37479a = i10;
        this.f37480b = ti0Var;
    }

    @Override
    public final void run() {
        switch (this.f37479a) {
            case 0:
                this.f37480b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37480b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
