package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f40966a;
    public final int f40967b;
    public final PhotoViewer f40968c;

    public tt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f40966a = i11;
        this.f40968c = photoViewer;
        this.f40967b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40966a) {
            case 0:
                PhotoViewer photoViewer = this.f40968c;
                ut0 ut0Var = photoViewer.N1;
                ut0Var.f45386e.setVisibility(0);
                FrameLayout frameLayout = ut0Var.f45389r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.bi.r(translationY, trVar, 320L);
                ut0Var.f45391w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(trVar).setDuration(320L).start();
                photoViewer.f34045u4 = this.f40967b;
                photoViewer.q6 = null;
                photoViewer.f33993o6 = -1;
                return;
            default:
                int i10 = this.f40967b;
                PhotoViewer photoViewer2 = this.f40968c;
                photoViewer2.f34045u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33993o6 = -1;
                return;
        }
    }
}
