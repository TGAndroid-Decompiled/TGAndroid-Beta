package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f43512a;
    public final z0 f43513b;

    public v0(z0 z0Var, int i10) {
        this.f43512a = i10;
        this.f43513b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43512a) {
            case 0:
                z0 z0Var = this.f43513b;
                z0Var.f43530e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f43513b.W(false);
                return;
        }
    }
}
