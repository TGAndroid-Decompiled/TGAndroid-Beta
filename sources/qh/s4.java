package qh;

import android.content.Context;
import android.graphics.Bitmap;
public final class s4 extends dg.o1 {
    public final f9 B;

    public s4(f9 f9Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, c1Var, bitmap, bitmap2, baVar);
        this.B = f9Var;
    }

    @Override
    public final void g(dg.m mVar) {
        int indexOf = dg.m.f4581a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        f9 f9Var = this.B;
        f9Var.f44958h1.b(indexOf);
        f9Var.g(mVar);
    }
}
