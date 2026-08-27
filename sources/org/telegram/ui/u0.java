package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class u0 extends AnimatorListenerAdapter {

    public final int f43047a;

    public final Runnable f43048b;

    public u0(int i10, Runnable runnable) {
        this.f43047a = i10;
        this.f43048b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43047a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f43048b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                this.f43048b.run();
                break;
        }
    }
}
