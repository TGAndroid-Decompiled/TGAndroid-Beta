package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends TimerTask {
    public final xe0 f37841a;

    public we0(xe0 xe0Var) {
        this.f37841a = xe0Var;
    }

    @Override
    public final void run() {
        if (this.f37841a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i10(this, 22));
    }
}
