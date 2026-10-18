package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f43817a;
    public final hs f43818b;

    public zr(hs hsVar, int i10) {
        this.f43817a = i10;
        this.f43818b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f43817a) {
            case 0:
                hs hsVar = this.f43818b;
                if (hsVar.J) {
                    hsVar.d.f22405b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f22405b);
                    return;
                }
                return;
            case 1:
                hs.Z(this.f43818b);
                return;
            default:
                hs hsVar2 = this.f43818b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                return;
        }
    }
}
