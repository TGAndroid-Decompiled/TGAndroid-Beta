package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f51885a;
    public final an f51886b;

    public xj(an anVar, int i7) {
        this.f51885a = i7;
        this.f51886b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.f51885a) {
            case 0:
                an anVar = this.f51886b;
                AnimatorSet animatorSet = anVar.f43905oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f43905oa.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f51886b;
                if (anVar2.f43748c3 == this && (lgVar = anVar2.f43717a1) != null && (frameLayout = anVar2.f43734b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
