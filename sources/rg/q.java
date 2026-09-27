package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42770a;
    public final r f42771b;
    public final s f42772c;

    public q(s sVar, r rVar, int i10) {
        this.f42770a = i10;
        this.f42772c = sVar;
        this.f42771b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42770a) {
            case 0:
                this.f42771b.f42780f = null;
                s.a(this.f42772c);
                return;
            default:
                this.f42771b.f42780f = null;
                s.a(this.f42772c);
                return;
        }
    }
}
