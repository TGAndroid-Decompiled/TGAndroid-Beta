package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class r31 extends AnimatorListenerAdapter {
    public final int f41021a;
    public final SecretMediaViewer f41022b;

    public r31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f41021a = i10;
        this.f41022b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41021a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f41022b;
                Runnable runnable = secretMediaViewer.f34118o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34118o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f41022b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34088a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f41022b;
                Runnable runnable2 = secretMediaViewer3.f34118o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34118o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f41022b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
