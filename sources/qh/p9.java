package qh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class p9 extends i5 {
    public final ba f45901z0;

    public p9(ba baVar, Activity activity, org.telegram.ui.Components.ba baVar2, h5 h5Var) {
        super(activity, baVar2, h5Var);
        this.f45901z0 = baVar;
    }

    @Override
    public final void b() {
        r6 r6Var = this.d;
        if (r6Var != null && !r6Var.f46034u) {
            if (this.f45449n != null) {
                Matrix matrix = r6Var.f46021n0;
                Matrix matrix2 = this.T;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f46016k0;
                if (i10 < 0) {
                    i10 = this.f45441f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f46018l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.f46012i0, getHeight() / this.d.f46014j0);
                Matrix matrix3 = this.f45443g0;
                matrix3.reset();
                this.f45442f0.invert(matrix3);
                this.f45449n.setTransform(matrix2);
                this.f45449n.invalidate();
            }
            invalidate();
        }
        this.f45901z0.j();
    }

    @Override
    public final void i() {
        e9 e9Var;
        ba baVar = this.f45901z0;
        r6 r6Var = baVar.H1;
        if (r6Var != null && r6Var.f46034u && r6Var.K && (e9Var = baVar.f45100s1) != null && e9Var.O0 != null) {
            for (int i10 = 0; i10 < baVar.f45100s1.O0.getChildCount(); i10++) {
                View childAt = baVar.f45100s1.O0.getChildAt(i10);
                if (childAt instanceof eg.y1) {
                    ((eg.y1) childAt).s();
                }
            }
        }
    }
}
