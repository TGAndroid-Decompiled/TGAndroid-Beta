package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f39959a;
    public final int f39960b;
    public final PhotoViewer f39961c;

    public yt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f39959a = i11;
        this.f39961c = photoViewer;
        this.f39960b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39959a) {
            case 0:
                PhotoViewer photoViewer = this.f39961c;
                zt0 zt0Var = photoViewer.N1;
                zt0Var.e.setVisibility(0);
                FrameLayout frameLayout = zt0Var.f41725r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.vl.r(translationY, qrVar, 320L);
                zt0Var.f41727w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(qrVar).setDuration(320L).start();
                photoViewer.f31078u4 = this.f39960b;
                photoViewer.q6 = null;
                photoViewer.f31026o6 = -1;
                return;
            default:
                int i10 = this.f39960b;
                PhotoViewer photoViewer2 = this.f39961c;
                photoViewer2.f31078u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31026o6 = -1;
                return;
        }
    }
}
