package qh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class q9 extends j5 {
    public final ca f45919z0;

    public q9(ca caVar, Activity activity, org.telegram.ui.Components.ba baVar, i5 i5Var) {
        super(activity, baVar, i5Var);
        this.f45919z0 = caVar;
    }

    @Override
    public final void b() {
        s6 s6Var = this.d;
        if (s6Var != null && !s6Var.f46083u) {
            if (this.f45479n != null) {
                Matrix matrix = s6Var.f46070n0;
                Matrix matrix2 = this.T;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f46065k0;
                if (i10 < 0) {
                    i10 = this.f45471f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f46067l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.f46061i0, getHeight() / this.d.f46063j0);
                Matrix matrix3 = this.f45473g0;
                matrix3.reset();
                this.f45472f0.invert(matrix3);
                this.f45479n.setTransform(matrix2);
                this.f45479n.invalidate();
            }
            invalidate();
        }
        this.f45919z0.j();
    }

    @Override
    public final void i() {
        f9 f9Var;
        ca caVar = this.f45919z0;
        s6 s6Var = caVar.H1;
        if (s6Var != null && s6Var.f46083u && s6Var.K && (f9Var = caVar.f45134s1) != null && f9Var.O0 != null) {
            for (int i10 = 0; i10 < caVar.f45134s1.O0.getChildCount(); i10++) {
                View childAt = caVar.f45134s1.O0.getChildAt(i10);
                if (childAt instanceof eg.y1) {
                    ((eg.y1) childAt).s();
                }
            }
        }
    }
}
