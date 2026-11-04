package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f56773a;
    public final q f56774b;
    public final r f56775c;

    public p(r rVar, q qVar, int i3) {
        this.f56773a = i3;
        this.f56775c = rVar;
        this.f56774b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56773a) {
            case 0:
                this.f56774b.f56788f = null;
                r.a(this.f56775c);
                return;
            default:
                this.f56774b.f56788f = null;
                r.a(this.f56775c);
                return;
        }
    }
}
