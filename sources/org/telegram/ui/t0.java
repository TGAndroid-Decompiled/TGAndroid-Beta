package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f42797a;
    public final Runnable f42798b;

    public t0(int i9, Runnable runnable) {
        this.f42797a = i9;
        this.f42798b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42797a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f42798b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f42798b.run();
                return;
        }
    }
}
