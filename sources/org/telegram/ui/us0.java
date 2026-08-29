package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class us0 extends AnimatorListenerAdapter {
    public final int f43330a;
    public final int f43331b;
    public final PhotoViewer f43332c;

    public us0(PhotoViewer photoViewer, int i10, int i11) {
        this.f43330a = i11;
        this.f43332c = photoViewer;
        this.f43331b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43330a) {
            case 0:
                PhotoViewer photoViewer = this.f43332c;
                vs0 vs0Var = photoViewer.J1;
                vs0Var.f2502e.setVisibility(0);
                FrameLayout frameLayout = vs0Var.f2505r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
                b.q(translationY, jrVar, 320L);
                vs0Var.f2507w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(jrVar).setDuration(320L).start();
                photoViewer.f35795q4 = this.f43331b;
                photoViewer.f35760m6 = null;
                photoViewer.f35744k6 = -1;
                return;
            default:
                int i10 = this.f43331b;
                PhotoViewer photoViewer2 = this.f43332c;
                photoViewer2.f35795q4 = i10;
                photoViewer2.f35760m6 = null;
                photoViewer2.f35744k6 = -1;
                return;
        }
    }
}
