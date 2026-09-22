package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ye0 extends TimerTask {
    public final ze0 f39916a;

    public ye0(ze0 ze0Var) {
        this.f39916a = ze0Var;
    }

    @Override
    public final void run() {
        if (this.f39916a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
