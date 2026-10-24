package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends TimerTask {
    public final vm0 f42453a;

    public um0(vm0 vm0Var) {
        this.f42453a = vm0Var;
    }

    @Override
    public final void run() {
        vm0 vm0Var = this.f42453a;
        if (vm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        vm0Var.f42772y = (int) (vm0Var.f42772y - (currentTimeMillis - vm0Var.F));
        vm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new nj0(this, 8));
    }
}
