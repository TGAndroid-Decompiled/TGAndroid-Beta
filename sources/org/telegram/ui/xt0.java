package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xt0 extends AnimatorListenerAdapter {
    public final int f42890a;
    public final int f42891b;
    public final PhotoViewer f42892c;

    public xt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f42890a = i11;
        this.f42892c = photoViewer;
        this.f42891b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42890a) {
            case 0:
                PhotoViewer photoViewer = this.f42892c;
                yt0 yt0Var = photoViewer.N1;
                yt0Var.f45555e.setVisibility(0);
                FrameLayout frameLayout = yt0Var.f45558r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                org.telegram.messenger.vl.q(translationY, prVar, 320L);
                yt0Var.f45560w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(prVar).setDuration(320L).start();
                photoViewer.f33693u4 = this.f42891b;
                photoViewer.q6 = null;
                photoViewer.f33641o6 = -1;
                return;
            default:
                int i10 = this.f42891b;
                PhotoViewer photoViewer2 = this.f42892c;
                photoViewer2.f33693u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33641o6 = -1;
                return;
        }
    }
}
