package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50233a;
    public final boolean f50234b;
    public final g4 f50235c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f50233a = i10;
        this.f50235c = g4Var;
        this.f50234b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50233a) {
            case 0:
                if (!this.f50234b) {
                    this.f50235c.f50332y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50234b) {
                    this.f50235c.f50330w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
