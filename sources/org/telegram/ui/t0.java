package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41568a;
    public final Runnable f41569b;

    public t0(int i10, Runnable runnable) {
        this.f41568a = i10;
        this.f41569b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41568a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41569b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41569b.run();
                return;
        }
    }
}
