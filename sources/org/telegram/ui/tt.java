package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class tt implements ValueAnimator.AnimatorUpdateListener {
    public final float f50236a;
    public final int f50237b;
    public final int f50238c;
    public final Activity d;
    public final org.telegram.ui.Components.xd f50239e;

    public tt(org.telegram.ui.Components.xd xdVar, float f10, int i7, int i10, Activity activity) {
        this.f50239e = xdVar;
        this.f50236a = f10;
        this.f50237b = i7;
        this.f50238c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f50236a) / 150.0f));
        vt vtVar = (vt) this.f50239e.d;
        vtVar.f50767n = i0.a.f(max, this.f50237b, this.f50238c);
        int i7 = vtVar.f50767n;
        Activity activity = this.d;
        boolean z9 = false;
        org.telegram.messenger.g0.t3(activity, i7, false);
        if (org.telegram.messenger.g0.B(vtVar.f50767n) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.m3(activity, z9);
    }
}
