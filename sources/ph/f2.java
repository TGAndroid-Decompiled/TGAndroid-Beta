package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.g6;
public final class f2 extends AnimatorListenerAdapter {
    public final int f45793a;
    public final int f45794b;
    public final o1 f45795c;
    public final p2 d;

    public f2(p2 p2Var, int i10, int i11, o1 o1Var) {
        this.d = p2Var;
        this.f45793a = i10;
        this.f45794b = i11;
        this.f45795c = o1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f45793a, this.f45794b);
        p2 p2Var = this.d;
        p2Var.M = d;
        p2Var.h();
        o2 o2Var = p2Var.f45963e;
        o2Var.invalidate();
        m2 m2Var = p2Var.S;
        m2Var.setBackgroundColor(p2Var.M);
        o1 o1Var = this.f45795c;
        o1Var.b(m2Var, 1.0f);
        p2Var.f45956a = o1Var.a(g6.Ii);
        o2Var.invalidate();
    }
}
