package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 extends AnimatorListenerAdapter {
    public final int f45069a;
    public final int f45070b;
    public final PhotoViewer f45071c;

    public zt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f45069a = i11;
        this.f45071c = photoViewer;
        this.f45070b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45069a) {
            case 0:
                PhotoViewer photoViewer = this.f45071c;
                au0 au0Var = photoViewer.N1;
                au0Var.f46590e.setVisibility(0);
                FrameLayout frameLayout = au0Var.f46593r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
                org.telegram.messenger.bi.t(translationY, hsVar, 320L);
                au0Var.f46595w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(hsVar).setDuration(320L).start();
                photoViewer.f34048u4 = this.f45070b;
                photoViewer.q6 = null;
                photoViewer.f33996o6 = -1;
                return;
            default:
                int i10 = this.f45070b;
                PhotoViewer photoViewer2 = this.f45071c;
                photoViewer2.f34048u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33996o6 = -1;
                return;
        }
    }
}
