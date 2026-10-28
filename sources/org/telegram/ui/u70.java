package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u70 extends TimerTask {
    public final String f43897a;
    public final v70 f43898b;

    public u70(v70 v70Var, String str) {
        this.f43898b = v70Var;
        this.f43897a = str;
    }

    @Override
    public final void run() {
        v70 v70Var = this.f43898b;
        try {
            v70Var.f44200f.cancel();
            v70Var.f44200f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new t70(this, this.f43897a, 0));
    }
}
