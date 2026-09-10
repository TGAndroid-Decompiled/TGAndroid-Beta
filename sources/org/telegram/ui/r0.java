package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f36163a;
    public final Runnable f36164b;

    public r0(int i10, Runnable runnable) {
        this.f36163a = i10;
        this.f36164b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36163a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36164b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36164b.run();
                return;
        }
    }
}
