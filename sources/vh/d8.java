package vh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
import org.telegram.ui.Components.s9;
public final class d8 extends k4 {
    public final o8 C0;

    public d8(o8 o8Var, Activity activity, s9 s9Var, j4 j4Var) {
        super(activity, s9Var, j4Var);
        this.C0 = o8Var;
    }

    @Override
    public final void b() {
        n5 n5Var = this.d;
        if (n5Var != null && !n5Var.f51555u) {
            if (this.f51417n != null) {
                Matrix matrix = n5Var.f51542n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f51537k0;
                if (i10 < 0) {
                    i10 = this.f51409f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f51539l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f51533i0, getHeight() / this.d.f51535j0);
                Matrix matrix3 = this.f51414j0;
                matrix3.reset();
                this.f51413i0.invert(matrix3);
                this.f51417n.setTransform(matrix2);
                this.f51417n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        s7 s7Var;
        o8 o8Var = this.C0;
        n5 n5Var = o8Var.K1;
        if (n5Var != null && n5Var.f51555u && n5Var.K && (s7Var = o8Var.f51672v1) != null && s7Var.A0 != null) {
            for (int i10 = 0; i10 < o8Var.f51672v1.A0.getChildCount(); i10++) {
                View childAt = o8Var.f51672v1.A0.getChildAt(i10);
                if (childAt instanceof jg.j1) {
                    ((jg.j1) childAt).s();
                }
            }
        }
    }
}
