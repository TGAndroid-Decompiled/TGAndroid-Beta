package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class rt implements ValueAnimator.AnimatorUpdateListener {
    public final float f49568a;
    public final int f49569b;
    public final int f49570c;
    public final Activity d;
    public final org.telegram.ui.Components.xd f49571e;

    public rt(org.telegram.ui.Components.xd xdVar, float f10, int i7, int i10, Activity activity) {
        this.f49571e = xdVar;
        this.f49568a = f10;
        this.f49569b = i7;
        this.f49570c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f49568a) / 150.0f));
        tt ttVar = (tt) this.f49571e.d;
        ttVar.f50143n = i0.a.f(max, this.f49569b, this.f49570c);
        int i7 = ttVar.f50143n;
        Activity activity = this.d;
        boolean z9 = false;
        org.telegram.messenger.g0.t3(activity, i7, false);
        if (org.telegram.messenger.g0.B(ttVar.f50143n) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.m3(activity, z9);
    }
}
