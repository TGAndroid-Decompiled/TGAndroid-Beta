package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class zj implements Runnable {
    public final int f52573a;
    public final cn f52574b;

    public zj(cn cnVar, int i7) {
        this.f52573a = i7;
        this.f52574b = cnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.f52573a) {
            case 0:
                cn cnVar = this.f52574b;
                AnimatorSet animatorSet = cnVar.f44594qa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    cnVar.f44594qa.start();
                    return;
                }
                return;
            default:
                cn cnVar2 = this.f52574b;
                if (cnVar2.f44409c3 == this && (lgVar = cnVar2.f44378a1) != null && (frameLayout = cnVar2.f44395b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
