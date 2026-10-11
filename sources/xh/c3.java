package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f51283a;
    public final boolean f51284b;
    public final i4 f51285c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f51283a = i10;
        this.f51285c = i4Var;
        this.f51284b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51283a) {
            case 0:
                if (!this.f51284b) {
                    this.f51285c.f51379y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51284b) {
                    this.f51285c.f51377w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
