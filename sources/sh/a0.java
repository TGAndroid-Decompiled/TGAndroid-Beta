package sh;

import android.view.View;
import org.telegram.ui.Components.c81;
public final class a0 extends c81 {
    public final i0 f44386a;

    public a0(i0 i0Var) {
        this.f44386a = i0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((f0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        i0 i0Var = this.f44386a;
        if (i10 == 2) {
            return i0Var.f44423x;
        }
        if (i10 == 0) {
            return i0Var.v;
        }
        return i0Var.f44422w;
    }

    @Override
    public final int e() {
        if (this.f44386a.K) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f44386a.K || i10 == 2) {
            return 2;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
