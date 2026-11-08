package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xj implements Runnable {
    public final int f51878a;
    public final an f51879b;

    public xj(an anVar, int i7) {
        this.f51878a = i7;
        this.f51879b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.f51878a) {
            case 0:
                an anVar = this.f51879b;
                AnimatorSet animatorSet = anVar.f43911oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.f43911oa.start();
                    return;
                }
                return;
            default:
                an anVar2 = this.f51879b;
                if (anVar2.f43754c3 == this && (lgVar = anVar2.f43723a1) != null && (frameLayout = anVar2.f43740b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
