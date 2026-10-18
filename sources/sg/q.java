package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46373a;
    public final r f46374b;
    public final s f46375c;

    public q(s sVar, r rVar, int i10) {
        this.f46373a = i10;
        this.f46375c = sVar;
        this.f46374b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46373a) {
            case 0:
                this.f46374b.f46401f = null;
                s.a(this.f46375c);
                return;
            default:
                this.f46374b.f46401f = null;
                s.a(this.f46375c);
                return;
        }
    }
}
