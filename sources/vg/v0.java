package vg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f50264a;
    public final z0 f50265b;

    public v0(z0 z0Var, int i10) {
        this.f50264a = i10;
        this.f50265b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50264a) {
            case 0:
                z0 z0Var = this.f50265b;
                z0Var.f50282e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f50265b.W(false);
                return;
        }
    }
}
