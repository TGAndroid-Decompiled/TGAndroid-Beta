package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40526a;
    public final int f40527b;
    public final int f40528c;
    public final Activity d;
    public final ru e;

    public qu(ru ruVar, float f7, int i10, int i11, Activity activity) {
        this.e = ruVar;
        this.f40526a = f7;
        this.f40527b = i10;
        this.f40528c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40526a) / 150.0f));
        tu tuVar = this.e.f40835c;
        tuVar.f41842n = i0.a.f(max, this.f40527b, this.f40528c);
        int i10 = tuVar.f41842n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(tuVar.f41842n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
