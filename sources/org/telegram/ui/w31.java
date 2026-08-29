package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class w31 extends AnimatorListenerAdapter {
    public final int f43832a;
    public final SecretMediaViewer f43833b;

    public w31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f43832a = i10;
        this.f43833b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43832a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f43833b;
                Runnable runnable = secretMediaViewer.f36206k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36206k0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f43833b;
                AnimatorSet animatorSet = secretMediaViewer2.C;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.B.setVisibility(8);
                    secretMediaViewer2.C = null;
                    secretMediaViewer2.W.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f43833b;
                Runnable runnable2 = secretMediaViewer3.f36206k0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f36206k0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f43833b;
                secretMediaViewer4.G0 = null;
                secretMediaViewer4.f36192e.invalidate();
                return;
        }
    }
}
