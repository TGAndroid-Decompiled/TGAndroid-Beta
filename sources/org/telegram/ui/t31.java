package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class t31 extends AnimatorListenerAdapter {
    public final int f43669a;
    public final SecretMediaViewer f43670b;

    public t31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f43669a = i10;
        this.f43670b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43669a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f43670b;
                Runnable runnable = secretMediaViewer.f36182o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36182o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f43670b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f36152a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f43670b;
                Runnable runnable2 = secretMediaViewer3.f36182o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f36182o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f43670b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
