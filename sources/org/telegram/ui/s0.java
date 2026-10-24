package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f41264a;
    public final Runnable f41265b;

    public s0(int i10, Runnable runnable) {
        this.f41264a = i10;
        this.f41265b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41264a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41265b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41265b.run();
                return;
        }
    }
}
