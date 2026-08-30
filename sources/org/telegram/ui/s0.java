package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f38155a;
    public final Runnable f38156b;

    public s0(int i10, Runnable runnable) {
        this.f38155a = i10;
        this.f38156b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38155a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f38156b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f38156b.run();
                return;
        }
    }
}
