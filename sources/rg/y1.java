package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.rq;
public final class y1 extends rq {
    public final z1 f42835y;

    public y1(z1 z1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f42835y = z1Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        z1 z1Var = this.f42835y;
        if (z1Var.d) {
            super.setBounds(i10, (int) (i11 - z1Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + z1Var.M));
        }
    }
}
