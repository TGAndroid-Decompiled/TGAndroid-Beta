package sg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;
public final class b2 extends oq {
    public final c2 f46029y;

    public b2(c2 c2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f46029y = c2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        c2 c2Var = this.f46029y;
        if (c2Var.d) {
            super.setBounds(i10, (int) (i11 - c2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + c2Var.M));
        }
    }
}
