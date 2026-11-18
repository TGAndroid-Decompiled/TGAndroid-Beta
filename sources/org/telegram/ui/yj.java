package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yj implements Runnable {
    public final int f54175a;
    public final bn f54176b;

    public yj(bn bnVar, int i7) {
        this.f54175a = i7;
        this.f54176b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ah ahVar;
        FrameLayout frameLayout;
        switch (this.f54175a) {
            case 0:
                bn bnVar = this.f54176b;
                AnimatorSet animatorSet = bnVar.f46168sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.f46168sa.start();
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f54176b;
                if (bnVar2.f45968d3 == this && (ahVar = bnVar2.f45939b1) != null && (frameLayout = bnVar2.f45955c3) != null) {
                    ahVar.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
