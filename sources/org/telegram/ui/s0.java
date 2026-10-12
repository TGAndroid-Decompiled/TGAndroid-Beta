package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f39906a;
    public final Runnable f39907b;

    public s0(int i10, Runnable runnable) {
        this.f39906a = i10;
        this.f39907b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39906a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39907b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39907b.run();
                return;
        }
    }
}
