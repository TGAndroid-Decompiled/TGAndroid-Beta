package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class sf0 extends TimerTask {
    public final tf0 f38173a;

    public sf0(tf0 tf0Var) {
        this.f38173a = tf0Var;
    }

    @Override
    public final void run() {
        if (this.f38173a.O == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d10(this, 24));
    }
}
