package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f41343a;
    public final d f41344b;

    public c(d dVar, int i10) {
        this.f41343a = i10;
        this.f41344b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41343a) {
            case 0:
                d dVar = this.f41344b;
                dVar.G = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f41344b;
                dVar2.M = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
