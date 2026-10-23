package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43266a;
    public final fs f43267b;

    public xr(fs fsVar, int i10) {
        this.f43266a = i10;
        this.f43267b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f43266a) {
            case 0:
                fs fsVar = this.f43267b;
                if (fsVar.J) {
                    fsVar.d.f22406b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22406b);
                    return;
                }
                return;
            case 1:
                fs.Z(this.f43267b);
                return;
            default:
                fs fsVar2 = this.f43267b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                return;
        }
    }
}
