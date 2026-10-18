package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41577a;
    public final Runnable f41578b;

    public t0(int i10, Runnable runnable) {
        this.f41577a = i10;
        this.f41578b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41577a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41578b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41578b.run();
                return;
        }
    }
}
