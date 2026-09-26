package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42724a;
    public final r f42725b;
    public final s f42726c;

    public q(s sVar, r rVar, int i10) {
        this.f42724a = i10;
        this.f42726c = sVar;
        this.f42725b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42724a) {
            case 0:
                this.f42725b.f42734f = null;
                s.a(this.f42726c);
                return;
            default:
                this.f42725b.f42734f = null;
                s.a(this.f42726c);
                return;
        }
    }
}
