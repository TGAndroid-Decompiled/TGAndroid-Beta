package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends TimerTask {
    public final xe0 f38853a;

    public we0(xe0 xe0Var) {
        this.f38853a = xe0Var;
    }

    @Override
    public final void run() {
        if (this.f38853a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
