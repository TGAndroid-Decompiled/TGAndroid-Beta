package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46144a;
    public final boolean f46145b;
    public final i4 f46146c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46144a = i10;
        this.f46146c = i4Var;
        this.f46145b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46144a) {
            case 0:
                if (!this.f46145b) {
                    this.f46146c.f46231y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46145b) {
                    this.f46146c.f46229w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
