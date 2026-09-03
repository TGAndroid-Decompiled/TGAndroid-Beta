package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class wt extends TimerTask {
    public final int f42855a;
    public final String f42856b;
    public final org.telegram.ui.Components.rl0 f42857c;

    public wt(org.telegram.ui.Components.rl0 rl0Var, String str, int i10) {
        this.f42855a = i10;
        this.f42857c = rl0Var;
        this.f42856b = str;
    }

    @Override
    public final void run() {
        switch (this.f42855a) {
            case 0:
                try {
                    ((xt) this.f42857c).d.cancel();
                    ((xt) this.f42857c).d = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.q51(10, (xt) this.f42857c, this.f42856b));
                return;
            default:
                uf.c1 c1Var = (uf.c1) this.f42857c;
                try {
                    c1Var.f48558n.cancel();
                    c1Var.f48558n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.f42856b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new qh.l6(26, c1Var, str));
                return;
        }
    }
}
