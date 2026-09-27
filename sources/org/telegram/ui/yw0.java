package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40344a;
    public final Object f40345b;
    public final View f40346c;
    public final Object d;

    public yw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f40344a = i10;
        this.f40345b = obj;
        this.f40346c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f40344a) {
            case 0:
                dx0 dx0Var = (dx0) this.f40345b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f33062n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f40346c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != dx0Var.e) {
                        if (childAt == dx0Var.f33060c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                bb1 bb1Var = (bb1) this.f40345b;
                bb1Var.getClass();
                bb1Var.f32311a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f40346c).getEditField().setAlpha(bb1Var.f32311a);
                ((org.telegram.ui.Components.vi) this.d).invalidate();
                return;
        }
    }
}
