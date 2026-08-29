package wf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f49939a;
    public final boolean f49940b;
    public final boolean f49941c;
    public final boolean d;
    public final n f49942e;

    public k(n nVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f49942e = nVar;
        this.f49939a = z10;
        this.f49940b = z11;
        this.f49941c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f49942e;
        nVar.B = false;
        if (!this.f49939a) {
            nVar.e(this.f49940b, this.f49941c, this.d, true);
        }
    }
}
