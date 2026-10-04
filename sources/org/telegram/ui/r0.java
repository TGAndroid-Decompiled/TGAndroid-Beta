package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f39864a;
    public final Runnable f39865b;

    public r0(int i10, Runnable runnable) {
        this.f39864a = i10;
        this.f39865b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39864a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39865b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39865b.run();
                return;
        }
    }
}
