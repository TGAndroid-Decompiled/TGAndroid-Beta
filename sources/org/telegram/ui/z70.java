package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class z70 extends TimerTask {
    public final String f40417a;
    public final a80 f40418b;

    public z70(a80 a80Var, String str) {
        this.f40418b = a80Var;
        this.f40417a = str;
    }

    @Override
    public final void run() {
        a80 a80Var = this.f40418b;
        try {
            a80Var.f32512f.cancel();
            a80Var.f32512f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new y70(this, this.f40417a, 0));
    }
}
