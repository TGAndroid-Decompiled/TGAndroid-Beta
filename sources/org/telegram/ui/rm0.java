package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class rm0 extends TimerTask {
    public final sm0 f42466a;

    public rm0(sm0 sm0Var) {
        this.f42466a = sm0Var;
    }

    @Override
    public final void run() {
        sm0 sm0Var = this.f42466a;
        if (sm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        sm0Var.f42730y = (int) (sm0Var.f42730y - (currentTimeMillis - sm0Var.B));
        sm0Var.B = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new zk0(this, 6));
    }
}
