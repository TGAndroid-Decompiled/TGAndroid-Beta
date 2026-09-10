package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.vq;
public final class z1 extends vq {
    public final a2 f41000y;

    public z1(a2 a2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f41000y = a2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        a2 a2Var = this.f41000y;
        if (a2Var.d) {
            super.setBounds(i10, (int) (i11 - a2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + a2Var.M));
        }
    }
}
