package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qu implements ValueAnimator.AnimatorUpdateListener {
    public final float f40492a;
    public final int f40493b;
    public final int f40494c;
    public final Activity d;
    public final ru e;

    public qu(ru ruVar, float f7, int i10, int i11, Activity activity) {
        this.e = ruVar;
        this.f40492a = f7;
        this.f40493b = i10;
        this.f40494c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f40492a) / 150.0f));
        tu tuVar = this.e.f40797c;
        tuVar.f41801n = i0.a.f(max, this.f40493b, this.f40494c);
        int i10 = tuVar.f41801n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(tuVar.f41801n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
