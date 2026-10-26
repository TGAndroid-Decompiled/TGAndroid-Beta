package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s70 extends TimerTask {
    public final String f43377a;
    public final t70 f43378b;

    public s70(t70 t70Var, String str) {
        this.f43378b = t70Var;
        this.f43377a = str;
    }

    @Override
    public final void run() {
        t70 t70Var = this.f43378b;
        try {
            t70Var.f43693f.cancel();
            t70Var.f43693f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new r70(this, this.f43377a, 0));
    }
}
