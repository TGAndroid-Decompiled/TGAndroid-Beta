package ph;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class s9 extends l5 {
    public final da f42313z0;

    public s9(da daVar, Activity activity, org.telegram.ui.Components.ba baVar, k5 k5Var) {
        super(activity, baVar, k5Var);
        this.f42313z0 = daVar;
    }

    @Override
    public final void b() {
        u6 u6Var = this.d;
        if (u6Var != null && !u6Var.f42439u) {
            if (this.f41894n != null) {
                Matrix matrix = u6Var.f42426n0;
                Matrix matrix2 = this.T;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f42421k0;
                if (i10 < 0) {
                    i10 = this.f41886f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f42423l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.f42417i0, getHeight() / this.d.f42419j0);
                Matrix matrix3 = this.f41888g0;
                matrix3.reset();
                this.f41887f0.invert(matrix3);
                this.f41894n.setTransform(matrix2);
                this.f41894n.invalidate();
            }
            invalidate();
        }
        this.f42313z0.j();
    }

    @Override
    public final void i() {
        h9 h9Var;
        da daVar = this.f42313z0;
        u6 u6Var = daVar.H1;
        if (u6Var != null && u6Var.f42439u && u6Var.K && (h9Var = daVar.f41531s1) != null && h9Var.O0 != null) {
            for (int i10 = 0; i10 < daVar.f41531s1.O0.getChildCount(); i10++) {
                View childAt = daVar.f41531s1.O0.getChildAt(i10);
                if (childAt instanceof dg.a2) {
                    ((dg.a2) childAt).s();
                }
            }
        }
    }
}
