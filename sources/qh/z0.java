package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e81;
public final class z0 extends e81 {
    public final boolean f46367a;
    public final Context f46368b;
    public final y1 f46369c;

    public z0(y1 y1Var, boolean z4, Context context) {
        this.f46369c = y1Var;
        this.f46367a = z4;
        this.f46368b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        j1 j1Var = (j1) view;
        if (this.f46367a) {
            i10 = 1;
        }
        j1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f46368b;
        y1 y1Var = this.f46369c;
        if (i10 == 1) {
            return new i1(y1Var, context);
        }
        return new o1(y1Var, context);
    }

    @Override
    public final int e() {
        if (this.f46367a) {
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
