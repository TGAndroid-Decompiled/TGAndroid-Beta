package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f39635a;
    public final Runnable f39636b;

    public s0(int i10, Runnable runnable) {
        this.f39635a = i10;
        this.f39636b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39635a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39636b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39636b.run();
                return;
        }
    }
}
