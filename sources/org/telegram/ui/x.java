package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class x implements ViewTreeObserver.OnPreDrawListener {
    public final ed8 a;
    public final Integer b;
    public final PhotoViewer c;

    public x(PhotoViewer photoViewer, ed8 ed8Var, Integer num) {
        this.c = photoViewer;
        this.a = ed8Var;
        this.b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-hl.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        k43 k43Var = k43.f;
        duration.setInterpolator(k43Var).start();
        photoViewer.O0.setTranslationY(-hl.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
        photoViewer.P0.setTranslationY(-hl.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
        photoViewer.Q0.setTranslationY(hl.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
        photoViewer.T0.setTranslationY(hl.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
        photoViewer.s3.setTranslationY(hl.L(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.m4 = (byte) 4;
        photoViewer.f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        jo0 jo0Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(jo0Var, View.TRANSLATION_Y, jo0Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(k43Var);
        jo0 jo0Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(jo0Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(k43Var);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.k0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new w(this));
        animatorSet.start();
        return true;
    }
}
