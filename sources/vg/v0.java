package vg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f50302a;
    public final z0 f50303b;

    public v0(z0 z0Var, int i10) {
        this.f50302a = i10;
        this.f50303b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50302a) {
            case 0:
                z0 z0Var = this.f50303b;
                z0Var.f50320e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f50303b.W(false);
                return;
        }
    }
}
