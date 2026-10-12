package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41464a;
    public final Runnable f41465b;

    public r0(int i10, Runnable runnable) {
        this.f41464a = i10;
        this.f41465b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41464a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41465b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41465b.run();
                return;
        }
    }
}
