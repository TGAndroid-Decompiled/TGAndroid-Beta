package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;
public final class g2 extends AnimatorListenerAdapter {
    public final int f43528a;
    public final int f43529b;
    public final p1 f43530c;
    public final q2 d;

    public g2(q2 q2Var, int i10, int i11, p1 p1Var) {
        this.d = q2Var;
        this.f43528a = i10;
        this.f43529b = i11;
        this.f43530c = p1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f43528a, this.f43529b);
        q2 q2Var = this.d;
        q2Var.N = d;
        q2Var.h();
        p2 p2Var = q2Var.e;
        p2Var.invalidate();
        n2 n2Var = q2Var.T;
        n2Var.setBackgroundColor(q2Var.N);
        p1 p1Var = this.f43530c;
        p1Var.b(n2Var, 1.0f);
        q2Var.f43678a = p1Var.a(j6.Ii);
        p2Var.invalidate();
    }
}
