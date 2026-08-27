package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ws0 extends AnimatorListenerAdapter {

    public final int f44185a;

    public final int f44186b;

    public final PhotoViewer f44187c;

    public ws0(PhotoViewer photoViewer, int i10, int i11) {
        this.f44185a = i11;
        this.f44187c = photoViewer;
        this.f44186b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44185a) {
            case 0:
                PhotoViewer photoViewer = this.f44187c;
                xs0 xs0Var = photoViewer.J1;
                xs0Var.f50726e.setVisibility(0);
                FrameLayout frameLayout = xs0Var.f50729r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.rl.o(viewPropertyAnimatorTranslationY, erVar, 320L);
                xs0Var.f50731w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(erVar).setDuration(320L).start();
                photoViewer.f35731q4 = this.f44186b;
                photoViewer.f35697m6 = null;
                photoViewer.f35681k6 = -1;
                break;
            default:
                int i10 = this.f44186b;
                PhotoViewer photoViewer2 = this.f44187c;
                photoViewer2.f35731q4 = i10;
                photoViewer2.f35697m6 = null;
                photoViewer2.f35681k6 = -1;
                break;
        }
    }
}
