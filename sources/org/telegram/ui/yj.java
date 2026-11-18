package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54216a;
    public final bn f54217b;

    public yj(bn bnVar, int i7) {
        this.f54216a = i7;
        this.f54217b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ah ahVar;
        FrameLayout frameLayout;
        switch (this.f54216a) {
            case 0:
                bn bnVar = this.f54217b;
                AnimatorSet animatorSet = bnVar.f46177sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46177sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54217b;
                if (bnVar2.f45977d3 == this && (ahVar = bnVar2.f45948b1) != null && (frameLayout = bnVar2.f45964c3) != null) {
                    ahVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
