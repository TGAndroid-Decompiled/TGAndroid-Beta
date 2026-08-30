package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ym0 extends TimerTask {
    public final zm0 f40545a;

    public ym0(zm0 zm0Var) {
        this.f40545a = zm0Var;
    }

    @Override
    public final void run() {
        zm0 zm0Var = this.f40545a;
        if (zm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        zm0Var.f40836y = (int) (zm0Var.f40836y - (currentTimeMillis - zm0Var.C));
        zm0Var.C = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new el0(this, 6));
    }
}
