package vh;

import android.view.View;
public final class o5 implements View.OnClickListener {
    public final int f51599a;
    public final t5 f51600b;

    public o5(t5 t5Var, int i10) {
        this.f51599a = i10;
        this.f51600b = t5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51599a) {
            case 0:
                this.f51600b.e1();
                return;
            default:
                this.f51600b.h1();
                return;
        }
    }
}
