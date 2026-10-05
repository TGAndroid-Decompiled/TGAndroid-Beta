package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43643a;
    public final Object f43644b;
    public final View f43645c;
    public final Object d;

    public yw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f43643a = i10;
        this.f43644b = obj;
        this.f43645c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f43643a) {
            case 0:
                dx0 dx0Var = (dx0) this.f43644b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f35900n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f43645c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != dx0Var.f35898e) {
                        if (childAt == dx0Var.f35897c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                db1 db1Var = (db1) this.f43644b;
                db1Var.getClass();
                db1Var.f35743a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f43645c).getEditField().setAlpha(db1Var.f35743a);
                ((org.telegram.ui.Components.wi) this.d).invalidate();
                return;
        }
    }
}
