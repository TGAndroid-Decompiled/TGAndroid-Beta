package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
public final class s1 extends xp {
    public final t1 D;

    public s1(t1 t1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.D = t1Var;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        t1 t1Var = this.D;
        if (t1Var.d) {
            super.setBounds(i7, (int) (i10 - t1Var.M), i11, i12);
        } else {
            super.setBounds(i7, i10, i11, (int) (i12 + t1Var.M));
        }
    }
}
