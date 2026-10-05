package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class t41 extends AnimatorListenerAdapter {
    public final int f40710a;
    public final SecretMediaViewer f40711b;

    public t41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f40710a = i10;
        this.f40711b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40710a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f40711b;
                Runnable runnable = secretMediaViewer.f34454o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34454o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f40711b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34423a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f40711b;
                Runnable runnable2 = secretMediaViewer3.f34454o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34454o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f40711b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34433e.invalidate();
                return;
        }
    }
}
