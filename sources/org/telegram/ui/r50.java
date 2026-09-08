package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r50 implements Runnable {
    public final int f40100a;
    public final s50 f40101b;

    public r50(s50 s50Var, int i10) {
        this.f40100a = i10;
        this.f40101b = s50Var;
    }

    @Override
    public final void run() {
        switch (this.f40100a) {
            case 0:
                s50 s50Var = this.f40101b;
                t50 t50Var = s50Var.f40330b;
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new r50(s50Var, 2), 16L);
                return;
            case 1:
                t50 t50Var2 = this.f40101b.f40330b;
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
