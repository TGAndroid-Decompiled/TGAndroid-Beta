package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f49907a;
    public final boolean f49908b;
    public final i4 f49909c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f49907a = i10;
        this.f49909c = i4Var;
        this.f49908b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49907a) {
            case 0:
                if (!this.f49908b) {
                    this.f49909c.f50019y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f49908b) {
                    this.f49909c.f50017w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
