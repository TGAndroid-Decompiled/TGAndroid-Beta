package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f45809a;
    public final boolean f45810b;
    public final h4 f45811c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f45809a = i10;
        this.f45811c = h4Var;
        this.f45810b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45809a) {
            case 0:
                if (!this.f45810b) {
                    this.f45811c.f45903y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45810b) {
                    this.f45811c.f45901w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
