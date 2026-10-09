package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47399a;
    public final r f47400b;
    public final s f47401c;

    public q(s sVar, r rVar, int i10) {
        this.f47399a = i10;
        this.f47401c = sVar;
        this.f47400b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47399a) {
            case 0:
                this.f47400b.f47419f = null;
                s.a(this.f47401c);
                return;
            default:
                this.f47400b.f47419f = null;
                s.a(this.f47401c);
                return;
        }
    }
}
