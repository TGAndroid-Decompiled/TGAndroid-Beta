package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47614a;
    public final r f47615b;
    public final s f47616c;

    public q(s sVar, r rVar, int i10) {
        this.f47614a = i10;
        this.f47616c = sVar;
        this.f47615b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47614a) {
            case 0:
                this.f47615b.f47643f = null;
                s.a(this.f47616c);
                return;
            default:
                this.f47615b.f47643f = null;
                s.a(this.f47616c);
                return;
        }
    }
}
