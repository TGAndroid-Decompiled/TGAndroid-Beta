package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f45302a;
    public final hs f45303b;

    public zr(hs hsVar, int i10) {
        this.f45302a = i10;
        this.f45303b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f45302a) {
            case 0:
                hs hsVar = this.f45303b;
                if (hsVar.F) {
                    hsVar.d.f24387b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f24387b);
                    return;
                }
                return;
            case 1:
                hs.Z(this.f45303b);
                return;
            default:
                hs hsVar2 = this.f45303b;
                hsVar2.presentFragment(tn.R9(hsVar2.D), true);
                return;
        }
    }
}
