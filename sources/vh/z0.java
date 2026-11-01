package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p71;
public final class z0 extends p71 {
    public final boolean f52241a;
    public final Context f52242b;
    public final u1 f52243c;

    public z0(u1 u1Var, boolean z10, Context context) {
        this.f52243c = u1Var;
        this.f52241a = z10;
        this.f52242b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        h1 h1Var = (h1) view;
        if (this.f52241a) {
            i10 = 1;
        }
        h1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f52242b;
        u1 u1Var = this.f52243c;
        if (i10 == 1) {
            return new g1(u1Var, context);
        }
        return new l1(u1Var, context);
    }

    @Override
    public final int e() {
        if (this.f52241a) {
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
