package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f41083a;
    public final Runnable f41084b;

    public s0(int i10, Runnable runnable) {
        this.f41083a = i10;
        this.f41084b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41083a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41084b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41084b.run();
                return;
        }
    }
}
