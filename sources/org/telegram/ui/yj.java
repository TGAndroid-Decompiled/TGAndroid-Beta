package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54387a;
    public final bn f54388b;

    public yj(bn bnVar, int i7) {
        this.f54387a = i7;
        this.f54388b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.bh bhVar;
        FrameLayout frameLayout;
        switch (this.f54387a) {
            case 0:
                bn bnVar = this.f54388b;
                AnimatorSet animatorSet = bnVar.f46363sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46363sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54388b;
                if (bnVar2.f46163d3 == this && (bhVar = bnVar2.f46134b1) != null && (frameLayout = bnVar2.f46150c3) != null) {
                    bhVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
