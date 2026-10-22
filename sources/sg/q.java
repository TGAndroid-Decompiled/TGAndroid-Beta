package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46383a;
    public final r f46384b;
    public final s f46385c;

    public q(s sVar, r rVar, int i10) {
        this.f46383a = i10;
        this.f46385c = sVar;
        this.f46384b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46383a) {
            case 0:
                this.f46384b.f46411f = null;
                s.a(this.f46385c);
                return;
            default:
                this.f46384b.f46411f = null;
                s.a(this.f46385c);
                return;
        }
    }
}
