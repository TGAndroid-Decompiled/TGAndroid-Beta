package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends TimerTask {
    public final xe0 f42013a;

    public we0(xe0 xe0Var) {
        this.f42013a = xe0Var;
    }

    @Override
    public final void run() {
        if (this.f42013a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
