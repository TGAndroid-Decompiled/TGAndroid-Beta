package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class r41 extends AnimatorListenerAdapter {
    public final int f36691a;
    public final SecretMediaViewer f36692b;

    public r41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f36691a = i10;
        this.f36692b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36691a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f36692b;
                Runnable runnable = secretMediaViewer.f31438o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31438o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f36692b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f31408a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f36692b;
                Runnable runnable2 = secretMediaViewer3.f31438o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f31438o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f36692b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
