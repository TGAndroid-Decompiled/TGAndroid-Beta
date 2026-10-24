package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ru implements ValueAnimator.AnimatorUpdateListener {
    public final float f41233a;
    public final int f41234b;
    public final int f41235c;
    public final Activity d;
    public final su e;

    public ru(su suVar, float f7, int i10, int i11, Activity activity) {
        this.e = suVar;
        this.f41233a = f7;
        this.f41234b = i10;
        this.f41235c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f41233a) / 150.0f));
        uu uuVar = this.e.f41803c;
        uuVar.f42491n = i0.a.f(max, this.f41234b, this.f41235c);
        int i10 = uuVar.f42491n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(uuVar.f42491n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
