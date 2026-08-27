package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class qt extends TimerTask {

    public final int f41740a;

    public final String f41741b;

    public final org.telegram.ui.Components.yk0 f41742c;

    public qt(org.telegram.ui.Components.yk0 yk0Var, String str, int i10) {
        this.f41740a = i10;
        this.f41742c = yk0Var;
        this.f41741b = str;
    }

    @Override
    public final void run() {
        switch (this.f41740a) {
            case 0:
                try {
                    ((rt) this.f41742c).d.cancel();
                    ((rt) this.f41742c).d = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.r61(6, (rt) this.f41742c, this.f41741b));
                break;
            default:
                pf.c1 c1Var = (pf.c1) this.f41742c;
                try {
                    c1Var.f45755n.cancel();
                    c1Var.f45755n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.f41741b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new zh1(16, c1Var, str));
                break;
        }
    }
}
