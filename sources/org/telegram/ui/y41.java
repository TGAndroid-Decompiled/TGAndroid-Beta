package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class y41 extends AnimatorListenerAdapter {
    public final int f39754a;
    public final SecretMediaViewer f39755b;

    public y41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f39754a = i10;
        this.f39755b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39754a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f39755b;
                Runnable runnable = secretMediaViewer.f31467o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31467o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f39755b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f31437a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f39755b;
                Runnable runnable2 = secretMediaViewer3.f31467o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f31467o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f39755b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
