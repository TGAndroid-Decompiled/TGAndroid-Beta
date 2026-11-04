package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final boolean f53497a;
    public final boolean f53498b;
    public final boolean f53499c;
    public final boolean d;
    public final m f53500e;

    public j(m mVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f53500e = mVar;
        this.f53497a = z10;
        this.f53498b = z11;
        this.f53499c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m mVar = this.f53500e;
        mVar.G = false;
        if (!this.f53497a) {
            mVar.e(this.f53498b, this.f53499c, this.d, true);
        }
    }
}
