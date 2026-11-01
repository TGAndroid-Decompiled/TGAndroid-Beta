package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f51028a;
    public final d f51029b;

    public c(d dVar, int i10) {
        this.f51028a = i10;
        this.f51029b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51028a) {
            case 0:
                d dVar = this.f51029b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f51029b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
