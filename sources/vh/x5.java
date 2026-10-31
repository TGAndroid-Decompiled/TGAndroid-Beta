package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o71;
public final class x5 extends o71 {
    public final int f52170a;
    public final Context f52171b;
    public final w6 f52172c;

    public x5(w6 w6Var, Context context, int i10) {
        this.f52170a = i10;
        this.f52172c = w6Var;
        this.f52171b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f52170a) {
            case 0:
                ((r6) view).b(i11);
                return;
            default:
                ((r6) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f52170a) {
            case 0:
                return new r6(this.f52172c, this.f52171b);
            default:
                return new r6(this.f52172c, this.f52171b);
        }
    }

    @Override
    public final int e() {
        switch (this.f52170a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f52170a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f52172c.D1;
            default:
                return 5;
        }
    }
}
