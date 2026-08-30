package tf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.vs;
public final class a0 extends f2.l {
    @Override
    public final void D(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(l1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new vs((f2.l) this, l1Var, (Object) animate, (Object) view, 4)).start();
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
    public final void p(f2.l1 l1Var) {
        super.p(l1Var);
        View view = l1Var.f5785a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
