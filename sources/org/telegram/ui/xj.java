package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f53252a;
    public final an f53253b;

    public xj(an anVar, int i7) {
        this.f53252a = i7;
        this.f53253b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.rg rgVar;
        FrameLayout frameLayout;
        switch (this.f53252a) {
            case 0:
                an anVar = this.f53253b;
                AnimatorSet animatorSet = anVar.f45350ra;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f45350ra.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f53253b;
                if (anVar2.f45163d3 == this && (rgVar = anVar2.f45134b1) != null && (frameLayout = anVar2.f45150c3) != null) {
                    rgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
