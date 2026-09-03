package ph;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class s9 extends k5 {
    public final da f42378z0;

    public s9(da daVar, Activity activity, org.telegram.ui.Components.ba baVar, j5 j5Var) {
        super(activity, baVar, j5Var);
        this.f42378z0 = daVar;
    }

    @Override
    public final void b() {
        t6 t6Var = this.d;
        if (t6Var != null && !t6Var.f42440u) {
            if (this.f41904n != null) {
                Matrix matrix = t6Var.f42427n0;
                Matrix matrix2 = this.T;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f42422k0;
                if (i10 < 0) {
                    i10 = this.f41896f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f42424l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.f42418i0, getHeight() / this.d.f42420j0);
                Matrix matrix3 = this.f41898g0;
                matrix3.reset();
                this.f41897f0.invert(matrix3);
                this.f41904n.setTransform(matrix2);
                this.f41904n.invalidate();
            }
            invalidate();
        }
        this.f42378z0.j();
    }

    @Override
    public final void i() {
        h9 h9Var;
        da daVar = this.f42378z0;
        t6 t6Var = daVar.H1;
        if (t6Var != null && t6Var.f42440u && t6Var.K && (h9Var = daVar.f41569s1) != null && h9Var.O0 != null) {
            for (int i10 = 0; i10 < daVar.f41569s1.O0.getChildCount(); i10++) {
                View childAt = daVar.f41569s1.O0.getChildAt(i10);
                if (childAt instanceof dg.a2) {
                    ((dg.a2) childAt).s();
                }
            }
        }
    }
}
