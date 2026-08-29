package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u0 extends AnimatorListenerAdapter {
    public final int f43119a;
    public final Runnable f43120b;

    public u0(int i10, Runnable runnable) {
        this.f43119a = i10;
        this.f43120b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43119a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f43120b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f43120b.run();
                return;
        }
    }
}
