package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class rt implements ValueAnimator.AnimatorUpdateListener {
    public final float f49540a;
    public final int f49541b;
    public final int f49542c;
    public final Activity d;
    public final org.telegram.ui.Components.xd f49543e;

    public rt(org.telegram.ui.Components.xd xdVar, float f10, int i7, int i10, Activity activity) {
        this.f49543e = xdVar;
        this.f49540a = f10;
        this.f49541b = i7;
        this.f49542c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f49540a) / 150.0f));
        tt ttVar = (tt) this.f49543e.d;
        ttVar.f50115n = i0.a.f(max, this.f49541b, this.f49542c);
        int i7 = ttVar.f50115n;
        Activity activity = this.d;
        boolean z9 = false;
        org.telegram.messenger.g0.t3(activity, i7, false);
        if (org.telegram.messenger.g0.B(ttVar.f50115n) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.m3(activity, z9);
    }
}
