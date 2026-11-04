package vg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
public final class v1 extends xp {
    public final w1 E;

    public v1(w1 w1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.E = w1Var;
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        w1 w1Var = this.E;
        if (w1Var.d) {
            super.setBounds(i3, (int) (i10 - w1Var.N), i11, i12);
        } else {
            super.setBounds(i3, i10, i11, (int) (i12 + w1Var.N));
        }
    }
}
