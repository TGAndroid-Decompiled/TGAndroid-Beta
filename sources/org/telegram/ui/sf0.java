package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class sf0 extends TimerTask {
    public final tf0 f37734a;

    public sf0(tf0 tf0Var) {
        this.f37734a = tf0Var;
    }

    @Override
    public final void run() {
        if (this.f37734a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 24));
    }
}
