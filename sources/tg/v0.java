package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f47120a;
    public final z0 f47121b;

    public v0(z0 z0Var, int i10) {
        this.f47120a = i10;
        this.f47121b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47120a) {
            case 0:
                z0 z0Var = this.f47121b;
                z0Var.f47139e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f47121b.U(false);
                return;
        }
    }
}
