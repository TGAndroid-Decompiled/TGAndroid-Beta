package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41276a;
    public final Runnable f41277b;

    public r0(int i10, Runnable runnable) {
        this.f41276a = i10;
        this.f41277b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41276a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41277b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41277b.run();
                return;
        }
    }
}
