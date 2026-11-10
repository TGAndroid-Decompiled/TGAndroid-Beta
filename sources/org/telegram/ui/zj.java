package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class zj implements Runnable {
    public final int f52475a;
    public final cn f52476b;

    public zj(cn cnVar, int i7) {
        this.f52475a = i7;
        this.f52476b = cnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.kg kgVar;
        FrameLayout frameLayout;
        switch (this.f52475a) {
            case 0:
                cn cnVar = this.f52476b;
                AnimatorSet animatorSet = cnVar.f44635qa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    cnVar.f44635qa.start();
                    return;
                }
                return;
            default:
                cn cnVar2 = this.f52476b;
                if (cnVar2.f44450c3 == this && (kgVar = cnVar2.f44419a1) != null && (frameLayout = cnVar2.f44436b3) != null) {
                    kgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
