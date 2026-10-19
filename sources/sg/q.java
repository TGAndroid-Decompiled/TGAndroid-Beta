package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46375a;
    public final r f46376b;
    public final s f46377c;

    public q(s sVar, r rVar, int i10) {
        this.f46375a = i10;
        this.f46377c = sVar;
        this.f46376b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46375a) {
            case 0:
                this.f46376b.f46403f = null;
                s.a(this.f46377c);
                return;
            default:
                this.f46376b.f46403f = null;
                s.a(this.f46377c);
                return;
        }
    }
}
