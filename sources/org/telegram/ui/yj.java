package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54217a;
    public final bn f54218b;

    public yj(bn bnVar, int i7) {
        this.f54217a = i7;
        this.f54218b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f54217a) {
            case 0:
                bn bnVar = this.f54218b;
                AnimatorSet animatorSet = bnVar.f46191sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46191sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54218b;
                if (bnVar2.f45991d3 == this && (chVar = bnVar2.f45962b1) != null && (frameLayout = bnVar2.f45978c3) != null) {
                    chVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
