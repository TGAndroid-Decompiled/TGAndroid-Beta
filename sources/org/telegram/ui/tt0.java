package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f40959a;
    public final int f40960b;
    public final PhotoViewer f40961c;

    public tt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f40959a = i11;
        this.f40961c = photoViewer;
        this.f40960b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40959a) {
            case 0:
                PhotoViewer photoViewer = this.f40961c;
                ut0 ut0Var = photoViewer.N1;
                ut0Var.f45378e.setVisibility(0);
                FrameLayout frameLayout = ut0Var.f45381r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.ok.s(translationY, trVar, 320L);
                ut0Var.f45383w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(trVar).setDuration(320L).start();
                photoViewer.f34038u4 = this.f40960b;
                photoViewer.q6 = null;
                photoViewer.f33986o6 = -1;
                return;
            default:
                int i10 = this.f40960b;
                PhotoViewer photoViewer2 = this.f40961c;
                photoViewer2.f34038u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33986o6 = -1;
                return;
        }
    }
}
