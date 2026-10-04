package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class v41 extends AnimatorListenerAdapter {
    public final int f41556a;
    public final SecretMediaViewer f41557b;

    public v41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f41556a = i10;
        this.f41557b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41556a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f41557b;
                Runnable runnable = secretMediaViewer.f34435o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34435o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f41557b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34404a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f41557b;
                Runnable runnable2 = secretMediaViewer3.f34435o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34435o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f41557b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34414e.invalidate();
                return;
        }
    }
}
