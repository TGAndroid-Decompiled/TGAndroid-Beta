package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f51317a;
    public final boolean f51318b;
    public final i4 f51319c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f51317a = i10;
        this.f51319c = i4Var;
        this.f51318b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51317a) {
            case 0:
                if (!this.f51318b) {
                    this.f51319c.f51413y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51318b) {
                    this.f51319c.f51411w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
