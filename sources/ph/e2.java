package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e2 extends AnimatorListenerAdapter {
    public final boolean f45778a;
    public final float f45779b;
    public final float f45780c;
    public final p2 d;

    public e2(p2 p2Var, boolean z10, float f9, float f10) {
        this.d = p2Var;
        this.f45778a = z10;
        this.f45779b = f9;
        this.f45780c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        p2 p2Var = this.d;
        h2 h2Var = p2Var.f45987x;
        m2 m2Var = p2Var.S;
        g2 g2Var = p2Var.v;
        p2Var.f45962d0 = false;
        boolean z10 = this.f45778a;
        if (!z10) {
            p2Var.D();
            p2Var.G();
            float f10 = this.f45779b;
            g2Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        } else {
            g2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f9 = p2Var.f45961c0;
        } else {
            f9 = 1.0f - p2Var.f45961c0;
        }
        p2Var.f45959b0 = f9;
        m2Var.setAlpha(1.0f - f9);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * p2Var.f45959b0);
        p2Var.f45969i0.setAlpha(p2Var.f45959b0);
        if (z10) {
            m2Var.setVisibility(8);
        }
        g2Var.setSwipeOffsetAnimationDisallowed(false);
        g2Var.setTranslationX(AndroidUtilities.lerp(this.f45780c, 0.0f, p2Var.f45961c0));
        p2Var.f45968h0.setTranslationX(0.0f);
        p2Var.f45963e.invalidate();
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.n(true, true);
        p2Var.C();
    }
}
