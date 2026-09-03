package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f51187a;
    public final boolean f51188b;
    public final boolean f51189c;
    public final boolean d;
    public final n f51190e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f51190e = nVar;
        this.f51187a = z4;
        this.f51188b = z10;
        this.f51189c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f51190e;
        nVar.C = false;
        if (!this.f51187a) {
            nVar.e(this.f51188b, this.f51189c, this.d, true);
        }
    }
}
