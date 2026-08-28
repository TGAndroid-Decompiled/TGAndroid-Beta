package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ru implements ValueAnimator.AnimatorUpdateListener {
    public final float f42490a;
    public final int f42491b;
    public final int f42492c;
    public final Activity d;
    public final su f42493e;

    public ru(su suVar, float f10, int i9, int i10, Activity activity) {
        this.f42493e = suVar;
        this.f42490a = f10;
        this.f42491b = i9;
        this.f42492c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f42490a) / 150.0f));
        tu tuVar = this.f42493e.f42768c;
        tuVar.f43066n = i0.a.d(max, this.f42491b, this.f42492c);
        int i9 = tuVar.f43066n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i9, false);
        if (AndroidUtilities.computePerceivedBrightness(tuVar.f43066n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
