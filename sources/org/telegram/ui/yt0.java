package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f39987a;
    public final int f39988b;
    public final PhotoViewer f39989c;

    public yt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f39987a = i11;
        this.f39989c = photoViewer;
        this.f39988b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39987a) {
            case 0:
                PhotoViewer photoViewer = this.f39989c;
                zt0 zt0Var = photoViewer.N1;
                zt0Var.e.setVisibility(0);
                FrameLayout frameLayout = zt0Var.f41729r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wl.q(translationY, qrVar, 320L);
                zt0Var.f41731w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(qrVar).setDuration(320L).start();
                photoViewer.f31080u4 = this.f39988b;
                photoViewer.q6 = null;
                photoViewer.f31028o6 = -1;
                return;
            default:
                int i10 = this.f39988b;
                PhotoViewer photoViewer2 = this.f39989c;
                photoViewer2.f31080u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31028o6 = -1;
                return;
        }
    }
}
