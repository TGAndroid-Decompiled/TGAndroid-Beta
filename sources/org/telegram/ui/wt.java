package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class wt extends TimerTask {
    public final int f42880a;
    public final String f42881b;
    public final org.telegram.ui.Components.sl0 f42882c;

    public wt(org.telegram.ui.Components.sl0 sl0Var, String str, int i10) {
        this.f42880a = i10;
        this.f42882c = sl0Var;
        this.f42881b = str;
    }

    @Override
    public final void run() {
        switch (this.f42880a) {
            case 0:
                try {
                    ((xt) this.f42882c).d.cancel();
                    ((xt) this.f42882c).d = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.l41(11, (xt) this.f42882c, this.f42881b));
                return;
            default:
                uf.c1 c1Var = (uf.c1) this.f42882c;
                try {
                    c1Var.f48522n.cancel();
                    c1Var.f48522n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.f42881b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new qh.d6(27, c1Var, str));
                return;
        }
    }
}
