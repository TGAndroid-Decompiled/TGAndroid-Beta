package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56749a;
    public final q f56750b;
    public final r f56751c;

    public p(r rVar, q qVar, int i7) {
        this.f56749a = i7;
        this.f56751c = rVar;
        this.f56750b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56749a) {
            case 0:
                this.f56750b.f56790f = null;
                r.a(this.f56751c);
                return;
            default:
                this.f56750b.f56790f = null;
                r.a(this.f56751c);
                return;
        }
    }
}
