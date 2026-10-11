package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class xf0 extends TimerTask {
    public final yf0 f44062a;

    public xf0(yf0 yf0Var) {
        this.f44062a = yf0Var;
    }

    @Override
    public final void run() {
        if (this.f44062a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new tz(this, 25));
    }
}
