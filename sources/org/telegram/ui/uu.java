package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

public final class uu implements ValueAnimator.AnimatorUpdateListener {

    public final float f43289a;

    public final int f43290b;

    public final int f43291c;
    public final Activity d;

    public final vu f43292e;

    public uu(vu vuVar, float f10, int i10, int i11, Activity activity) {
        this.f43292e = vuVar;
        this.f43289a = f10;
        this.f43290b = i10;
        this.f43291c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fMax = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f43289a) / 150.0f));
        wu wuVar = this.f43292e.f43524c;
        wuVar.f44193n = i0.b.d(fMax, this.f43290b, this.f43291c);
        int i10 = wuVar.f44193n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(wuVar.f44193n) >= 0.721f);
    }
}
