package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f51151a;
    public final boolean f51152b;
    public final boolean f51153c;
    public final boolean d;
    public final n f51154e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f51154e = nVar;
        this.f51151a = z4;
        this.f51152b = z10;
        this.f51153c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f51154e;
        nVar.C = false;
        if (!this.f51151a) {
            nVar.e(this.f51152b, this.f51153c, this.d, true);
        }
    }
}
