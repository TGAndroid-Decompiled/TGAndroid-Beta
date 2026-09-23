package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class re0 extends TimerTask {
    public final se0 f36805a;

    public re0(se0 se0Var) {
        this.f36805a = se0Var;
    }

    @Override
    public final void run() {
        if (this.f36805a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d10(this, 22));
    }
}
