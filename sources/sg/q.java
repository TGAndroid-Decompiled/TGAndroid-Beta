package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46225a;
    public final r f46226b;
    public final s f46227c;

    public q(s sVar, r rVar, int i10) {
        this.f46225a = i10;
        this.f46227c = sVar;
        this.f46226b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46225a) {
            case 0:
                this.f46226b.f46234f = null;
                s.a(this.f46227c);
                return;
            default:
                this.f46226b.f46234f = null;
                s.a(this.f46227c);
                return;
        }
    }
}
