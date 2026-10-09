package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class yf0 extends TimerTask {
    public final zf0 f44336a;

    public yf0(zf0 zf0Var) {
        this.f44336a = zf0Var;
    }

    @Override
    public final void run() {
        if (this.f44336a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new uz(this, 25));
    }
}
