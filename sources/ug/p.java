package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56762a;
    public final q f56763b;
    public final r f56764c;

    public p(r rVar, q qVar, int i7) {
        this.f56762a = i7;
        this.f56764c = rVar;
        this.f56763b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56762a) {
            case 0:
                this.f56763b.f56803f = null;
                r.a(this.f56764c);
                return;
            default:
                this.f56763b.f56803f = null;
                r.a(this.f56764c);
                return;
        }
    }
}
