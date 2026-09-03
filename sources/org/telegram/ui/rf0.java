package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class rf0 extends TimerTask {
    public final sf0 f40838a;

    public rf0(sf0 sf0Var) {
        this.f40838a = sf0Var;
    }

    @Override
    public final void run() {
        if (this.f40838a.O == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 24));
    }
}
