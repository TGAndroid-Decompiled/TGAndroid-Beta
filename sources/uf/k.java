package uf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k extends AnimatorListenerAdapter {

    public final boolean f48612a;

    public final boolean f48613b;

    public final boolean f48614c;
    public final boolean d;

    public final n f48615e;

    public k(n nVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f48615e = nVar;
        this.f48612a = z10;
        this.f48613b = z11;
        this.f48614c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f48615e;
        nVar.B = false;
        if (this.f48612a) {
            return;
        }
        nVar.e(this.f48613b, this.f48614c, this.d, true);
    }
}
