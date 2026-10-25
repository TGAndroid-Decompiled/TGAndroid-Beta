package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f48992a;
    public final r f48993b;
    public final s f48994c;

    public q(s sVar, r rVar, int i10) {
        this.f48992a = i10;
        this.f48994c = sVar;
        this.f48993b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48992a) {
            case 0:
                this.f48993b.f49017f = null;
                s.a(this.f48994c);
                return;
            default:
                this.f48993b.f49017f = null;
                s.a(this.f48994c);
                return;
        }
    }
}
