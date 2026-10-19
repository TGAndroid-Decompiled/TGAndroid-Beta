package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41558a;
    public final Runnable f41559b;

    public t0(int i10, Runnable runnable) {
        this.f41558a = i10;
        this.f41559b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41558a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41559b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41559b.run();
                return;
        }
    }
}
