package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vi0 implements Runnable {
    public final int f38563a;
    public final wi0 f38564b;

    public vi0(wi0 wi0Var, int i10) {
        this.f38563a = i10;
        this.f38564b = wi0Var;
    }

    @Override
    public final void run() {
        switch (this.f38563a) {
            case 0:
                this.f38564b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38564b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
