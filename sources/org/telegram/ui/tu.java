package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class tu implements ValueAnimator.AnimatorUpdateListener {
    public final float f41941a;
    public final int f41942b;
    public final int f41943c;
    public final Activity d;
    public final org.telegram.ui.Components.sd e;

    public tu(org.telegram.ui.Components.sd sdVar, float f7, int i10, int i11, Activity activity) {
        this.e = sdVar;
        this.f41941a = f7;
        this.f41942b = i10;
        this.f41943c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f41941a) / 150.0f));
        vu vuVar = (vu) this.e.d;
        vuVar.f42815n = i0.b.f(max, this.f41942b, this.f41943c);
        int i10 = vuVar.f42815n;
        Activity activity = this.d;
        boolean z10 = false;
        org.telegram.messenger.i0.s3(activity, i10, false);
        if (org.telegram.messenger.i0.B(vuVar.f42815n) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.i0.l3(activity, z10);
    }
}
