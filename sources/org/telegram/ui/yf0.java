package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class yf0 extends TimerTask {
    public final zf0 f43104a;

    public yf0(zf0 zf0Var) {
        this.f43104a = zf0Var;
    }

    @Override
    public final void run() {
        if (this.f43104a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
