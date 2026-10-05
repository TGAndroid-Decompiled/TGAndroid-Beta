package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f39930a;
    public final Runnable f39931b;

    public r0(int i10, Runnable runnable) {
        this.f39930a = i10;
        this.f39931b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39930a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39931b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39931b.run();
                return;
        }
    }
}
