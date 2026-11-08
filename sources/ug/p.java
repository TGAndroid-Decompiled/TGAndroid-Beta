package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56750a;
    public final q f56751b;
    public final r f56752c;

    public p(r rVar, q qVar, int i7) {
        this.f56750a = i7;
        this.f56752c = rVar;
        this.f56751b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56750a) {
            case 0:
                this.f56751b.f56791f = null;
                r.a(this.f56752c);
                return;
            default:
                this.f56751b.f56791f = null;
                r.a(this.f56752c);
                return;
        }
    }
}
