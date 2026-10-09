package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class wk implements Runnable {
    public final int f43697a;
    public final zn f43698b;

    public wk(zn znVar, int i10) {
        this.f43697a = i10;
        this.f43698b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fh fhVar;
        FrameLayout frameLayout;
        switch (this.f43697a) {
            case 0:
                zn znVar = this.f43698b;
                AnimatorSet animatorSet = znVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.V9.start();
                    return;
                }
                return;
            default:
                zn znVar2 = this.f43698b;
                if (znVar2.O2 == this && (fhVar = znVar2.M0) != null && (frameLayout = znVar2.N2) != null) {
                    fhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
