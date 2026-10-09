package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41232a;
    public final Runnable f41233b;

    public r0(int i10, Runnable runnable) {
        this.f41232a = i10;
        this.f41233b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41232a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41233b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41233b.run();
                return;
        }
    }
}
