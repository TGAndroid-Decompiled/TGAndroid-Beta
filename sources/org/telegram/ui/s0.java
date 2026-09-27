package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final int f37255a;
    public final Runnable f37256b;

    public s0(int i10, Runnable runnable) {
        this.f37255a = i10;
        this.f37256b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37255a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f37256b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37256b.run();
                return;
        }
    }
}
