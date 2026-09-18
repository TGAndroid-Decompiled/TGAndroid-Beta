package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42695a;
    public final r f42696b;
    public final s f42697c;

    public q(s sVar, r rVar, int i10) {
        this.f42695a = i10;
        this.f42697c = sVar;
        this.f42696b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42695a) {
            case 0:
                this.f42696b.f42703f = null;
                s.a(this.f42697c);
                return;
            default:
                this.f42696b.f42703f = null;
                s.a(this.f42697c);
                return;
        }
    }
}
