package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class qm0 extends TimerTask {
    public final rm0 f41753a;

    public qm0(rm0 rm0Var) {
        this.f41753a = rm0Var;
    }

    @Override
    public final void run() {
        rm0 rm0Var = this.f41753a;
        if (rm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        rm0Var.f42151y = (int) (rm0Var.f42151y - (currentTimeMillis - rm0Var.B));
        rm0Var.B = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new vk0(this, 6));
    }
}
