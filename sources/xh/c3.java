package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f49915a;
    public final boolean f49916b;
    public final i4 f49917c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f49915a = i10;
        this.f49917c = i4Var;
        this.f49916b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49915a) {
            case 0:
                if (!this.f49916b) {
                    this.f49917c.f50027y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f49916b) {
                    this.f49917c.f50025w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
