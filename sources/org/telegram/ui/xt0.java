package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xt0 extends AnimatorListenerAdapter {
    public final int f42917a;
    public final int f42918b;
    public final PhotoViewer f42919c;

    public xt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f42917a = i11;
        this.f42919c = photoViewer;
        this.f42918b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42917a) {
            case 0:
                PhotoViewer photoViewer = this.f42919c;
                yt0 yt0Var = photoViewer.N1;
                yt0Var.f45583e.setVisibility(0);
                FrameLayout frameLayout = yt0Var.f45586r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                org.telegram.messenger.wl.q(translationY, prVar, 320L);
                yt0Var.f45588w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(prVar).setDuration(320L).start();
                photoViewer.f33720u4 = this.f42918b;
                photoViewer.q6 = null;
                photoViewer.f33668o6 = -1;
                return;
            default:
                int i10 = this.f42918b;
                PhotoViewer photoViewer2 = this.f42919c;
                photoViewer2.f33720u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33668o6 = -1;
                return;
        }
    }
}
