package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46419a;
    public final r f46420b;
    public final s f46421c;

    public q(s sVar, r rVar, int i10) {
        this.f46419a = i10;
        this.f46421c = sVar;
        this.f46420b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46419a) {
            case 0:
                this.f46420b.f46437f = null;
                s.a(this.f46421c);
                return;
            default:
                this.f46420b.f46437f = null;
                s.a(this.f46421c);
                return;
        }
    }
}
