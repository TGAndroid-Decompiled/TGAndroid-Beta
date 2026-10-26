package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class ut0 implements ViewTreeObserver.OnPreDrawListener {
    public final ou0 f44533a;
    public final Integer f44534b;
    public final PhotoViewer f44535c;

    public ut0(PhotoViewer photoViewer, ou0 ou0Var, Integer num) {
        this.f44535c = photoViewer;
        this.f44533a = ou0Var;
        this.f44534b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f44535c;
        photoViewer.f35664g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
        duration.setInterpolator(dsVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.f35772s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f35772s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.f35646e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f35728n4 = 4;
        photoViewer.f35646e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bi.j5 j5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(j5Var, View.TRANSLATION_Y, j5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(dsVar);
        bi.j5 j5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(j5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(dsVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f35646e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f35690j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new tt0(this));
        animatorSet.start();
        return true;
    }
}
