package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e81;
public final class f7 extends e81 {
    public final int f45330a;
    public final Context f45331b;
    public final d8 f45332c;

    public f7(d8 d8Var, Context context, int i10) {
        this.f45330a = i10;
        this.f45332c = d8Var;
        this.f45331b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f45330a) {
            case 0:
                ((x7) view).b(i11);
                return;
            default:
                ((x7) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f45330a) {
            case 0:
                return new x7(this.f45332c, this.f45331b);
            default:
                return new x7(this.f45332c, this.f45331b);
        }
    }

    @Override
    public final int e() {
        switch (this.f45330a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f45330a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f45332c.J;
            default:
                return 5;
        }
    }
}
