package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56633a;
    public final q f56634b;
    public final r f56635c;

    public p(r rVar, q qVar, int i7) {
        this.f56633a = i7;
        this.f56635c = rVar;
        this.f56634b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56633a) {
            case 0:
                this.f56634b.f56674f = null;
                r.a(this.f56635c);
                return;
            default:
                this.f56634b.f56674f = null;
                r.a(this.f56635c);
                return;
        }
    }
}
