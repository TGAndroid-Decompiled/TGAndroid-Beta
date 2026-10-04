package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f39869a;
    public final Runnable f39870b;

    public r0(int i10, Runnable runnable) {
        this.f39869a = i10;
        this.f39870b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39869a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39870b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39870b.run();
                return;
        }
    }
}
