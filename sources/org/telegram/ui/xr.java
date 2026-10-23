package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xr implements Runnable {
    public final int f43635a;
    public final hs f43636b;

    public xr(hs hsVar, int i10) {
        this.f43635a = i10;
        this.f43636b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f43635a) {
            case 0:
                hs.Y(this.f43636b);
                return;
            case 1:
                hs hsVar = this.f43636b;
                if (hsVar.J) {
                    hsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.d);
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f43636b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                return;
        }
    }
}
