package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54195a;
    public final bn f54196b;

    public yj(bn bnVar, int i7) {
        this.f54195a = i7;
        this.f54196b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f54195a) {
            case 0:
                bn bnVar = this.f54196b;
                AnimatorSet animatorSet = bnVar.f46148sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46148sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54196b;
                if (bnVar2.f45948d3 == this && (chVar = bnVar2.f45919b1) != null && (frameLayout = bnVar2.f45935c3) != null) {
                    chVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
