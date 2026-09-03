package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d81;
public final class e7 extends d81 {
    public final int f45304a;
    public final Context f45305b;
    public final c8 f45306c;

    public e7(c8 c8Var, Context context, int i10) {
        this.f45304a = i10;
        this.f45306c = c8Var;
        this.f45305b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f45304a) {
            case 0:
                ((w7) view).b(i11);
                return;
            default:
                ((w7) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f45304a) {
            case 0:
                return new w7(this.f45306c, this.f45305b);
            default:
                return new w7(this.f45306c, this.f45305b);
        }
    }

    @Override
    public final int e() {
        switch (this.f45304a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f45304a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f45306c.J;
            default:
                return 5;
        }
    }
}
