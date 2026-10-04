package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ue0 extends TimerTask {
    public final ve0 f41160a;

    public ue0(ve0 ve0Var) {
        this.f41160a = ve0Var;
    }

    @Override
    public final void run() {
        if (this.f41160a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
