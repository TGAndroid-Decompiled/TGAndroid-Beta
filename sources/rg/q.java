package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47401a;
    public final r f47402b;
    public final s f47403c;

    public q(s sVar, r rVar, int i10) {
        this.f47401a = i10;
        this.f47403c = sVar;
        this.f47402b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47401a) {
            case 0:
                this.f47402b.f47421f = null;
                s.a(this.f47403c);
                return;
            default:
                this.f47402b.f47421f = null;
                s.a(this.f47403c);
                return;
        }
    }
}
