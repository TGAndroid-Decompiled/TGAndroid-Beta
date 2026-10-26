package vg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f50267a;
    public final z0 f50268b;

    public v0(z0 z0Var, int i10) {
        this.f50267a = i10;
        this.f50268b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50267a) {
            case 0:
                z0 z0Var = this.f50268b;
                z0Var.f50285e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f50268b.W(false);
                return;
        }
    }
}
