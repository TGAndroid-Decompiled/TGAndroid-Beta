package ug;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f46399a;
    public final z0 f46400b;

    public v0(z0 z0Var, int i10) {
        this.f46399a = i10;
        this.f46400b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46399a) {
            case 0:
                z0 z0Var = this.f46400b;
                z0Var.f46417e0.clear();
                z0Var.Y.d.b(true);
                z0Var.c0(true, false);
                return;
            default:
                this.f46400b.X(false);
                return;
        }
    }
}
