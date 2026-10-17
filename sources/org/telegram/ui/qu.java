package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40501a;
    public final int f40502b;
    public final int f40503c;
    public final Activity d;
    public final ru e;

    public qu(ru ruVar, float f7, int i10, int i11, Activity activity) {
        this.e = ruVar;
        this.f40501a = f7;
        this.f40502b = i10;
        this.f40503c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40501a) / 150.0f));
        tu tuVar = this.e.f40814c;
        tuVar.f41827n = i0.b.f(max, this.f40502b, this.f40503c);
        int i10 = tuVar.f41827n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(tuVar.f41827n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
