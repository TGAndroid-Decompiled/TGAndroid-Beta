package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47525a;
    public final r f47526b;
    public final s f47527c;

    public q(s sVar, r rVar, int i10) {
        this.f47525a = i10;
        this.f47527c = sVar;
        this.f47526b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47525a) {
            case 0:
                this.f47526b.f47545f = null;
                s.a(this.f47527c);
                return;
            default:
                this.f47526b.f47545f = null;
                s.a(this.f47527c);
                return;
        }
    }
}
