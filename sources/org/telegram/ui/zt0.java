package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 implements ViewTreeObserver.OnPreDrawListener {
    public final tu0 f40562a;
    public final Integer f40563b;
    public final PhotoViewer f40564c;

    public zt0(PhotoViewer photoViewer, tu0 tu0Var, Integer num) {
        this.f40564c = photoViewer;
        this.f40562a = tu0Var;
        this.f40563b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f40564c;
        photoViewer.f31226g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
        duration.setInterpolator(rrVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.f31334s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31334s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.f31209e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f31290n4 = 4;
        photoViewer.f31209e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        t5 t5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t5Var, View.TRANSLATION_Y, t5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(rrVar);
        t5 t5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(rrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f31209e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f31253j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new yt0(this));
        animatorSet.start();
        return true;
    }
}
