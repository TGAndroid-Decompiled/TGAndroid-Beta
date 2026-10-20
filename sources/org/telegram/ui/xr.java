package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43262a;
    public final fs f43263b;

    public xr(fs fsVar, int i10) {
        this.f43262a = i10;
        this.f43263b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f43262a) {
            case 0:
                fs fsVar = this.f43263b;
                if (fsVar.J) {
                    fsVar.d.f22402b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22402b);
                    return;
                }
                return;
            case 1:
                fs.Z(this.f43263b);
                return;
            default:
                fs fsVar2 = this.f43263b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                return;
        }
    }
}
