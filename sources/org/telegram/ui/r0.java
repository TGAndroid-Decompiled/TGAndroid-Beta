package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f37148a;
    public final Runnable f37149b;

    public r0(int i10, Runnable runnable) {
        this.f37148a = i10;
        this.f37149b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37148a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37149b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37149b.run();
                return;
        }
    }
}
