package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;
public final class f2 extends AnimatorListenerAdapter {
    public final int f47453a;
    public final int f47454b;
    public final o1 f47455c;
    public final p2 d;

    public f2(p2 p2Var, int i10, int i11, o1 o1Var) {
        this.d = p2Var;
        this.f47453a = i10;
        this.f47454b = i11;
        this.f47455c = o1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47453a, this.f47454b);
        p2 p2Var = this.d;
        p2Var.N = d;
        p2Var.h();
        o2 o2Var = p2Var.f47624e;
        o2Var.invalidate();
        m2 m2Var = p2Var.T;
        m2Var.setBackgroundColor(p2Var.N);
        o1 o1Var = this.f47455c;
        o1Var.b(m2Var, 1.0f);
        p2Var.f47617a = o1Var.a(k6.Ii);
        o2Var.invalidate();
    }
}
