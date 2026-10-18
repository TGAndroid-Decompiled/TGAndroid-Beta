package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f43777a;
    public final hs f43778b;

    public zr(hs hsVar, int i10) {
        this.f43777a = i10;
        this.f43778b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f43777a) {
            case 0:
                hs hsVar = this.f43778b;
                if (hsVar.J) {
                    hsVar.d.f22398b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f22398b);
                    return;
                }
                return;
            case 1:
                hs.Z(this.f43778b);
                return;
            default:
                hs hsVar2 = this.f43778b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                return;
        }
    }
}
