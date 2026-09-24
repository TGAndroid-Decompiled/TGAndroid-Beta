package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42711a;
    public final r f42712b;
    public final s f42713c;

    public q(s sVar, r rVar, int i10) {
        this.f42711a = i10;
        this.f42713c = sVar;
        this.f42712b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42711a) {
            case 0:
                this.f42712b.f42721f = null;
                s.a(this.f42713c);
                return;
            default:
                this.f42712b.f42721f = null;
                s.a(this.f42713c);
                return;
        }
    }
}
