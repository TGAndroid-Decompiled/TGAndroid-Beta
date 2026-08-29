package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45342a;
    public final Object f45343b;
    public final View f45344c;
    public final Object d;

    public zv0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f45342a = i10;
        this.f45343b = obj;
        this.f45344c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f45342a) {
            case 0:
                ew0 ew0Var = (ew0) this.f45343b;
                PremiumPreviewFragment premiumPreviewFragment = ew0Var.f37915n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f45344c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.Q.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i10);
                    if (childAt != ew0Var.f37913e) {
                        if (childAt == ew0Var.f37912c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                da1 da1Var = (da1) this.f45343b;
                da1Var.getClass();
                da1Var.f37466a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f45344c).getEditField().setAlpha(da1Var.f37466a);
                ((org.telegram.ui.Components.mi) this.d).invalidate();
                return;
        }
    }
}
