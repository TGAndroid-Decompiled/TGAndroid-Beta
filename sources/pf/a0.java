package pf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.o1;
import org.telegram.ui.Components.ls;

public final class a0 extends f2.l {
    @Override
    public final void D(o1 o1Var) {
        View view = o1Var.f5789a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A.add(o1Var);
        viewPropertyAnimatorAnimate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ls((f2.l) this, o1Var, (Object) viewPropertyAnimatorAnimate, (Object) view, 4)).start();
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
    public final void p(o1 o1Var) {
        super.p(o1Var);
        View view = o1Var.f5789a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
