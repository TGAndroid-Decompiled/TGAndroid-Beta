package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41559a;
    public final Runnable f41560b;

    public t0(int i10, Runnable runnable) {
        this.f41559a = i10;
        this.f41560b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41559a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41560b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41560b.run();
                return;
        }
    }
}
