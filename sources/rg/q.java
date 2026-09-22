package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42437a;
    public final r f42438b;
    public final s f42439c;

    public q(s sVar, r rVar, int i10) {
        this.f42437a = i10;
        this.f42439c = sVar;
        this.f42438b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42437a) {
            case 0:
                this.f42438b.f42445f = null;
                s.a(this.f42439c);
                return;
            default:
                this.f42438b.f42445f = null;
                s.a(this.f42439c);
                return;
        }
    }
}
