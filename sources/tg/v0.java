package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f47113a;
    public final z0 f47114b;

    public v0(z0 z0Var, int i10) {
        this.f47113a = i10;
        this.f47114b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47113a) {
            case 0:
                z0 z0Var = this.f47114b;
                z0Var.f47132e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f47114b.U(false);
                return;
        }
    }
}
