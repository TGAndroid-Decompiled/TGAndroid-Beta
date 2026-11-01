package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class su implements ValueAnimator.AnimatorUpdateListener {
    public final float f41461a;
    public final int f41462b;
    public final int f41463c;
    public final Activity d;
    public final org.telegram.ui.Components.sd e;

    public su(org.telegram.ui.Components.sd sdVar, float f7, int i10, int i11, Activity activity) {
        this.e = sdVar;
        this.f41461a = f7;
        this.f41462b = i10;
        this.f41463c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f41461a) / 150.0f));
        uu uuVar = (uu) this.e.d;
        uuVar.f42344n = i0.b.f(max, this.f41462b, this.f41463c);
        int i10 = uuVar.f42344n;
        Activity activity = this.d;
        boolean z10 = false;
        org.telegram.messenger.i0.s3(activity, i10, false);
        if (org.telegram.messenger.i0.B(uuVar.f42344n) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.i0.l3(activity, z10);
    }
}
