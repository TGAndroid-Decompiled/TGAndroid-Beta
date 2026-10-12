package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47606a;
    public final r f47607b;
    public final s f47608c;

    public q(s sVar, r rVar, int i10) {
        this.f47606a = i10;
        this.f47608c = sVar;
        this.f47607b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47606a) {
            case 0:
                this.f47607b.f47635f = null;
                s.a(this.f47608c);
                return;
            default:
                this.f47607b.f47635f = null;
                s.a(this.f47608c);
                return;
        }
    }
}
