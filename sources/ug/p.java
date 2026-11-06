package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56658a;
    public final q f56659b;
    public final r f56660c;

    public p(r rVar, q qVar, int i7) {
        this.f56658a = i7;
        this.f56660c = rVar;
        this.f56659b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56658a) {
            case 0:
                this.f56659b.f56699f = null;
                r.a(this.f56660c);
                return;
            default:
                this.f56659b.f56699f = null;
                r.a(this.f56660c);
                return;
        }
    }
}
