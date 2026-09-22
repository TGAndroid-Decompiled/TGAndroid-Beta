package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f40033a;
    public final int f40034b;
    public final PhotoViewer f40035c;

    public yt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f40033a = i11;
        this.f40035c = photoViewer;
        this.f40034b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40033a) {
            case 0:
                PhotoViewer photoViewer = this.f40035c;
                zt0 zt0Var = photoViewer.N1;
                zt0Var.e.setVisibility(0);
                FrameLayout frameLayout = zt0Var.f42022r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.rk.s(translationY, qrVar, 320L);
                zt0Var.f42024w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(qrVar).setDuration(320L).start();
                photoViewer.f31386u4 = this.f40034b;
                photoViewer.q6 = null;
                photoViewer.f31334o6 = -1;
                return;
            default:
                int i10 = this.f40034b;
                PhotoViewer photoViewer2 = this.f40035c;
                photoViewer2.f31386u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31334o6 = -1;
                return;
        }
    }
}
