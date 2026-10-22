package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43265a;
    public final fs f43266b;

    public xr(fs fsVar, int i10) {
        this.f43265a = i10;
        this.f43266b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f43265a) {
            case 0:
                fs fsVar = this.f43266b;
                if (fsVar.J) {
                    fsVar.d.f22405b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22405b);
                    return;
                }
                return;
            case 1:
                fs.Z(this.f43266b);
                return;
            default:
                fs fsVar2 = this.f43266b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                return;
        }
    }
}
