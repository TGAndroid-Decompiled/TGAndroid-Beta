package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f37137a;
    public final Runnable f37138b;

    public r0(int i10, Runnable runnable) {
        this.f37137a = i10;
        this.f37138b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37137a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37138b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37138b.run();
                return;
        }
    }
}
