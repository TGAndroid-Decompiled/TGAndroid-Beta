package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ue0 extends TimerTask {
    public final ve0 f41154a;

    public ue0(ve0 ve0Var) {
        this.f41154a = ve0Var;
    }

    @Override
    public final void run() {
        if (this.f41154a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 22));
    }
}
