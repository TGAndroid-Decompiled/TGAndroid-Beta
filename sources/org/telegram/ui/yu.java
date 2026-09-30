package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class yu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40361a;
    public final int f40362b;
    public final int f40363c;
    public final Activity d;
    public final zu e;

    public yu(zu zuVar, float f7, int i10, int i11, Activity activity) {
        this.e = zuVar;
        this.f40361a = f7;
        this.f40362b = i10;
        this.f40363c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40361a) / 150.0f));
        bv bvVar = this.e.f40680c;
        bvVar.f32581n = i0.a.d(max, this.f40362b, this.f40363c);
        int i10 = bvVar.f32581n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(bvVar.f32581n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
