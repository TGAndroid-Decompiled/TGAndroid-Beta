package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f41272a;
    public final p0 f41273b;

    public c0(p0 p0Var, int i10) {
        this.f41272a = i10;
        this.f41273b = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41272a) {
            case 0:
                this.f41273b.f41477f2.setTranslationY(0.0f);
                return;
            default:
                p0 p0Var = this.f41273b;
                p0Var.f41483i2 = false;
                p0Var.f41477f2.setTranslationY(0.0f);
                p0Var.n0();
                return;
        }
    }
}
