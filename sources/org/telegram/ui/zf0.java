package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class zf0 extends TimerTask {
    public final ag0 f40113a;

    public zf0(ag0 ag0Var) {
        this.f40113a = ag0Var;
    }

    @Override
    public final void run() {
        if (this.f40113a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
