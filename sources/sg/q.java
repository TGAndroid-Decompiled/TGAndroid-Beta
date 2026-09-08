package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46253a;
    public final r f46254b;
    public final s f46255c;

    public q(s sVar, r rVar, int i10) {
        this.f46253a = i10;
        this.f46255c = sVar;
        this.f46254b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46253a) {
            case 0:
                this.f46254b.f46262f = null;
                s.a(this.f46255c);
                return;
            default:
                this.f46254b.f46262f = null;
                s.a(this.f46255c);
                return;
        }
    }
}
