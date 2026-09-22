package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends TimerTask {
    public final xe0 f38859a;

    public we0(xe0 xe0Var) {
        this.f38859a = xe0Var;
    }

    @Override
    public final void run() {
        if (this.f38859a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
