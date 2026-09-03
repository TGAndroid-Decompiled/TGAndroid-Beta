package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f45126a;
    public final d f45127b;

    public c(d dVar, int i10) {
        this.f45126a = i10;
        this.f45127b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45126a) {
            case 0:
                d dVar = this.f45127b;
                dVar.G = false;
                dVar.f45207e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f45127b;
                dVar2.M = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
