package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class vf0 extends TimerTask {
    public final wf0 f38566a;

    public vf0(wf0 wf0Var) {
        this.f38566a = wf0Var;
    }

    @Override
    public final void run() {
        if (this.f38566a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f10(this, 24));
    }
}
