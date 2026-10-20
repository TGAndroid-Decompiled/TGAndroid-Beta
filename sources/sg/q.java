package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46380a;
    public final r f46381b;
    public final s f46382c;

    public q(s sVar, r rVar, int i10) {
        this.f46380a = i10;
        this.f46382c = sVar;
        this.f46381b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46380a) {
            case 0:
                this.f46381b.f46408f = null;
                s.a(this.f46382c);
                return;
            default:
                this.f46381b.f46408f = null;
                s.a(this.f46382c);
                return;
        }
    }
}
