package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46076a;
    public final boolean f46077b;
    public final i4 f46078c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46076a = i10;
        this.f46078c = i4Var;
        this.f46077b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46076a) {
            case 0:
                if (!this.f46077b) {
                    this.f46078c.f46163y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46077b) {
                    this.f46078c.f46161w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
