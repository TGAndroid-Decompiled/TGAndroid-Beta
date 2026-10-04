package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f40960a;
    public final int f40961b;
    public final PhotoViewer f40962c;

    public tt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f40960a = i11;
        this.f40962c = photoViewer;
        this.f40961b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40960a) {
            case 0:
                PhotoViewer photoViewer = this.f40962c;
                ut0 ut0Var = photoViewer.N1;
                ut0Var.f45379e.setVisibility(0);
                FrameLayout frameLayout = ut0Var.f45382r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.ok.s(translationY, trVar, 320L);
                ut0Var.f45384w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(trVar).setDuration(320L).start();
                photoViewer.f34039u4 = this.f40961b;
                photoViewer.q6 = null;
                photoViewer.f33987o6 = -1;
                return;
            default:
                int i10 = this.f40961b;
                PhotoViewer photoViewer2 = this.f40962c;
                photoViewer2.f34039u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33987o6 = -1;
                return;
        }
    }
}
