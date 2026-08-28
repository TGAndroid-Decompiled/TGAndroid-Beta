package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vs0 extends AnimatorListenerAdapter {
    public final int f43578a;
    public final int f43579b;
    public final PhotoViewer f43580c;

    public vs0(PhotoViewer photoViewer, int i9, int i10) {
        this.f43578a = i10;
        this.f43580c = photoViewer;
        this.f43579b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43578a) {
            case 0:
                PhotoViewer photoViewer = this.f43580c;
                ws0 ws0Var = photoViewer.J1;
                ws0Var.f50131e.setVisibility(0);
                FrameLayout frameLayout = ws0Var.f50134r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.ll.r(translationY, grVar, 320L);
                ws0Var.f50136w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(grVar).setDuration(320L).start();
                photoViewer.f35727q4 = this.f43579b;
                photoViewer.f35694m6 = null;
                photoViewer.f35678k6 = -1;
                return;
            default:
                int i9 = this.f43579b;
                PhotoViewer photoViewer2 = this.f43580c;
                photoViewer2.f35727q4 = i9;
                photoViewer2.f35694m6 = null;
                photoViewer2.f35678k6 = -1;
                return;
        }
    }
}
