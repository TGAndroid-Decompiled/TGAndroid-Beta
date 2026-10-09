package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f51194a;
    public final boolean f51195b;
    public final i4 f51196c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f51194a = i10;
        this.f51196c = i4Var;
        this.f51195b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51194a) {
            case 0:
                if (!this.f51195b) {
                    this.f51196c.f51290y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51195b) {
                    this.f51196c.f51288w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
