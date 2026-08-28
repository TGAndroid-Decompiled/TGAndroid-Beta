package zf;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;
public final class y1 extends fq {
    public final z1 f50785y;

    public y1(z1 z1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f50785y = z1Var;
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        z1 z1Var = this.f50785y;
        if (z1Var.d) {
            super.setBounds(i9, (int) (i10 - z1Var.I), i11, i12);
        } else {
            super.setBounds(i9, i10, i11, (int) (i12 + z1Var.I));
        }
    }
}
