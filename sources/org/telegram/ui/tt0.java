package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ou0 f38587a;
    public final Integer f38588b;
    public final PhotoViewer f38589c;

    public tt0(PhotoViewer photoViewer, ou0 ou0Var, Integer num) {
        this.f38589c = photoViewer;
        this.f38587a = ou0Var;
        this.f38588b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38589c;
        photoViewer.f31697d0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.C.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.C.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
        duration.setInterpolator(mrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.f31807p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31807p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.f31679b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.f31764k4 = 4;
        photoViewer.f31679b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        dg.s1 s1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s1Var, View.TRANSLATION_Y, s1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(mrVar);
        dg.s1 s1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(s1Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(mrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f31679b0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f31724g0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new st0(this));
        animatorSet.start();
        return true;
    }
}
