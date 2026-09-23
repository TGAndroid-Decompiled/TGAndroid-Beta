package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42392a;
    public final r f42393b;
    public final s f42394c;

    public q(s sVar, r rVar, int i10) {
        this.f42392a = i10;
        this.f42394c = sVar;
        this.f42393b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42392a) {
            case 0:
                this.f42393b.f42400f = null;
                s.a(this.f42394c);
                return;
            default:
                this.f42393b.f42400f = null;
                s.a(this.f42394c);
                return;
        }
    }
}
