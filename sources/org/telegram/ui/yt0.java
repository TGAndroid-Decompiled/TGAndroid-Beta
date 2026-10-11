package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f44534a;
    public final int f44535b;
    public final PhotoViewer f44536c;

    public yt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f44534a = i11;
        this.f44536c = photoViewer;
        this.f44535b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44534a) {
            case 0:
                PhotoViewer photoViewer = this.f44536c;
                zt0 zt0Var = photoViewer.N1;
                zt0Var.f46710e.setVisibility(0);
                FrameLayout frameLayout = zt0Var.f46713r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
                org.telegram.messenger.ai.t(translationY, isVar, 320L);
                zt0Var.f46715w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(isVar).setDuration(320L).start();
                photoViewer.f34110u4 = this.f44535b;
                photoViewer.q6 = null;
                photoViewer.f34058o6 = -1;
                return;
            default:
                int i10 = this.f44535b;
                PhotoViewer photoViewer2 = this.f44536c;
                photoViewer2.f34110u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f34058o6 = -1;
                return;
        }
    }
}
