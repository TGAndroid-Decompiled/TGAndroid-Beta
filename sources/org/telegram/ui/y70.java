package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class y70 extends TimerTask {
    public final String f43567a;
    public final z70 f43568b;

    public y70(z70 z70Var, String str) {
        this.f43568b = z70Var;
        this.f43567a = str;
    }

    @Override
    public final void run() {
        z70 z70Var = this.f43568b;
        try {
            z70Var.f43847f.cancel();
            z70Var.f43847f = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        AndroidUtilities.runOnUIThread(new x70(this, this.f43567a, 0));
    }
}
