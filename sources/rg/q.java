package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42463a;
    public final r f42464b;
    public final s f42465c;

    public q(s sVar, r rVar, int i10) {
        this.f42463a = i10;
        this.f42465c = sVar;
        this.f42464b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42463a) {
            case 0:
                this.f42464b.f42471f = null;
                s.a(this.f42465c);
                return;
            default:
                this.f42464b.f42471f = null;
                s.a(this.f42465c);
                return;
        }
    }
}
