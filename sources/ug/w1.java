package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lq;
public final class w1 extends lq {
    public final x1 E;

    public w1(x1 x1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.E = x1Var;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        x1 x1Var = this.E;
        if (x1Var.d) {
            super.setBounds(i7, (int) (i10 - x1Var.N), i11, i12);
        } else {
            super.setBounds(i7, i10, i11, (int) (i12 + x1Var.N));
        }
    }
}
