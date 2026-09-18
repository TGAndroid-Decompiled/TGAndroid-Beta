package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class z41 extends AnimatorListenerAdapter {
    public final int f39971a;
    public final SecretMediaViewer f39972b;

    public z41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f39971a = i10;
        this.f39972b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39971a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f39972b;
                Runnable runnable = secretMediaViewer.f31711o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31711o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f39972b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f31681a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f39972b;
                Runnable runnable2 = secretMediaViewer3.f31711o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f31711o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f39972b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
