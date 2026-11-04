package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class tj implements Runnable {
    public final int f49816a;
    public final wm f49817b;

    public tj(wm wmVar, int i3) {
        this.f49816a = i3;
        this.f49817b = wmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.jg jgVar;
        FrameLayout frameLayout;
        switch (this.f49816a) {
            case 0:
                wm wmVar = this.f49817b;
                AnimatorSet animatorSet = wmVar.f51442pa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wmVar.f51442pa.start();
                    return;
                }
                return;
            default:
                wm wmVar2 = this.f49817b;
                if (wmVar2.f51281d3 == this && (jgVar = wmVar2.f51252b1) != null && (frameLayout = wmVar2.f51268c3) != null) {
                    jgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
