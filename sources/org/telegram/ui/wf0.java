package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class wf0 extends TimerTask {
    public final xf0 f42465a;

    public wf0(xf0 xf0Var) {
        this.f42465a = xf0Var;
    }

    @Override
    public final void run() {
        if (this.f42465a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
