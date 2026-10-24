package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46816a;
    public final r f46817b;
    public final s f46818c;

    public q(s sVar, r rVar, int i10) {
        this.f46816a = i10;
        this.f46818c = sVar;
        this.f46817b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46816a) {
            case 0:
                this.f46817b.f46839f = null;
                s.a(this.f46818c);
                return;
            default:
                this.f46817b.f46839f = null;
                s.a(this.f46818c);
                return;
        }
    }
}
