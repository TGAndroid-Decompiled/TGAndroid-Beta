package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.t6;
public final class c2 extends AnimatorListenerAdapter {
    public final int f53735a;
    public final int f53736b;
    public final m1 f53737c;
    public final m2 d;

    public c2(m2 m2Var, int i10, int i11, m1 m1Var) {
        this.d = m2Var;
        this.f53735a = i10;
        this.f53736b = i11;
        this.f53737c = m1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.f53735a, this.f53736b);
        m2 m2Var = this.d;
        m2Var.R = f7;
        m2Var.l();
        l2 l2Var = m2Var.f53899f;
        l2Var.invalidate();
        j2 j2Var = m2Var.X;
        j2Var.setBackgroundColor(m2Var.R);
        m1 m1Var = this.f53737c;
        m1Var.b(j2Var, 1.0f);
        m2Var.f53891a = m1Var.a(t6.wj);
        l2Var.invalidate();
    }
}
