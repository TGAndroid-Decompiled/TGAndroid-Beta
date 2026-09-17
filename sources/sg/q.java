package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46254a;
    public final r f46255b;
    public final s f46256c;

    public q(s sVar, r rVar, int i10) {
        this.f46254a = i10;
        this.f46256c = sVar;
        this.f46255b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46254a) {
            case 0:
                this.f46255b.f46263f = null;
                s.a(this.f46256c);
                return;
            default:
                this.f46255b.f46263f = null;
                s.a(this.f46256c);
                return;
        }
    }
}
