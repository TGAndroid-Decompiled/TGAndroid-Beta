package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f37250a;
    public final Runnable f37251b;

    public r0(int i10, Runnable runnable) {
        this.f37250a = i10;
        this.f37251b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37250a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37251b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37251b.run();
                return;
        }
    }
}
