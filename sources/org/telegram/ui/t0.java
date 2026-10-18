package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41542a;
    public final Runnable f41543b;

    public t0(int i10, Runnable runnable) {
        this.f41542a = i10;
        this.f41543b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41542a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41543b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41543b.run();
                return;
        }
    }
}
