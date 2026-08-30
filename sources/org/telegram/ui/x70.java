package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class x70 extends TimerTask {
    public final String f39870a;
    public final y70 f39871b;

    public x70(y70 y70Var, String str) {
        this.f39871b = y70Var;
        this.f39870a = str;
    }

    @Override
    public final void run() {
        y70 y70Var = this.f39871b;
        try {
            y70Var.f40441f.cancel();
            y70Var.f40441f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new w70(this, this.f39870a, 0));
    }
}
