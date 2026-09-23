package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class tf0 extends TimerTask {
    public final uf0 f37631a;

    public tf0(uf0 uf0Var) {
        this.f37631a = uf0Var;
    }

    @Override
    public final void run() {
        if (this.f37631a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d10(this, 24));
    }
}
