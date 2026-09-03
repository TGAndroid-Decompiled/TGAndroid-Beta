package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u0 extends AnimatorListenerAdapter {
    public final int f38628a;
    public final Runnable f38629b;

    public u0(int i10, Runnable runnable) {
        this.f38628a = i10;
        this.f38629b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38628a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f38629b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f38629b.run();
                return;
        }
    }
}
