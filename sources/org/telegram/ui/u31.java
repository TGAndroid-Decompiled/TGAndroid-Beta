package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class u31 extends AnimatorListenerAdapter {
    public final int f43123a;
    public final SecretMediaViewer f43124b;

    public u31(SecretMediaViewer secretMediaViewer, int i9) {
        this.f43123a = i9;
        this.f43124b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43123a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f43124b;
                Runnable runnable = secretMediaViewer.f36141k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36141k0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f43124b;
                AnimatorSet animatorSet = secretMediaViewer2.C;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.B.setVisibility(8);
                    secretMediaViewer2.C = null;
                    secretMediaViewer2.W.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f43124b;
                Runnable runnable2 = secretMediaViewer3.f36141k0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f36141k0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f43124b;
                secretMediaViewer4.G0 = null;
                secretMediaViewer4.f36127e.invalidate();
                return;
        }
    }
}
