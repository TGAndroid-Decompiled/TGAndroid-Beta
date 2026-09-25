package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f36985a;
    public final int f36986b;
    public final PhotoViewer f36987c;

    public qt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36985a = i11;
        this.f36987c = photoViewer;
        this.f36986b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36985a) {
            case 0:
                PhotoViewer photoViewer = this.f36987c;
                rt0 rt0Var = photoViewer.N1;
                rt0Var.e.setVisibility(0);
                FrameLayout frameLayout = rt0Var.f41988r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                org.telegram.messenger.ok.s(translationY, rrVar, 320L);
                rt0Var.f41990w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(rrVar).setDuration(320L).start();
                photoViewer.f31368u4 = this.f36986b;
                photoViewer.q6 = null;
                photoViewer.f31316o6 = -1;
                return;
            default:
                int i10 = this.f36986b;
                PhotoViewer photoViewer2 = this.f36987c;
                photoViewer2.f31368u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31316o6 = -1;
                return;
        }
    }
}
