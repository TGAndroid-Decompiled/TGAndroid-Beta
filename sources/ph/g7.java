package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;
public final class g7 extends c81 {
    public final int f41722a;
    public final Context f41723b;
    public final e8 f41724c;

    public g7(e8 e8Var, Context context, int i10) {
        this.f41722a = i10;
        this.f41724c = e8Var;
        this.f41723b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f41722a) {
            case 0:
                ((y7) view).b(i11);
                return;
            default:
                ((y7) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f41722a) {
            case 0:
                return new y7(this.f41724c, this.f41723b);
            default:
                return new y7(this.f41724c, this.f41723b);
        }
    }

    @Override
    public final int e() {
        switch (this.f41722a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f41722a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f41724c.J;
            default:
                return 5;
        }
    }
}
