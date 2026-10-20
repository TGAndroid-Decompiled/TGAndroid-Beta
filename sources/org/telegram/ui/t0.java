package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41564a;
    public final Runnable f41565b;

    public t0(int i10, Runnable runnable) {
        this.f41564a = i10;
        this.f41565b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41564a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41565b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41565b.run();
                return;
        }
    }
}
