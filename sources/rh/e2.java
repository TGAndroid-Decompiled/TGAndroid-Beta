package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e2 extends AnimatorListenerAdapter {
    public final boolean f43567a;
    public final float f43568b;
    public final float f43569c;
    public final p2 d;

    public e2(p2 p2Var, boolean z4, float f10, float f11) {
        this.d = p2Var;
        this.f43567a = z4;
        this.f43568b = f10;
        this.f43569c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        p2 p2Var = this.d;
        h2 h2Var = p2Var.f43760x;
        m2 m2Var = p2Var.T;
        g2 g2Var = p2Var.v;
        p2Var.f43737e0 = false;
        boolean z4 = this.f43567a;
        if (!z4) {
            p2Var.D();
            p2Var.G();
            float f11 = this.f43568b;
            g2Var.setForceOffsetY(f11 - AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(f11 - AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        } else {
            g2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        }
        if (z4) {
            f10 = p2Var.f43736d0;
        } else {
            f10 = 1.0f - p2Var.f43736d0;
        }
        p2Var.f43735c0 = f10;
        m2Var.setAlpha(1.0f - f10);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * p2Var.f43735c0);
        p2Var.f43743j0.setAlpha(p2Var.f43735c0);
        if (z4) {
            m2Var.setVisibility(8);
        }
        g2Var.setSwipeOffsetAnimationDisallowed(false);
        g2Var.setTranslationX(AndroidUtilities.lerp(this.f43569c, 0.0f, p2Var.f43736d0));
        p2Var.f43742i0.setTranslationX(0.0f);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.o(true, true);
        p2Var.C();
    }
}
