package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56761a;
    public final q f56762b;
    public final r f56763c;

    public p(r rVar, q qVar, int i7) {
        this.f56761a = i7;
        this.f56763c = rVar;
        this.f56762b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56761a) {
            case 0:
                this.f56762b.f56802f = null;
                r.a(this.f56763c);
                return;
            default:
                this.f56762b.f56802f = null;
                r.a(this.f56763c);
                return;
        }
    }
}
