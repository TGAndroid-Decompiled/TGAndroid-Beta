package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r70 extends TimerTask {
    public final String f41048a;
    public final s70 f41049b;

    public r70(s70 s70Var, String str) {
        this.f41049b = s70Var;
        this.f41048a = str;
    }

    @Override
    public final void run() {
        s70 s70Var = this.f41049b;
        try {
            s70Var.f41311f.cancel();
            s70Var.f41311f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new q70(this, this.f41048a, 0));
    }
}
