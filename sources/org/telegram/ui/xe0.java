package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class xe0 extends TimerTask {
    public final ye0 f39444a;

    public xe0(ye0 ye0Var) {
        this.f39444a = ye0Var;
    }

    @Override
    public final void run() {
        if (this.f39444a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
