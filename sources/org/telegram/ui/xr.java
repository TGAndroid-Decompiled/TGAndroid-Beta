package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43252a;
    public final fs f43253b;

    public xr(fs fsVar, int i10) {
        this.f43252a = i10;
        this.f43253b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f43252a) {
            case 0:
                fs fsVar = this.f43253b;
                if (fsVar.J) {
                    fsVar.d.f22401b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22401b);
                    return;
                }
                return;
            case 1:
                fs.Z(this.f43253b);
                return;
            default:
                fs fsVar2 = this.f43253b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                return;
        }
    }
}
