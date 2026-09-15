package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vi0 implements Runnable {
    public final int f38631a;
    public final wi0 f38632b;

    public vi0(wi0 wi0Var, int i10) {
        this.f38631a = i10;
        this.f38632b = wi0Var;
    }

    @Override
    public final void run() {
        switch (this.f38631a) {
            case 0:
                this.f38632b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38632b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
