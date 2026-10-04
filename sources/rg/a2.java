package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.sq;
public final class a2 extends sq {
    public final b2 f46049y;

    public a2(b2 b2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f46049y = b2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        b2 b2Var = this.f46049y;
        if (b2Var.d) {
            super.setBounds(i10, (int) (i11 - b2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + b2Var.M));
        }
    }
}
