package rf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.n1;
import org.telegram.ui.Components.rs;
public final class b0 extends f2.l {
    @Override
    public final void D(n1 n1Var) {
        View view = n1Var.f6432a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(n1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new rs((f2.l) this, n1Var, (Object) animate, (Object) view, 4)).start();
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
    public final void p(n1 n1Var) {
        super.p(n1Var);
        View view = n1Var.f6432a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
