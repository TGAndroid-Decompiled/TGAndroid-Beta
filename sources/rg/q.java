package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42760a;
    public final r f42761b;
    public final s f42762c;

    public q(s sVar, r rVar, int i10) {
        this.f42760a = i10;
        this.f42762c = sVar;
        this.f42761b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42760a) {
            case 0:
                this.f42761b.f42770f = null;
                s.a(this.f42762c);
                return;
            default:
                this.f42761b.f42770f = null;
                s.a(this.f42762c);
                return;
        }
    }
}
