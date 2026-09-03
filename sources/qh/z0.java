package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d81;
public final class z0 extends d81 {
    public final boolean f46380a;
    public final Context f46381b;
    public final x1 f46382c;

    public z0(x1 x1Var, boolean z4, Context context) {
        this.f46382c = x1Var;
        this.f46380a = z4;
        this.f46381b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        i1 i1Var = (i1) view;
        if (this.f46380a) {
            i10 = 1;
        }
        i1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f46381b;
        x1 x1Var = this.f46382c;
        if (i10 == 1) {
            return new h1(x1Var, context);
        }
        return new n1(x1Var, context);
    }

    @Override
    public final int e() {
        if (this.f46380a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (i10 != 0 && i10 != 1) {
            return 1;
        }
        return 0;
    }
}
