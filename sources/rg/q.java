package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f47445a;
    public final r f47446b;
    public final s f47447c;

    public q(s sVar, r rVar, int i10) {
        this.f47445a = i10;
        this.f47447c = sVar;
        this.f47446b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47445a) {
            case 0:
                this.f47446b.f47465f = null;
                s.a(this.f47447c);
                return;
            default:
                this.f47446b.f47465f = null;
                s.a(this.f47447c);
                return;
        }
    }
}
