package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47491a;
    public final r f47492b;
    public final s f47493c;

    public q(s sVar, r rVar, int i10) {
        this.f47491a = i10;
        this.f47493c = sVar;
        this.f47492b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47491a) {
            case 0:
                this.f47492b.f47511f = null;
                s.a(this.f47493c);
                return;
            default:
                this.f47492b.f47511f = null;
                s.a(this.f47493c);
                return;
        }
    }
}
