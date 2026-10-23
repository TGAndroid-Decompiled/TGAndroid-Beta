package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r70 extends TimerTask {
    public final String f41038a;
    public final s70 f41039b;

    public r70(s70 s70Var, String str) {
        this.f41039b = s70Var;
        this.f41038a = str;
    }

    @Override
    public final void run() {
        s70 s70Var = this.f41039b;
        try {
            s70Var.f41316f.cancel();
            s70Var.f41316f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new q70(this, this.f41038a, 0));
    }
}
