package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xt extends TimerTask {
    public final int f40064a;
    public final String f40065b;
    public final org.telegram.ui.Components.ql0 f40066c;

    public xt(org.telegram.ui.Components.ql0 ql0Var, String str, int i10) {
        this.f40064a = i10;
        this.f40066c = ql0Var;
        this.f40065b = str;
    }

    @Override
    public final void run() {
        switch (this.f40064a) {
            case 0:
                try {
                    ((yt) this.f40066c).d.cancel();
                    ((yt) this.f40066c).d = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.k41(11, (yt) this.f40066c, this.f40065b));
                return;
            default:
                tf.c1 c1Var = (tf.c1) this.f40066c;
                try {
                    c1Var.f44743n.cancel();
                    c1Var.f44743n = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                String str = this.f40065b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new ph.e6(26, c1Var, str));
                return;
        }
    }
}
