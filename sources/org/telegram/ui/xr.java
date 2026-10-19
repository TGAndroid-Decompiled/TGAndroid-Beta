package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43256a;
    public final fs f43257b;

    public xr(fs fsVar, int i10) {
        this.f43256a = i10;
        this.f43257b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f43256a) {
            case 0:
                fs fsVar = this.f43257b;
                if (fsVar.J) {
                    fsVar.d.f22399b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22399b);
                    return;
                }
                return;
            case 1:
                fs.Z(this.f43257b);
                return;
            default:
                fs fsVar2 = this.f43257b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                return;
        }
    }
}
