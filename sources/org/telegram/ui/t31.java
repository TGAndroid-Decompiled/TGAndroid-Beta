package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class t31 extends AnimatorListenerAdapter {

    public final int f42775a;

    public final SecretMediaViewer f42776b;

    public t31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f42775a = i10;
        this.f42776b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42775a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f42776b;
                Runnable runnable = secretMediaViewer.f36144k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36144k0 = null;
                }
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f42776b;
                AnimatorSet animatorSet = secretMediaViewer2.C;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.B.setVisibility(8);
                    secretMediaViewer2.C = null;
                    secretMediaViewer2.W.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f42776b;
                Runnable runnable2 = secretMediaViewer3.f36144k0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f36144k0 = null;
                }
                break;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f42776b;
                secretMediaViewer4.G0 = null;
                secretMediaViewer4.f36130e.invalidate();
                break;
        }
    }
}
