package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42739a;
    public final r f42740b;
    public final s f42741c;

    public q(s sVar, r rVar, int i10) {
        this.f42739a = i10;
        this.f42741c = sVar;
        this.f42740b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42739a) {
            case 0:
                this.f42740b.f42749f = null;
                s.a(this.f42741c);
                return;
            default:
                this.f42740b.f42749f = null;
                s.a(this.f42741c);
                return;
        }
    }
}
