package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f37085a;
    public final int f37086b;
    public final PhotoViewer f37087c;

    public qt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37085a = i11;
        this.f37087c = photoViewer;
        this.f37086b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37085a) {
            case 0:
                PhotoViewer photoViewer = this.f37087c;
                rt0 rt0Var = photoViewer.N1;
                rt0Var.e.setVisibility(0);
                FrameLayout frameLayout = rt0Var.f42090r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.ok.s(translationY, trVar, 320L);
                rt0Var.f42092w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(trVar).setDuration(320L).start();
                photoViewer.f31441u4 = this.f37086b;
                photoViewer.q6 = null;
                photoViewer.f31389o6 = -1;
                return;
            default:
                int i10 = this.f37086b;
                PhotoViewer photoViewer2 = this.f37087c;
                photoViewer2.f31441u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31389o6 = -1;
                return;
        }
    }
}
