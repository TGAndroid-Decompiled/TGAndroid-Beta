package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class s41 extends AnimatorListenerAdapter {
    public final int f37576a;
    public final SecretMediaViewer f37577b;

    public s41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f37576a = i10;
        this.f37577b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37576a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f37577b;
                Runnable runnable = secretMediaViewer.f31739o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31739o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f37577b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f31709a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f37577b;
                Runnable runnable2 = secretMediaViewer3.f31739o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f31739o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f37577b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
