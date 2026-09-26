package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f36983a;
    public final int f36984b;
    public final PhotoViewer f36985c;

    public qt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36983a = i11;
        this.f36985c = photoViewer;
        this.f36984b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36983a) {
            case 0:
                PhotoViewer photoViewer = this.f36985c;
                rt0 rt0Var = photoViewer.N1;
                rt0Var.e.setVisibility(0);
                FrameLayout frameLayout = rt0Var.f41986r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
                org.telegram.messenger.ok.s(translationY, srVar, 320L);
                rt0Var.f41988w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(srVar).setDuration(320L).start();
                photoViewer.f31366u4 = this.f36984b;
                photoViewer.q6 = null;
                photoViewer.f31314o6 = -1;
                return;
            default:
                int i10 = this.f36984b;
                PhotoViewer photoViewer2 = this.f36985c;
                photoViewer2.f31366u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31314o6 = -1;
                return;
        }
    }
}
