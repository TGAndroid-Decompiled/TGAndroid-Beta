package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends TimerTask {
    public final xe0 f43146a;

    public we0(xe0 xe0Var) {
        this.f43146a = xe0Var;
    }

    @Override
    public final void run() {
        if (this.f43146a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wz(this, 23));
    }
}
