package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r50 implements Runnable {
    public final int f40101a;
    public final s50 f40102b;

    public r50(s50 s50Var, int i10) {
        this.f40101a = i10;
        this.f40102b = s50Var;
    }

    @Override
    public final void run() {
        switch (this.f40101a) {
            case 0:
                s50 s50Var = this.f40102b;
                t50 t50Var = s50Var.f40331b;
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new r50(s50Var, 2), 16L);
                return;
            case 1:
                t50 t50Var2 = this.f40102b.f40331b;
                if (t50Var2 != null) {
                    t50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
