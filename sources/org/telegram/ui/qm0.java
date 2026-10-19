package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class qm0 extends TimerTask {
    public final rm0 f40612a;

    public qm0(rm0 rm0Var) {
        this.f40612a = rm0Var;
    }

    @Override
    public final void run() {
        rm0 rm0Var = this.f40612a;
        if (rm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        rm0Var.f41253y = (int) (rm0Var.f41253y - (currentTimeMillis - rm0Var.F));
        rm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ck0(this, 7));
    }
}
