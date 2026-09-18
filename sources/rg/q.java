package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42468a;
    public final r f42469b;
    public final s f42470c;

    public q(s sVar, r rVar, int i10) {
        this.f42468a = i10;
        this.f42470c = sVar;
        this.f42469b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42468a) {
            case 0:
                this.f42469b.f42476f = null;
                s.a(this.f42470c);
                return;
            default:
                this.f42469b.f42476f = null;
                s.a(this.f42470c);
                return;
        }
    }
}
