package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46089a;
    public final boolean f46090b;
    public final i4 f46091c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46089a = i10;
        this.f46091c = i4Var;
        this.f46090b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46089a) {
            case 0:
                if (!this.f46090b) {
                    this.f46091c.f46176y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46090b) {
                    this.f46091c.f46174w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
