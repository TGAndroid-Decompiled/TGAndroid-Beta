package ph;

import android.content.Context;
import android.graphics.Bitmap;
public final class s4 extends cg.p1 {
    public final h9 B;

    public s4(h9 h9Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, d1Var, bitmap, bitmap2, baVar);
        this.B = h9Var;
    }

    @Override
    public final void g(cg.m mVar) {
        int indexOf = cg.m.f2447a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        h9 h9Var = this.B;
        h9Var.f41339h1.b(indexOf);
        h9Var.x(mVar);
    }
}
