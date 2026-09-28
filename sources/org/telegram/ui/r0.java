package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f37149a;
    public final Runnable f37150b;

    public r0(int i10, Runnable runnable) {
        this.f37149a = i10;
        this.f37150b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37149a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37150b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37150b.run();
                return;
        }
    }
}
