package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43663a;
    public final hs f43664b;

    public xr(hs hsVar, int i10) {
        this.f43663a = i10;
        this.f43664b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f43663a) {
            case 0:
                hs.Y(this.f43664b);
                return;
            case 1:
                hs hsVar = this.f43664b;
                if (hsVar.J) {
                    hsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.d);
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f43664b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                return;
        }
    }
}
