package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class zu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40246a;
    public final int f40247b;
    public final int f40248c;
    public final Activity d;
    public final av e;

    public zu(av avVar, float f7, int i10, int i11, Activity activity) {
        this.e = avVar;
        this.f40246a = f7;
        this.f40247b = i10;
        this.f40248c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40246a) / 150.0f));
        cv cvVar = this.e.f31890c;
        cvVar.f32420n = i0.a.d(max, this.f40247b, this.f40248c);
        int i10 = cvVar.f32420n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(cvVar.f32420n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
