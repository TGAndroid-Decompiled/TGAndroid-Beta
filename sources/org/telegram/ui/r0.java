package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f36647a;
    public final Runnable f36648b;

    public r0(int i10, Runnable runnable) {
        this.f36647a = i10;
        this.f36648b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36647a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36648b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36648b.run();
                return;
        }
    }
}
