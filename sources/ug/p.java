package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56657a;
    public final q f56658b;
    public final r f56659c;

    public p(r rVar, q qVar, int i7) {
        this.f56657a = i7;
        this.f56659c = rVar;
        this.f56658b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56657a) {
            case 0:
                this.f56658b.f56698f = null;
                r.a(this.f56659c);
                return;
            default:
                this.f56658b.f56698f = null;
                r.a(this.f56659c);
                return;
        }
    }
}
