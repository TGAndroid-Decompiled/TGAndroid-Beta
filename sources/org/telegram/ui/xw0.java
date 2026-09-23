package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39672a;
    public final Object f39673b;
    public final View f39674c;
    public final Object d;

    public xw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f39672a = i10;
        this.f39673b = obj;
        this.f39674c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f39672a) {
            case 0:
                cx0 cx0Var = (cx0) this.f39673b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f32435n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f39674c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != cx0Var.e) {
                        if (childAt == cx0Var.f32433c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                bb1 bb1Var = (bb1) this.f39673b;
                bb1Var.getClass();
                bb1Var.f32043a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f39674c).getEditField().setAlpha(bb1Var.f32043a);
                ((org.telegram.ui.Components.vi) this.d).invalidate();
                return;
        }
    }
}
