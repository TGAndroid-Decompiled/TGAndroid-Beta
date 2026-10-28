package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class rk implements Runnable {
    public final int f43076a;
    public final wn f43077b;

    public rk(wn wnVar, int i10) {
        this.f43076a = i10;
        this.f43077b = wnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f43076a) {
            case 0:
                wn wnVar = this.f43077b;
                AnimatorSet animatorSet = wnVar.f45195la;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wnVar.f45195la.start();
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f43077b;
                if (wnVar2.f45047a3 == this && (chVar = wnVar2.Y0) != null && (frameLayout = wnVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
