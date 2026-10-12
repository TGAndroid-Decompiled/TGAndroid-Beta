package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41460a;
    public final Runnable f41461b;

    public r0(int i10, Runnable runnable) {
        this.f41460a = i10;
        this.f41461b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41460a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41461b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41461b.run();
                return;
        }
    }
}
