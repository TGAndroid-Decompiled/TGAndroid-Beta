package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;
public final class z0 extends c81 {
    public final boolean f42680a;
    public final Context f42681b;
    public final y1 f42682c;

    public z0(y1 y1Var, boolean z4, Context context) {
        this.f42682c = y1Var;
        this.f42680a = z4;
        this.f42681b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        i1 i1Var = (i1) view;
        if (this.f42680a) {
            i10 = 1;
        }
        i1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f42681b;
        y1 y1Var = this.f42682c;
        if (i10 == 1) {
            return new h1(y1Var, context);
        }
        return new n1(y1Var, context);
    }

    @Override
    public final int e() {
        if (this.f42680a) {
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
