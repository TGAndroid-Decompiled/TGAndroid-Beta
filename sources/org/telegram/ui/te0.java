package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class te0 extends TimerTask {
    public final ue0 f37765a;

    public te0(ue0 ue0Var) {
        this.f37765a = ue0Var;
    }

    @Override
    public final void run() {
        if (this.f37765a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f10(this, 22));
    }
}
