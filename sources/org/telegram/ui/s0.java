package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f40970a;
    public final Runnable f40971b;

    public s0(int i10, Runnable runnable) {
        this.f40970a = i10;
        this.f40971b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40970a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f40971b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f40971b.run();
                return;
        }
    }
}
