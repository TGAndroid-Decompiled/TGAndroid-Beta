package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f51887a;
    public final an f51888b;

    public xj(an anVar, int i7) {
        this.f51887a = i7;
        this.f51888b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.f51887a) {
            case 0:
                an anVar = this.f51888b;
                AnimatorSet animatorSet = anVar.f43906oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f43906oa.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f51888b;
                if (anVar2.f43749c3 == this && (lgVar = anVar2.f43718a1) != null && (frameLayout = anVar2.f43735b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
