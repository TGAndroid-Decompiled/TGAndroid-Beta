package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42725a;
    public final r f42726b;
    public final s f42727c;

    public q(s sVar, r rVar, int i10) {
        this.f42725a = i10;
        this.f42727c = sVar;
        this.f42726b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42725a) {
            case 0:
                this.f42726b.f42735f = null;
                s.a(this.f42727c);
                return;
            default:
                this.f42726b.f42735f = null;
                s.a(this.f42727c);
                return;
        }
    }
}
