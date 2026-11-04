package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class sp0 implements ViewTreeObserver.OnPreDrawListener {
    public final kq0 f49587a;
    public final Integer f49588b;
    public final PhotoViewer f49589c;

    public sp0(PhotoViewer photoViewer, kq0 kq0Var, Integer num) {
        this.f49589c = photoViewer;
        this.f49587a = kq0Var;
        this.f49588b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f49589c;
        photoViewer.f41437h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
        duration.setInterpolator(xqVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.f41543t3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.f41543t3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.f41420f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.f41499o4 = 4;
        photoViewer.f41420f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        ci.t4 t4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t4Var, View.TRANSLATION_Y, t4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(xqVar);
        ci.t4 t4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t4Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(xqVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f41420f0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f41462k0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new rp0(this));
        animatorSet.start();
        return true;
    }
}
