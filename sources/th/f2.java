package th;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.mj0;
public final class f2 implements mj0 {
    public final z2 f48964a;

    public f2(z2 z2Var) {
        this.f48964a = z2Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean h() {
        ((f7) this.f48964a.f49797z1).b(false);
        return false;
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        rh.l5 l5Var = new rh.l5(this, o0Var, view, 3);
        if (!z10) {
            this.f48964a.l0(l5Var);
        } else {
            l5Var.run();
        }
    }

    @Override
    public final void t() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
