package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58825a;
    public final q f58826b;
    public final r f58827c;

    public p(r rVar, q qVar, int i7) {
        this.f58825a = i7;
        this.f58827c = rVar;
        this.f58826b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58825a) {
            case 0:
                this.f58826b.f58843f = null;
                r.a(this.f58827c);
                return;
            default:
                this.f58826b.f58843f = null;
                r.a(this.f58827c);
                return;
        }
    }
}
