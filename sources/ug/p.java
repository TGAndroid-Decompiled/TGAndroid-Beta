package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58251a;
    public final q f58252b;
    public final r f58253c;

    public p(r rVar, q qVar, int i7) {
        this.f58251a = i7;
        this.f58253c = rVar;
        this.f58252b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58251a) {
            case 0:
                this.f58252b.f58262f = null;
                r.a(this.f58253c);
                return;
            default:
                this.f58252b.f58262f = null;
                r.a(this.f58253c);
                return;
        }
    }
}
