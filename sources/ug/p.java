package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58815a;
    public final q f58816b;
    public final r f58817c;

    public p(r rVar, q qVar, int i7) {
        this.f58815a = i7;
        this.f58817c = rVar;
        this.f58816b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58815a) {
            case 0:
                this.f58816b.f58827f = null;
                r.a(this.f58817c);
                return;
            default:
                this.f58816b.f58827f = null;
                r.a(this.f58817c);
                return;
        }
    }
}
