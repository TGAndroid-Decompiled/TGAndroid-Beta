package qh;

import android.content.Context;
import android.graphics.Bitmap;
public final class r4 extends dg.o1 {
    public final e9 B;

    public r4(e9 e9Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, c1Var, bitmap, bitmap2, baVar);
        this.B = e9Var;
    }

    @Override
    public final void g(dg.m mVar) {
        int indexOf = dg.m.f4581a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        e9 e9Var = this.B;
        e9Var.f44935h1.b(indexOf);
        e9Var.g(mVar);
    }
}
