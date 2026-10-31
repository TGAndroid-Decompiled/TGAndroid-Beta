package zf;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class a0 extends s4.j {
    @Override
    public final void D(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ci.i(this, c1Var, animate, view)).start();
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
    public final void p(s4.c1 c1Var) {
        super.p(c1Var);
        View view = c1Var.f47898a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
