package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f45837a;
    public final boolean f45838b;
    public final h4 f45839c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f45837a = i10;
        this.f45839c = h4Var;
        this.f45838b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45837a) {
            case 0:
                if (!this.f45838b) {
                    this.f45839c.f45931y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45838b) {
                    this.f45839c.f45929w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
