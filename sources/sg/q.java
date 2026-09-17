package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46226a;
    public final r f46227b;
    public final s f46228c;

    public q(s sVar, r rVar, int i10) {
        this.f46226a = i10;
        this.f46228c = sVar;
        this.f46227b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46226a) {
            case 0:
                this.f46227b.f46235f = null;
                s.a(this.f46228c);
                return;
            default:
                this.f46227b.f46235f = null;
                s.a(this.f46228c);
                return;
        }
    }
}
