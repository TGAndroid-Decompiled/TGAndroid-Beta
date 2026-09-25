package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f37150a;
    public final Runnable f37151b;

    public r0(int i10, Runnable runnable) {
        this.f37150a = i10;
        this.f37151b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37150a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37151b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37151b.run();
                return;
        }
    }
}
