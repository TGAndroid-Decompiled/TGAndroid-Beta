package uf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.xs;
public final class a0 extends f2.l {
    @Override
    public final void D(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(m1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new xs((f2.l) this, m1Var, (Object) animate, (Object) view, 4)).start();
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final long L() {
        return 0L;
    }

    @Override
    public final long h() {
        return 220L;
    }

    @Override
    public final long j() {
        return 220L;
    }

    @Override
    public final void p(f2.m1 m1Var) {
        super.p(m1Var);
        View view = m1Var.f5875a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
