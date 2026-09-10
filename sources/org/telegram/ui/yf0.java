package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class yf0 extends TimerTask {
    public final zf0 f38991a;

    public yf0(zf0 zf0Var) {
        this.f38991a = zf0Var;
    }

    @Override
    public final void run() {
        if (this.f38991a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i10(this, 24));
    }
}
