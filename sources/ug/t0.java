package ug;

import android.view.View;
public final class t0 implements View.OnClickListener {
    public final int f47780a;
    public final x0 f47781b;

    public t0(x0 x0Var, int i10) {
        this.f47780a = i10;
        this.f47781b = x0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47780a) {
            case 0:
                x0 x0Var = this.f47781b;
                x0Var.f47798e0.clear();
                x0Var.Y.d.b(true);
                x0Var.c0(true, false);
                return;
            default:
                this.f47781b.X(false);
                return;
        }
    }
}
