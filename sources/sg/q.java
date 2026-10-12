package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f45306a;
    public final r f45307b;
    public final s f45308c;

    public q(s sVar, r rVar, int i10) {
        this.f45306a = i10;
        this.f45308c = sVar;
        this.f45307b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45306a) {
            case 0:
                this.f45307b.f45334f = null;
                s.a(this.f45308c);
                return;
            default:
                this.f45307b.f45334f = null;
                s.a(this.f45308c);
                return;
        }
    }
}
