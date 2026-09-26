package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46102a;
    public final boolean f46103b;
    public final i4 f46104c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46102a = i10;
        this.f46104c = i4Var;
        this.f46103b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46102a) {
            case 0:
                if (!this.f46103b) {
                    this.f46104c.f46189y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46103b) {
                    this.f46104c.f46187w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
