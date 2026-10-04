package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f39863a;
    public final Runnable f39864b;

    public r0(int i10, Runnable runnable) {
        this.f39863a = i10;
        this.f39864b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39863a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39864b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39864b.run();
                return;
        }
    }
}
