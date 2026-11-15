package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f53251a;
    public final an f53252b;

    public xj(an anVar, int i7) {
        this.f53251a = i7;
        this.f53252b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.rg rgVar;
        FrameLayout frameLayout;
        switch (this.f53251a) {
            case 0:
                an anVar = this.f53252b;
                AnimatorSet animatorSet = anVar.f45349ra;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f45349ra.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f53252b;
                if (anVar2.f45162d3 == this && (rgVar = anVar2.f45133b1) != null && (frameLayout = anVar2.f45149c3) != null) {
                    rgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
