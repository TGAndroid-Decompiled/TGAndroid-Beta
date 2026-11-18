package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58814a;
    public final q f58815b;
    public final r f58816c;

    public p(r rVar, q qVar, int i7) {
        this.f58814a = i7;
        this.f58816c = rVar;
        this.f58815b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58814a) {
            case 0:
                this.f58815b.f58826f = null;
                r.a(this.f58816c);
                return;
            default:
                this.f58815b.f58826f = null;
                r.a(this.f58816c);
                return;
        }
    }
}
