package sg;

import android.view.View;
public final class x0 implements View.OnClickListener {
    public final int f42023a;
    public final c1 f42024b;

    public x0(c1 c1Var, int i10) {
        this.f42023a = i10;
        this.f42024b = c1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42023a) {
            case 0:
                c1 c1Var = this.f42024b;
                c1Var.f41883e0.clear();
                c1Var.Y.d.b(true);
                c1Var.b0(true, false);
                return;
            default:
                this.f42024b.W(false);
                return;
        }
    }
}
