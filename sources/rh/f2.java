package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class f2 extends AnimatorListenerAdapter {
    public final boolean f43515a;
    public final float f43516b;
    public final float f43517c;
    public final q2 d;

    public f2(q2 q2Var, boolean z4, float f10, float f11) {
        this.d = q2Var;
        this.f43515a = z4;
        this.f43516b = f10;
        this.f43517c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        q2 q2Var = this.d;
        i2 i2Var = q2Var.f43708x;
        n2 n2Var = q2Var.T;
        h2 h2Var = q2Var.v;
        q2Var.f43685e0 = false;
        boolean z4 = this.f43515a;
        if (!z4) {
            q2Var.D();
            q2Var.G();
            float f11 = this.f43516b;
            h2Var.setForceOffsetY(f11 - AndroidUtilities.dp(24.0f));
            h2Var.setTopActionBarOffsetY(f11 - AndroidUtilities.dp(24.0f));
            h2Var.setSwipeOffsetY(0.0f);
        } else {
            h2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            h2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            h2Var.setSwipeOffsetY(0.0f);
        }
        if (z4) {
            f10 = q2Var.f43684d0;
        } else {
            f10 = 1.0f - q2Var.f43684d0;
        }
        q2Var.f43683c0 = f10;
        n2Var.setAlpha(1.0f - f10);
        n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * q2Var.f43683c0);
        q2Var.f43691j0.setAlpha(q2Var.f43683c0);
        if (z4) {
            n2Var.setVisibility(8);
        }
        h2Var.setSwipeOffsetAnimationDisallowed(false);
        h2Var.setTranslationX(AndroidUtilities.lerp(this.f43517c, 0.0f, q2Var.f43684d0));
        q2Var.f43690i0.setTranslationX(0.0f);
        q2Var.e.invalidate();
        i2Var.setViewPortHeightOffset(0.0f);
        i2Var.n(true, true);
        q2Var.C();
    }
}
