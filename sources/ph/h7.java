package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;
public final class h7 extends c81 {
    public final int f41714a;
    public final Context f41715b;
    public final f8 f41716c;

    public h7(f8 f8Var, Context context, int i10) {
        this.f41714a = i10;
        this.f41716c = f8Var;
        this.f41715b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f41714a) {
            case 0:
                ((z7) view).b(i11);
                return;
            default:
                ((z7) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f41714a) {
            case 0:
                return new z7(this.f41716c, this.f41715b);
            default:
                return new z7(this.f41716c, this.f41715b);
        }
    }

    @Override
    public final int e() {
        switch (this.f41714a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f41714a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f41716c.J;
            default:
                return 5;
        }
    }
}
