package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f43795a;
    public final hs f43796b;

    public zr(hs hsVar, int i10) {
        this.f43795a = i10;
        this.f43796b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f43795a) {
            case 0:
                hs hsVar = this.f43796b;
                if (hsVar.J) {
                    hsVar.d.f22401b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f22401b);
                    return;
                }
                return;
            case 1:
                hs.Z(this.f43796b);
                return;
            default:
                hs hsVar2 = this.f43796b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                return;
        }
    }
}
