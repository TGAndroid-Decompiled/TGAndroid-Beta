package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54221a;
    public final bn f54222b;

    public yj(bn bnVar, int i7) {
        this.f54221a = i7;
        this.f54222b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f54221a) {
            case 0:
                bn bnVar = this.f54222b;
                AnimatorSet animatorSet = bnVar.f46195sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46195sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54222b;
                if (bnVar2.f45995d3 == this && (chVar = bnVar2.f45966b1) != null && (frameLayout = bnVar2.f45982c3) != null) {
                    chVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
