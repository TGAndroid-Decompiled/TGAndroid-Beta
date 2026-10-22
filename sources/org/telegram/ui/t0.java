package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41567a;
    public final Runnable f41568b;

    public t0(int i10, Runnable runnable) {
        this.f41567a = i10;
        this.f41568b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41567a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41568b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41568b.run();
                return;
        }
    }
}
