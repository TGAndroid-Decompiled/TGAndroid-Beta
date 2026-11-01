package vh;

import android.view.View;
public final class o5 implements View.OnClickListener {
    public final int f51614a;
    public final t5 f51615b;

    public o5(t5 t5Var, int i10) {
        this.f51614a = i10;
        this.f51615b = t5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51614a) {
            case 0:
                this.f51615b.e1();
                return;
            default:
                this.f51615b.h1();
                return;
        }
    }
}
