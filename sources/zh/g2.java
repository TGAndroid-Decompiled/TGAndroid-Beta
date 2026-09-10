package zh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;
public final class g2 implements ok0 {
    public final a3 f48429a;

    public g2(a3 a3Var) {
        this.f48429a = a3Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ((l7) this.f48429a.Q1).b(false);
        return false;
    }

    @Override
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        xh.n1 n1Var = new xh.n1(this, p0Var, view, 10);
        if (!z10) {
            this.f48429a.n0(n1Var);
        } else {
            n1Var.run();
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
