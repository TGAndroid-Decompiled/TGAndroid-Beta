package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class y70 extends TimerTask {
    public final String f43571a;
    public final z70 f43572b;

    public y70(z70 z70Var, String str) {
        this.f43572b = z70Var;
        this.f43571a = str;
    }

    @Override
    public final void run() {
        z70 z70Var = this.f43572b;
        try {
            z70Var.f43861f.cancel();
            z70Var.f43861f = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        AndroidUtilities.runOnUIThread(new x70(this, this.f43571a, 0));
    }
}
