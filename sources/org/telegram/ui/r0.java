package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41230a;
    public final Runnable f41231b;

    public r0(int i10, Runnable runnable) {
        this.f41230a = i10;
        this.f41231b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41230a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41231b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41231b.run();
                return;
        }
    }
}
