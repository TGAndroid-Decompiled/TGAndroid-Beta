package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class yf0 extends TimerTask {
    public final zf0 f44468a;

    public yf0(zf0 zf0Var) {
        this.f44468a = zf0Var;
    }

    @Override
    public final void run() {
        if (this.f44468a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wz(this, 25));
    }
}
