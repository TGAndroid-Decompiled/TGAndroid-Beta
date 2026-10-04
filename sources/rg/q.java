package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46243a;
    public final r f46244b;
    public final s f46245c;

    public q(s sVar, r rVar, int i10) {
        this.f46243a = i10;
        this.f46245c = sVar;
        this.f46244b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46243a) {
            case 0:
                this.f46244b.f46277f = null;
                s.a(this.f46245c);
                return;
            default:
                this.f46244b.f46277f = null;
                s.a(this.f46245c);
                return;
        }
    }
}
