package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f51021a;
    public final d f51022b;

    public c(d dVar, int i10) {
        this.f51021a = i10;
        this.f51022b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51021a) {
            case 0:
                d dVar = this.f51022b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f51022b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
