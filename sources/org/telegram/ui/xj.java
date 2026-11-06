package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f51870a;
    public final an f51871b;

    public xj(an anVar, int i7) {
        this.f51870a = i7;
        this.f51871b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.f51870a) {
            case 0:
                an anVar = this.f51871b;
                AnimatorSet animatorSet = anVar.f43881oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f43881oa.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f51871b;
                if (anVar2.f43724c3 == this && (lgVar = anVar2.f43693a1) != null && (frameLayout = anVar2.f43710b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
