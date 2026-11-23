package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58940a;
    public final q f58941b;
    public final r f58942c;

    public p(r rVar, q qVar, int i7) {
        this.f58940a = i7;
        this.f58942c = rVar;
        this.f58941b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58940a) {
            case 0:
                this.f58941b.f58958f = null;
                r.a(this.f58942c);
                return;
            default:
                this.f58941b.f58958f = null;
                r.a(this.f58942c);
                return;
        }
    }
}
