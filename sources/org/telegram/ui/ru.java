package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ru implements ValueAnimator.AnimatorUpdateListener {
    public final float f41247a;
    public final int f41248b;
    public final int f41249c;
    public final Activity d;
    public final su e;

    public ru(su suVar, float f7, int i10, int i11, Activity activity) {
        this.e = suVar;
        this.f41247a = f7;
        this.f41248b = i10;
        this.f41249c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f41247a) / 150.0f));
        uu uuVar = this.e.f41807c;
        uuVar.f42506n = i0.a.f(max, this.f41248b, this.f41249c);
        int i10 = uuVar.f42506n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(uuVar.f42506n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
