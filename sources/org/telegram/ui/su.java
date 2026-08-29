package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class su implements ValueAnimator.AnimatorUpdateListener {
    public final float f42462a;
    public final int f42463b;
    public final int f42464c;
    public final Activity d;
    public final tu f42465e;

    public su(tu tuVar, float f9, int i10, int i11, Activity activity) {
        this.f42465e = tuVar;
        this.f42462a = f9;
        this.f42463b = i10;
        this.f42464c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f42462a) / 150.0f));
        uu uuVar = this.f42465e.f43098c;
        uuVar.f43347n = i0.a.d(max, this.f42463b, this.f42464c);
        int i10 = uuVar.f43347n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(uuVar.f43347n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
