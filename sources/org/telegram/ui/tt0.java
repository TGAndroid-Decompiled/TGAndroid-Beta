package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f41022a;
    public final int f41023b;
    public final PhotoViewer f41024c;

    public tt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f41022a = i11;
        this.f41024c = photoViewer;
        this.f41023b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41022a) {
            case 0:
                PhotoViewer photoViewer = this.f41024c;
                ut0 ut0Var = photoViewer.N1;
                ut0Var.f45393e.setVisibility(0);
                FrameLayout frameLayout = ut0Var.f45396r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.bi.r(translationY, trVar, 320L);
                ut0Var.f45398w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(trVar).setDuration(320L).start();
                photoViewer.f34058u4 = this.f41023b;
                photoViewer.q6 = null;
                photoViewer.f34006o6 = -1;
                return;
            default:
                int i10 = this.f41023b;
                PhotoViewer photoViewer2 = this.f41024c;
                photoViewer2.f34058u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f34006o6 = -1;
                return;
        }
    }
}
