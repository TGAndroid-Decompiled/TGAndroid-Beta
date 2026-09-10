package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xt0 extends AnimatorListenerAdapter {
    public final int f38812a;
    public final int f38813b;
    public final PhotoViewer f38814c;

    public xt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f38812a = i11;
        this.f38814c = photoViewer;
        this.f38813b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38812a) {
            case 0:
                PhotoViewer photoViewer = this.f38814c;
                yt0 yt0Var = photoViewer.N1;
                yt0Var.e.setVisibility(0);
                FrameLayout frameLayout = yt0Var.f40337r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
                org.telegram.messenger.em.q(translationY, wrVar, 320L);
                yt0Var.f40339w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(wrVar).setDuration(320L).start();
                photoViewer.f30193u4 = this.f38813b;
                photoViewer.q6 = null;
                photoViewer.f30141o6 = -1;
                return;
            default:
                int i10 = this.f38813b;
                PhotoViewer photoViewer2 = this.f38814c;
                photoViewer2.f30193u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f30141o6 = -1;
                return;
        }
    }
}
