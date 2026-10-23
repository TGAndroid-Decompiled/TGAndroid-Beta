package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f41273a;
    public final Runnable f41274b;

    public s0(int i10, Runnable runnable) {
        this.f41273a = i10;
        this.f41274b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41273a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41274b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41274b.run();
                return;
        }
    }
}
