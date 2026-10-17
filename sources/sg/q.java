package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46399a;
    public final r f46400b;
    public final s f46401c;

    public q(s sVar, r rVar, int i10) {
        this.f46399a = i10;
        this.f46401c = sVar;
        this.f46400b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46399a) {
            case 0:
                this.f46400b.f46417f = null;
                s.a(this.f46401c);
                return;
            default:
                this.f46400b.f46417f = null;
                s.a(this.f46401c);
                return;
        }
    }
}
