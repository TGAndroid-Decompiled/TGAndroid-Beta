package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 extends AnimatorListenerAdapter {
    public final int f45113a;
    public final int f45114b;
    public final PhotoViewer f45115c;

    public zt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f45113a = i11;
        this.f45115c = photoViewer;
        this.f45114b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45113a) {
            case 0:
                PhotoViewer photoViewer = this.f45115c;
                au0 au0Var = photoViewer.N1;
                au0Var.f46634e.setVisibility(0);
                FrameLayout frameLayout = au0Var.f46637r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
                org.telegram.messenger.bi.t(translationY, isVar, 320L);
                au0Var.f46639w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(isVar).setDuration(320L).start();
                photoViewer.f34086u4 = this.f45114b;
                photoViewer.q6 = null;
                photoViewer.f34034o6 = -1;
                return;
            default:
                int i10 = this.f45114b;
                PhotoViewer photoViewer2 = this.f45115c;
                photoViewer2.f34086u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f34034o6 = -1;
                return;
        }
    }
}
