package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class ut implements ValueAnimator.AnimatorUpdateListener {
    public final float f50563a;
    public final int f50564b;
    public final int f50565c;
    public final Activity d;
    public final org.telegram.ui.Components.wd f50566e;

    public ut(org.telegram.ui.Components.wd wdVar, float f10, int i7, int i10, Activity activity) {
        this.f50566e = wdVar;
        this.f50563a = f10;
        this.f50564b = i7;
        this.f50565c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f50563a) / 150.0f));
        wt wtVar = (wt) this.f50566e.d;
        wtVar.f51437n = i0.a.f(max, this.f50564b, this.f50565c);
        int i7 = wtVar.f51437n;
        Activity activity = this.d;
        boolean z9 = false;
        org.telegram.messenger.g0.t3(activity, i7, false);
        if (org.telegram.messenger.g0.B(wtVar.f51437n) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.m3(activity, z9);
    }
}
