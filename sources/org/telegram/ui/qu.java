package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qu implements ValueAnimator.AnimatorUpdateListener {
    public final float f42791a;
    public final int f42792b;
    public final int f42793c;
    public final Activity d;
    public final ru e;

    public qu(ru ruVar, float f7, int i10, int i11, Activity activity) {
        this.e = ruVar;
        this.f42791a = f7;
        this.f42792b = i10;
        this.f42793c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f42791a) / 150.0f));
        tu tuVar = this.e.f43172c;
        tuVar.f43780n = i0.a.f(max, this.f42792b, this.f42793c);
        int i10 = tuVar.f43780n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(tuVar.f43780n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
