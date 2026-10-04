package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class v41 extends AnimatorListenerAdapter {
    public final int f41563a;
    public final SecretMediaViewer f41564b;

    public v41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f41563a = i10;
        this.f41564b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41563a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f41564b;
                Runnable runnable = secretMediaViewer.f34441o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34441o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f41564b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34410a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f41564b;
                Runnable runnable2 = secretMediaViewer3.f34441o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34441o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f41564b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34420e.invalidate();
                return;
        }
    }
}
