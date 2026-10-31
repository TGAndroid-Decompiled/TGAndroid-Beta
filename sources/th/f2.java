package th;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.lj0;
public final class f2 implements lj0 {
    public final z2 f48950a;

    public f2(z2 z2Var) {
        this.f48950a = z2Var;
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
        ((f7) this.f48950a.f49783z1).b(false);
        return false;
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        rh.l5 l5Var = new rh.l5(this, o0Var, view, 3);
        if (!z10) {
            this.f48950a.l0(l5Var);
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
