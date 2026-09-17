package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f45832a;
    public final boolean f45833b;
    public final h4 f45834c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f45832a = i10;
        this.f45834c = h4Var;
        this.f45833b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45832a) {
            case 0:
                if (!this.f45833b) {
                    this.f45834c.f45926y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45833b) {
                    this.f45834c.f45924w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
