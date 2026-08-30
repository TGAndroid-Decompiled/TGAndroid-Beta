package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;
public final class z0 extends c81 {
    public final boolean f42640a;
    public final Context f42641b;
    public final y1 f42642c;

    public z0(y1 y1Var, boolean z4, Context context) {
        this.f42642c = y1Var;
        this.f42640a = z4;
        this.f42641b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        j1 j1Var = (j1) view;
        if (this.f42640a) {
            i10 = 1;
        }
        j1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f42641b;
        y1 y1Var = this.f42642c;
        if (i10 == 1) {
            return new i1(y1Var, context);
        }
        return new o1(y1Var, context);
    }

    @Override
    public final int e() {
        if (this.f42640a) {
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
