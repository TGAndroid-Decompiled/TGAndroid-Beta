package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f43498a;
    public final z0 f43499b;

    public v0(z0 z0Var, int i10) {
        this.f43498a = i10;
        this.f43499b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43498a) {
            case 0:
                z0 z0Var = this.f43499b;
                z0Var.f43516e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f43499b.W(false);
                return;
        }
    }
}
