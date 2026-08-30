package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class vt extends TimerTask {
    public final int f39243a;
    public final String f39244b;
    public final org.telegram.ui.Components.rl0 f39245c;

    public vt(org.telegram.ui.Components.rl0 rl0Var, String str, int i10) {
        this.f39243a = i10;
        this.f39245c = rl0Var;
        this.f39244b = str;
    }

    @Override
    public final void run() {
        switch (this.f39243a) {
            case 0:
                try {
                    ((wt) this.f39245c).d.cancel();
                    ((wt) this.f39245c).d = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.k41(12, (wt) this.f39245c, this.f39244b));
                return;
            default:
                tf.c1 c1Var = (tf.c1) this.f39245c;
                try {
                    c1Var.f44681n.cancel();
                    c1Var.f44681n = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                String str = this.f39244b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new ph.f6(24, c1Var, str));
                return;
        }
    }
}
