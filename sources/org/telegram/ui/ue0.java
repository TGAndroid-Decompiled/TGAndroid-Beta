package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ue0 extends TimerTask {
    public final ve0 f42538a;

    public ue0(ve0 ve0Var) {
        this.f42538a = ve0Var;
    }

    @Override
    public final void run() {
        if (this.f42538a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new tz(this, 23));
    }
}
