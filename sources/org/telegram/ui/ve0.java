package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ve0 extends TimerTask {
    public final we0 f42838a;

    public ve0(we0 we0Var) {
        this.f42838a = we0Var;
    }

    @Override
    public final void run() {
        if (this.f42838a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new uz(this, 23));
    }
}
