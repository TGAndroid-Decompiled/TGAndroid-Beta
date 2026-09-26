package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class yu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40250a;
    public final int f40251b;
    public final int f40252c;
    public final Activity d;
    public final zu e;

    public yu(zu zuVar, float f7, int i10, int i11, Activity activity) {
        this.e = zuVar;
        this.f40250a = f7;
        this.f40251b = i10;
        this.f40252c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40250a) / 150.0f));
        bv bvVar = this.e.f40580c;
        bvVar.f32497n = i0.a.d(max, this.f40251b, this.f40252c);
        int i10 = bvVar.f32497n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(bvVar.f32497n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
