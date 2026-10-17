package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41551a;
    public final Runnable f41552b;

    public t0(int i10, Runnable runnable) {
        this.f41551a = i10;
        this.f41552b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41551a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41552b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41552b.run();
                return;
        }
    }
}
