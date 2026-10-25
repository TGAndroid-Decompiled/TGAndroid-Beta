package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s70 extends TimerTask {
    public final String f43374a;
    public final t70 f43375b;

    public s70(t70 t70Var, String str) {
        this.f43375b = t70Var;
        this.f43374a = str;
    }

    @Override
    public final void run() {
        t70 t70Var = this.f43375b;
        try {
            t70Var.f43690f.cancel();
            t70Var.f43690f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new r70(this, this.f43374a, 0));
    }
}
