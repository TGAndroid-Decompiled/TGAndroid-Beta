package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 extends AnimatorListenerAdapter {
    public final int f36928a;
    public final int f36929b;
    public final PhotoViewer f36930c;

    public rt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36928a = i11;
        this.f36930c = photoViewer;
        this.f36929b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36928a) {
            case 0:
                PhotoViewer photoViewer = this.f36930c;
                st0 st0Var = photoViewer.N1;
                st0Var.e.setVisibility(0);
                FrameLayout frameLayout = st0Var.f41681r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                org.telegram.messenger.ul.r(translationY, rrVar, 320L);
                st0Var.f41683w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(rrVar).setDuration(320L).start();
                photoViewer.f31052u4 = this.f36929b;
                photoViewer.q6 = null;
                photoViewer.f31000o6 = -1;
                return;
            default:
                int i10 = this.f36929b;
                PhotoViewer photoViewer2 = this.f36930c;
                photoViewer2.f31052u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31000o6 = -1;
                return;
        }
    }
}
